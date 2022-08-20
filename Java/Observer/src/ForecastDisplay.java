public class ForecastDisplay implements Observer, DisplayElement{

  private float currentPressure = 29.92f;
  private float lastPressure;
  private WeatherData weatherData;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {
    lastPressure = currentPressure;
    currentPressure = weatherData.getPressure();

    display();
  }

  @Override
  public void display() {
    System.out.print("기상예보: ");
    if (currentPressure > lastPressure) {
      System.out.println("고기압으로~ 날씨가 좋아졌어요");
    } else if (currentPressure == lastPressure) {
      System.out.println("기압이 똑같아요");
    } else if (currentPressure < lastPressure) {
      System.out.println("저기압으로~ 비가 올 수도 있어요");
    }
  }

}
