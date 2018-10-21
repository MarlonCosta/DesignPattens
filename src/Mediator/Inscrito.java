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

    void notificar(Candidato cand) {

        if (this.candidato == cand) {
            System.out.println(String.format("%s, seu candidato(a) está falando.", this.nome));
        } else {
            System.out.println(String.format("%s, o(a) candidato(a) %s está falando.", this.nome, cand.getNome()));
        }
    }

    Candidato getCandidato() {
        return candidato;
    }
}
