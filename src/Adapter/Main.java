package Adapter;

public class Main {

    public static void main(String[] args) {
        TelevisaoVelha tv = new TelevisaoVelha();
        tv.ligarTomadaDoisPinos(true, true);

        Adapter benjamin = new Adapter(tv);

        benjamin.ligarTomadaTresPinos(true, true, false);
    }
}
