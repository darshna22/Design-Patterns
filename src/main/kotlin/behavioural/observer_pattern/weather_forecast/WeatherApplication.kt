package src.main.kotlin.behavioural.observer_pattern.weather_forecast

import src.main.kotlin.behavioural.observer_pattern.weather_forecast.observable.WeatherData
import src.main.kotlin.behavioural.observer_pattern.weather_forecast.observer.display.StaticsDisplay
import src.main.kotlin.behavioural.observer_pattern.weather_forecast.observer.display.ThirdPartyDisplay

fun main() {
    val weatherData = WeatherData()
    weatherData.subscribeObserver(ThirdPartyDisplay())
    weatherData.subscribeObserver(StaticsDisplay())
    weatherData.setMeasurements(10f, 10f, 10f)
}