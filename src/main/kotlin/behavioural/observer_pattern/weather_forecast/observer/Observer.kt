package src.main.kotlin.behavioural.observer_pattern.weather_forecast.observer

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}