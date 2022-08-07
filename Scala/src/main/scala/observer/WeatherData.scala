package observer

import scala.collection.mutable.ArrayBuffer

class WeatherData extends Subject {
  private val observers: ArrayBuffer[Observer] = ArrayBuffer[Observer]()
  private var temperature: Float = 0.0f
  private var humidity: Float = 0.0f
  private var pressure: Float = 0.0f

  def getTemperature(): Float = temperature

  def getHumidity(): Float = humidity

  def getPressure(): Float = pressure

  override def registerObserver(observer: Observer): Unit = observers += observer

  override def removeObserver(observer: Observer): Unit = observers -= observer

  override def notifyObservers(): Unit = observers.foreach(_.update())

  def measurementsChanged(): Unit = notifyObservers()

  def setMeasurements(t: Float, h: Float, p: Float): Unit = {
    temperature = t
    humidity = h
    pressure = p
    measurementsChanged()
  }
}
