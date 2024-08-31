public class Application {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);

        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
