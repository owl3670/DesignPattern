package observer.display

import observer.data.WeatherData
import observer.observer.Observer

class StatisticsDisplay(
    var weatherData: WeatherData
) : DisplayElement, Observer {
    private var maxTemp: Float = 0.0f
    private var minTemp: Float = 200f
    private var tempSum: Float = 0.0f
    private var numReadings: Int = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("Avg/Max/Min temperature = $tempSum/$maxTemp/$minTemp")
    }

    override fun update() {
        val temperature = weatherData.temperature

        tempSum += temperature
        numReadings++

        if (temperature > maxTemp) {
            maxTemp = temperature
        }

        if (temperature < minTemp) {
            minTemp = temperature
        }

        display()
    }
}