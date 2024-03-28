
public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        SensorDisplay display = new SensorDisplay(sensor);
        sensor.addObserver(display);
        sensor.setState(-5);
        sensor.setState(5);
        sensor.setState(0);
        sensor.setState(10);
        sensor.setState(-1);
    }
}

