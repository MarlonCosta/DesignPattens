package Mediator;

public class Debate {
    public static void main(String[] args) {
        ApresentadorMediador willianBonner = new ApresentadorMediador("Willian Bonner");

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
