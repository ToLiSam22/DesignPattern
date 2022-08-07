package chapter1

import WeatherData
import chapter2_observer.CurrentConditionDisplay
import chapter2_observer.StatisticsDisplay
import kotlin.properties.Delegates

object WeatherApplication {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val currentConditionDisplay = CurrentConditionDisplay()
        val statisticsDisplay = StatisticsDisplay()

        var weatherData: WeatherData by Delegates.observable(WeatherData()) { property, oldValue, newValue ->
            currentConditionDisplay.update(newValue)
            currentConditionDisplay.display()
            statisticsDisplay.update(newValue)
            statisticsDisplay.display()
            println("")
        }

        weatherData = WeatherData(80.0, 65.0, 30.4)
        weatherData = WeatherData(82.0, 70.0, 29.2)
        weatherData = WeatherData(78.0, 90.0, 29.2)
    }
}