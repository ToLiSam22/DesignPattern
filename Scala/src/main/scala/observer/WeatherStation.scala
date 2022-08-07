package observer

object WeatherStation extends App {
  val weatherData: WeatherData = new WeatherData()

  val currentDisplay = new CurrentConditionDisplay(weatherData)
  val statisticsDisplay = new StatisticsDisplay(weatherData)

  weatherData.setMeasurements(80, 65, 30.4f)
  weatherData.setMeasurements(82, 70, 29.2f)
  weatherData.setMeasurements(78, 90, 29.2f)
}
