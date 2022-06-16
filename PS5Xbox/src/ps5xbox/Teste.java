package ps5xbox;

public class Teste {

    public static void main(String[] args) {
        SensorXbox adaptee = new SensorXbox();
        ControlePS5 target = new ControlePS5();
        AdaptadorPS5ParaXbox adapter = new AdaptadorPS5ParaXbox(adaptee);
        target.conectar(adapter);
    }
    
}
