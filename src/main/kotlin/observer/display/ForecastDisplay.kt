package observer.display

import observer.data.WeatherData
import observer.observer.Observer

class ForecastDisplay(
    var weatherData: WeatherData
): DisplayElement, Observer {
    private var currentPressure = 29.92f
    private var lastPressure: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("Forecast: ${getForecast()}")
    }

    override fun update() {
        lastPressure = currentPressure
        currentPressure = weatherData.pressure
        display()
    }

    private fun getForecast(): String {
        return when {
            currentPressure > lastPressure -> "Improving weather on the way!"
            currentPressure == lastPressure -> "More of the same"
            currentPressure < lastPressure -> "Watch out for cooler, rainy weather"
            else -> "Error"
        }
    }
}