package observer

class StatisticsDisplay(weatherData: WeatherData) extends DisplayElement with Observer {
  weatherData.registerObserver(this)
  private var maxTemp: Float = 0.0f
  private var minTemp: Float = 200f
  private var tempSum: Float = 0.0f
  private var numReadings: Int = 0

  override def display(): Unit = println(s"평균/최고/최저 온도: ${tempSum/numReadings}/${maxTemp}/${minTemp}")

  override def update(): Unit = {
    val t = weatherData.getTemperature()
    tempSum += t
    numReadings += 1

    maxTemp = maxTemp.max(t)
    minTemp = minTemp.min(t)

    display()
  }
}
