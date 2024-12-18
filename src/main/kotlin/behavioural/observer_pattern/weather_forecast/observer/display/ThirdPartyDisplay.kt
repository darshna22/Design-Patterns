package src.main.kotlin.behavioural.observer_pattern.weather_forecast.observer.display

import src.main.kotlin.behavioural.observer_pattern.weather_forecast.observer.Observer

class ThirdPartyDisplay : DisplayElement, Observer {
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f
    private var pressure: Float = 0.0f

    override fun display() {
        println("Weather Stats: Temperature $temperature, Humidity $humidity, Pressure $pressure")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }
}