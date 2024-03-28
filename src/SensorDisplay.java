public class SensorDisplay extends Observer {
    public SensorDisplay(Sensor sensor) {
        super(sensor);
    }
    @Override
    public void update() {
        int temperature = sensor.getTemperature();
        int weight = sensor.getWeight();
        String color = sensor.getColor();
        System.out.println("Temperature: " + temperature + " degree, " +
                "Weight: " + weight + " gr, Color: " + color);

    }
}
