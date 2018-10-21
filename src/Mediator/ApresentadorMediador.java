package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ApresentadorMediador implements Mediator {
    private String nome;
    private Candidato cand1, cand2, candAtual;
    private int[] timers;
    private int etapa = 0;
    private List<Inscrito> inscritos = new ArrayList<Inscrito>();


    ApresentadorMediador(String nome, int[] timers) {
        this.nome = nome;
        this.timers = timers;
    }

    public void notificarInscritos() {

        /* Notifica os inscritos se o seu candidato está falando.
         * Caso o inscrito não tenha especificado um candidato a seguir,
         * será notificado de qualquer mudança
         */

        for (Inscrito inscrito :
                this.inscritos
        ) {
            if (inscrito.getCandidato() == candAtual | inscrito.getCandidato() == null)
                inscrito.notificar(candAtual);
        }
    }

    public void candidatoTerminou() {

        /* Método que avisa o mediador a fala do candidato chegou ao fim,
         * assim, permitindo as chamadas adequadas para prosseguir o debate
         */

        etapa++;
        mudaCandidato();
        proximaEtapa();
    }

    public void proximaEtapa() {
        /* Método que avança a etapa do debate, na seguinte ordem:
        Pergunta > Resposta > Réplica > Tréplica
         */


        //Por motivos sobrenaturais o switch/case estava bugando
        if (etapa == 0) {
            candAtual.micSwitch();
            System.out.println(String.format("%s: Agora o(a) candidato(a) %s irá perguntar ao candidato(a) %s.\n" +
                    "Candidato(a) %s, você tem %d segundos para a pergunta.", this.nome, this.cand1.getNome(), this.cand2.getNome(), this.cand1.getNome(), timers[etapa]));

        } else if (etapa == 1) {
            System.out.println(String.format("%s: Candidato(a) %s, você tem %d segundos para a resposta.", this.nome, this.cand2.getNome(), this.timers[etapa]));
        } else if (etapa == 2) {
            System.out.println(String.format("%s: Candidato(a) %s, você tem %d segundos para a réplica.", this.nome, this.cand1.getNome(), this.timers[etapa]));
        } else if (etapa == 3) {
            System.out.println(String.format("%s: Candidato(a) %s, você tem %d segundos para a tréplica.", this.nome, this.cand2.getNome(), this.timers[etapa]));
        }

        if (etapa >= 4) {
            System.out.println("Pergunta encerrada");
        } else {
            notificarInscritos();
            candAtual.falar(this.timers[etapa]);
        }

    }

    void pergunta(Candidato cand1, Candidato cand2) {
        this.cand1 = cand1;
        this.cand2 = cand2;
        cand1.setMediador(this);
        cand2.setMediador(this);
        candAtual = cand1;
    }

    void addInscrito(Inscrito i) {
        this.inscritos.add(i);
    }

    public void mudaCandidato() {
        candAtual.micSwitch();
        if (this.candAtual == cand1) {
            this.candAtual = cand2;
            candAtual.micSwitch();
        } else if (this.candAtual == cand2) {
            this.candAtual = cand1;
            if (etapa <= 3) candAtual.micSwitch();
        }
    }
}
