public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    Observer statisticsDisplay = new StatisticsDisplay(weatherData);
    Observer forecastDisplay = new ForecastDisplay(weatherData);

    System.out.println("\n>>현재상태 디스플레이, 기상예보 디스플레이를 추가합니다.");
    weatherData.registerObserver(currentConditionsDisplay);
    weatherData.registerObserver(forecastDisplay);
    weatherData.setWeatherData(3, 5, 7);

    System.out.println("\n>>통계 디스플레이를 추가합니다.");
    weatherData.registerObserver(statisticsDisplay);
    weatherData.setWeatherData(20, 30, 80);

    System.out.println("\n>>현재 상태 디스플레이를 제거합니다.");
    weatherData.removeObserver(currentConditionsDisplay);
    weatherData.setWeatherData(25, 30, 80);

  }

}
