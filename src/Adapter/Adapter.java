package Adapter;

public class Adapter implements PlugTresPinos{

    public Adapter(TelevisaoVelha tv) {
        this.tv = tv;
    }

    private TelevisaoVelha tv;

    @Override
    public void ligarTomadaTresPinos(boolean fase, boolean neutro, boolean terra) {
        tv.ligarTomadaDoisPinos(fase, neutro);

    }
}
