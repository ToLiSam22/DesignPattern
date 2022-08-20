public class CurrentConditionsDisplay implements Observer, DisplayElement{

  private float temperature;
  private float humidity;
  private WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {
    temperature = weatherData.getTemperature();
    humidity = weatherData.getHumidity();

    display();
  }

  @Override
  public void display() {
    System.out.println("현재상태:  온도 " + temperature + "F, 습도 " + humidity + "%");
  }
}
