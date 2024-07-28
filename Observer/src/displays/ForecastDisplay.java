package displays;

import data.WeatherData;
import interfaces.Displayable;
import interfaces.Observable;
import interfaces.Subjectable;

public class ForecastDisplay implements Displayable , Observable {
    private int temp;
    private int humidity;
    private int pressure;
    private Subjectable weatherData;

    public ForecastDisplay(Subjectable weatherData){
        this.weatherData = weatherData;  // We stored the reference of the subject here to make it easy to un register our self in the future
        weatherData.registerObserver(this);
    }
    public void update(
            int temp,
            int humidity,
            int pressure
    )
    {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;

        this.display();
    }

    public void display()
    {
        System.out.println("----- Forecast Displays : -----");
        System.out.println("Humidity : " + this.humidity);
        System.out.println("Tempreture : " + this.temp);
        System.out.println("Pressure : " + this.pressure);
        System.out.println("--------------------------------");
    }
}
