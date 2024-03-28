import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;
    private int weight;
    private String color;



    public void setState(int temperature) {
        this.temperature = temperature;
        if (temperature <= 0) {
            color = "WHITE";
            weight = 1;
        } else {
            color = "BLACK";
            weight = 1 + 2 * temperature;
        }
        notifyObservers();
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getTemperature() {
        return temperature;
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
