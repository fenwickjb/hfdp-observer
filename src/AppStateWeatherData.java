/*
  AppStateWeatherData.java

  Based on Head First Design Patterns
  @author Jay Fenwick
  @version 2018
*/

public class AppStateWeatherData implements WeatherDataInterface {
    WeatherData weatherStation;

    CurrentConditionsDisplay condDisplay;
    StatisticsDisplay statDisplay;
    ForecastDisplay forecastDisplay;
    

    public AppStateWeatherData(WeatherData station) {
	// Setup two-way connection
	weatherStation = station;
	station.connect(this);

	condDisplay = new CurrentConditionsDisplay();
	statDisplay = new StatisticsDisplay();
	forecastDisplay = new ForecastDisplay();
    }
    
    /* WeatherDataInterface API */
    public void measurementsChanged() {
	float t = weatherStation.getCurrTemp();
	float h = weatherStation.getCurrHumid();
	float p = weatherStation.getCurrPress();

	condDisplay.update(t, h, p);
	statDisplay.update(t, h, p);
	forecastDisplay.update(t, h, p);
    }

}