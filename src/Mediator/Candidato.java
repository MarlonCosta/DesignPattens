package Mediator;

class Candidato {
    private String nome;
    private Mediator mediador;
    private boolean micOn = false;

    Candidato(String nome) {
        this.nome = nome;
    }

    void falar(int tempo) {
        System.out.println(String.format("\n%s fala por %d segundos\n", this.nome, tempo));
        try {
            Thread.sleep(tempo*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.mediador.candidatoTerminou();
    }

    void micSwitch() {
        this.micOn = !this.micOn;
        if (this.micOn){
            System.out.println(String.format("Microfone do candidato(a) %s ligado", this.getNome()));
        }
        else{
            System.out.println(String.format("Microfone do candidato(a) %s desligado", this.getNome()));
        }

    }

    String getNome() {
        return this.nome;
    }

    void setMediador(Mediator mediador) {
        this.mediador = mediador;
    }
}
