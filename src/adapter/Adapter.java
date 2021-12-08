package adapter;

public class Adapter implements City {
    private final City city;

    public Adapter(AsianCity city) {
        this.city = city;
    }

    public String getName() {
        return city.getName();
    }

    public double getTemperature() {
        double temperate = city.getTemperature();
        return temperate * 1.8 + 32;
    }

    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        city.setHasWeatherWarning(hasWeatherWarning);
    }
}
