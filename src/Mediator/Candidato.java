package Mediator;

class Candidato {
    private String nome;
    private Mediator mediador;

    Candidato(String nome) {
        this.nome = nome;
    }

    void falar(int tempo) {
        System.out.println(String.format("%d segundos", tempo));
        this.mediador.candidatoTerminou();
    }

    String getNome(){
        return this.nome;
    }

    void setMediador(Mediator mediador){
        this.mediador = mediador;
    }
}
