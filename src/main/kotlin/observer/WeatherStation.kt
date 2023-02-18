package observer

import observer.data.WeatherData
import observer.display.CurrentConditionalDisplay
import observer.display.ForecastDisplay
import observer.display.HeatIndexDisplay
import observer.display.StatisticsDisplay

class WeatherStation {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val weatherData = WeatherData()
            val currentDisplay = CurrentConditionalDisplay(weatherData)
            val statisticsDisplay = StatisticsDisplay(weatherData)
            val forecastDisplay = ForecastDisplay(weatherData)
            val heatIndexDisplay = HeatIndexDisplay(weatherData)
            weatherData.setMeasurements(80f, 65f, 30.4f)
            weatherData.setMeasurements(82f, 70f, 29.2f)
            weatherData.setMeasurements(78f, 90f, 29.2f)
        }
    }
}