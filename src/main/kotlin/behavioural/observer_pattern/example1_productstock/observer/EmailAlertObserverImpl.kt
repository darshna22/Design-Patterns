package src.main.kotlin.behavioural.observer_pattern.example1_productstock.observer

import src.main.kotlin.behavioural.observer_pattern.example1_productstock.observable.StockObservable
import src.main.kotlin.behavioural.observer_pattern.example2_youtube.observer.YoutubeNotificationObserver

class EmailAlertObserverImpl(val emailId: String, val stockObservable: StockObservable) : NotificationObserver {

    override fun update() {
        sendEmail()
    }

    private fun sendEmail() {
        println("mail sent to $emailId \n ${stockObservable.getQuantity()} products in stock hurry up ")
    }
}