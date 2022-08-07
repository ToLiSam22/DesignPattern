package chapter2_observer

import WeatherData
import java.lang.Double.max
import java.lang.Double.min

interface Display {
    fun update(data: WeatherData)
    fun display()
}

class CurrentConditionDisplay(
    var currentWeatherData: WeatherData? = null,
) : Display {
    override fun update(data: WeatherData) {
        this.currentWeatherData = data
    }
    override fun display() {
        println("현재 상태: 온도 ${currentWeatherData?.temperature}F 습도 ${currentWeatherData?.humidity}%")
    }
}

class StatisticsDisplay() : Display{
    var minTemperature = 500.0
    var maxTemperature = 0.0
    var avgTemperature = 0.0
    var nReadings = 0.0

    override fun update(data: WeatherData) {
        minTemperature = min(minTemperature, data.temperature)
        maxTemperature = max(maxTemperature, data.temperature)
        avgTemperature = (avgTemperature*nReadings + data.temperature)/(nReadings+1)
        nReadings += 1
    }

    override fun display() {
        println("평균/최고/최저 온도: ${avgTemperature}/${maxTemperature}/${minTemperature}")
    }
}