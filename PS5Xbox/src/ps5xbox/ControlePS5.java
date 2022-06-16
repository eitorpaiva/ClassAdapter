package ps5xbox;

public class ControlePS5 {
    private SensorPS5 sensorAQueSeConecta;
    
    public void conectar(SensorPS5 sensor){
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.conectarPS5();
    }
}
