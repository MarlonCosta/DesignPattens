package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ApresentadorMediador implements Mediator {
    private String nome;
    private Candidato cand1, cand2, candAtual;
    private int[] timers = {3, 9, 3, 3};
    private int etapa = 0;
    private List<Inscrito> inscritos = new ArrayList<Inscrito>();


    ApresentadorMediador(String nome) {
        this.nome = nome;
    }

    public void notificarInscritos() {
        for (Inscrito inscrito :
                this.inscritos
        ) {
            if (inscrito.getCandidato() == candAtual | inscrito.getCandidato() == null)
                inscrito.notificar();
        }
    }

    public void candidatoTerminou() {
        notificarInscritos();
        mudaCandidato();
        etapa++;
        proximaEtapa();
    }

    public void proximaEtapa() {
        //Por motivos sobrenaturais o switch/case estava bugando
        if (etapa == 0) {
            System.out.println(String.format("%s: Agora o candidato %s irá perguntar ao candidato %s.\n" +
                    "Candidato %s, você tem %d segundos para a pergunta.", this.nome, this.cand1.getNome(), this.cand2.getNome(), this.cand1.getNome(), timers[etapa]));
            //    notificarInscritos();
        } else if (etapa == 1) {
            System.out.println(String.format("%s: Candidato %s, você tem %d segundos para a resposta.", this.nome, this.cand2.getNome(), this.timers[etapa]));
        } else if (etapa == 2) {
            System.out.println(String.format("%s: Candidato %s, você tem %d segundos para a réplica.", this.nome, this.cand1.getNome(), this.timers[etapa]));
        } else if (etapa == 3) {
            System.out.println(String.format("%s: Candidato %s, você tem %d segundos para a tréplica.", this.nome, this.cand2.getNome(), this.timers[etapa]));
        }

        if (etapa >= 4) {
            System.out.println("Pergunta encerrada");
        } else {
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
        if (this.candAtual == cand1) {
            this.candAtual = cand2;
        } else if (this.candAtual == cand2) {
            this.candAtual = cand1;
        }
    }
}
