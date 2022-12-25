package src.main.kotlin.behavioural.observer_pattern.example1_productstock.observable

import src.main.kotlin.behavioural.observer_pattern.example1_productstock.observer.NotificationObserver


interface StockObservable {
    fun subscribeObserver(notificationObserver: NotificationObserver)
    fun unSubscribeObserver(notificationObserver: NotificationObserver)
    fun notifyUser()
    fun getQuantity(): Int
    fun setQuantity(quantity:Int)
}