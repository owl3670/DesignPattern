package observer.data

import observer.observer.Observer
import observer.observer.Subject

class WeatherData : Subject {
    private val observers: MutableList<Observer> = mutableListOf()
    var temperature: Float = 0.0f
        private set
    var humidity: Float = 0.0f
        private set
    var pressure: Float = 0.0f
        private set

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val i = observers.indexOf(o)
        if (i >= 0) {
            observers.removeAt(i)
        }
    }

    override fun notifyObservers() {
        observers.forEach { it.update() }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}