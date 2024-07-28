package data;

import interfaces.Displayable;
import interfaces.Observable;
import interfaces.Subjectable;

import java.util.ArrayList;

// This is the subject
public class WeatherData implements Subjectable {

    private int temp;
    private int humidity;
    private int pressure;
    // These are the observers
    private ArrayList<Observable> observers = new ArrayList<>();

    public ArrayList<Observable> getDisplayDevices (){
        return this.observers;
    }

    public void registerObserver (Observable observer)
    {
        this.observers.add(observer);
    }

    public void removeObserver (Observable observer)
    {
        this.observers.remove(observer);
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        this.notifyObservers();
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
        this.notifyObservers();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        this.notifyObservers();
    }

    public void notifyObservers()
    {
        for(Observable observer : this.observers){
            observer.update();
        }
    }
}
