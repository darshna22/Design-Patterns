package src.main.kotlin.behavioural.observer_pattern.example1_productstock.observer

import src.main.kotlin.behavioural.observer_pattern.example1_productstock.observable.StockObservable

class MobileAlertObserverImpl(private val mobileNo: String, private val stockObservable: StockObservable) :
    NotificationObserver {

    override fun update() {
        sendEmail()
    }

    private fun sendEmail() {
        println("msg sent to $mobileNo \n ${stockObservable.getQuantity()} products in stock hurry up ")
    }
}