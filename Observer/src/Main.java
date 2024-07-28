import data.WeatherData;
import displays.ConditionsDisplay;
import displays.ForecastDisplay;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherData weatherHandeler = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherHandeler);
        ConditionsDisplay conditionsDisplay = new ConditionsDisplay(weatherHandeler);

        weatherHandeler.setTemp(240);
        weatherHandeler.setPressure(350);
        weatherHandeler.setTemp(300);

    }
}