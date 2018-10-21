package Mediator;

class Inscrito {
    private Candidato candidato;
    private String nome;

    Inscrito(String nome, Candidato cand) {
        this.nome = nome;
        this.candidato = cand;
    }

    Inscrito(String nome) {
        this.nome = nome;
    }

    void notificar() {
        System.out.println(String.format("%s notificado", this.nome));

    }

    Candidato getCandidato() {
        return candidato;
    }
}
