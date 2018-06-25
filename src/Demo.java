
public class Demo {
    public static void main(String[] args) {
	WeatherData dataSource = new WeatherData();
	AppStateWeatherData ourWeather = new AppStateWeatherData(dataSource);

	System.out.println();
	dataSource.setMeasurements(82, 88, 30.4f);
	System.out.println();
	dataSource.setMeasurements(78, 65, 29.2f);
	System.out.println();
	dataSource.setMeasurements(65, 58, 29.0f);
	System.out.println();
    }
}