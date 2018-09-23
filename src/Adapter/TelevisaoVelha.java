package Adapter;

public class TelevisaoVelha implements PlugDoisPinos {
    @Override
    public void ligarTomadaDoisPinos(boolean fase, boolean neutro) {
        if (fase && neutro) {
            System.out.println("Ligada na tomada!!!");
        }
        else{
            System.out.println("Tomada com defeito!!!");
        }
    }
}