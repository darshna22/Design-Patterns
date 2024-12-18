package src.main.kotlin.behavioural.observer_pattern.weather_forecast.observable

import src.main.kotlin.behavioural.observer_pattern.weather_forecast.observer.Observer

class WeatherData : WeatherObservable {
    val observers = mutableListOf<Observer>()
    private var temperature: Float = 0f
    private var humadity = 0f
    private var pressure = 0f
    override fun subscribeObserver(displayObserver: Observer) {
        observers.add(displayObserver)
    }

    override fun unSubscribeObserver(displayObserver: Observer) {
        if (observers.isNotEmpty())
            observers.remove(displayObserver)
    }

    override fun notifyDisplayObserver() {
        for (displayObserver in observers) {
            displayObserver.update(temperature, humadity, pressure)
        }
    }

    fun setMeasurements(temperature: Float, humadity: Float, pressure: Float) {
        this.temperature = temperature
        this.humadity = humadity
        this.pressure = pressure
        notifyDisplayObserver()
    }
}