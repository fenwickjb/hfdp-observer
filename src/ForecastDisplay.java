
public class ForecastDisplay {
    private float currentPressure = -1;
    private float lastPressure = -1;

    public ForecastDisplay() {
    }

    public void update(float temp, float humidity, float pressure) {
	lastPressure = currentPressure;
	currentPressure = pressure;

	display();
    }

    public void display() {
	System.out.print("Forecast: ");
	
	if (lastPressure < 0) {
	    System.out.println("2+ measurements needed to forecast");
	}
	else if (currentPressure > lastPressure) {
	    System.out.println("Improving weather on the way!");
	} else if (currentPressure == lastPressure) {
	    System.out.println("More of the same");
	} else if (currentPressure < lastPressure) {
	    System.out.println("Watch out for cooler, rainy weather");
	}
    }
}
