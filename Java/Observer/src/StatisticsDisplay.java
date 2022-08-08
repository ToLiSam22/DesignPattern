public class StatisticsDisplay implements Observer, DisplayElement{
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum= 0.0f;
  private int numReadings = 0;
  private WeatherData weatherData;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {
    maxTemp = Math.max(maxTemp, getTemperature());
    minTemp = Math.min(minTemp, getTemperature());
    tempSum += getTemperature();
    numReadings++;

    display();
  }

  @Override
  public void display() {
    System.out.println("통계: 평균 온도 " + getAverageTemperature() + "F, 최고 온도 " + maxTemp + "F, 최저 온도 " + minTemp);
  }

  private float getTemperature() {
    return weatherData.getTemperature();
  }

  private float getAverageTemperature() {
    return tempSum / numReadings;
  }

}
