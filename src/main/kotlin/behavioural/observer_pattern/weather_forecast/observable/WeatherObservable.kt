package src.main.kotlin.behavioural.observer_pattern.weather_forecast.observable

import src.main.kotlin.behavioural.observer_pattern.weather_forecast.observer.Observer

interface WeatherObservable {
    fun subscribeObserver(displayObserver: Observer)
    fun unSubscribeObserver(displayObserver: Observer)
    fun notifyDisplayObserver()
}