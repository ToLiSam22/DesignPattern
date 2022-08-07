package observer

class CurrentConditionDisplay(weatherData: WeatherData) extends DisplayElement with Observer {
  weatherData.registerObserver(this)
  private var temperature: Float = 0.0f
  private var humidity: Float = 0.0f

  override def display(): Unit = println(s"현재 상태: 온도 ${temperature}F, 습도 ${humidity}%")

  override def update(): Unit = {
    temperature = weatherData.getTemperature()
    humidity = weatherData.getHumidity()
    display()
  }
}
