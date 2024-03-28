public abstract class Observer {
    protected Sensor sensor;

    public Observer(Sensor sensor) {
        this.sensor = sensor;
    }
    public abstract void update();
}
