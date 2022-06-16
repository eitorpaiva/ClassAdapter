package ps5xbox;

public class AdaptadorPS5ParaXbox implements SensorPS5{
    private SensorXbox adaptee;

    public AdaptadorPS5ParaXbox(SensorXbox adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void conectarPS5() {
        adaptee.conectarXbox();
        System.out.println("Controle de PS5 conectado com sucesso!");
    }
}
