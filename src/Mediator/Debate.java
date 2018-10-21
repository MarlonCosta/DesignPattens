package Mediator;

public class Debate {
    public static void main(String[] args) {
        int [] tempos = {3, 3, 3, 3}; //Pergunta, Resposta, Réplica, Tréplica

        ApresentadorMediador willianBonner = new ApresentadorMediador("Willian Bonner", tempos);

        Candidato ciro = new Candidato("Ciro Gomes");
        Inscrito marlon = new Inscrito("Marlon", ciro);

        Candidato bolsonaro = new Candidato("Bolsonaro");
        Inscrito laerty = new Inscrito("Laerty", bolsonaro);

        Inscrito alberto = new Inscrito("Alberto");

        willianBonner.addInscrito(marlon);
        willianBonner.addInscrito(laerty);
        willianBonner.addInscrito(alberto);

        willianBonner.pergunta(ciro, bolsonaro);
        willianBonner.proximaEtapa();

    }
}
