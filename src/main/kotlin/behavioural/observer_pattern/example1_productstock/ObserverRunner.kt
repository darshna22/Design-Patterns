package src.main.kotlin.behavioural.observer_pattern.example1_productstock

import src.main.kotlin.behavioural.observer_pattern.example1_productstock.observable.IPhoneObservableImpl
import src.main.kotlin.behavioural.observer_pattern.example1_productstock.observer.EmailAlertObserverImpl
import src.main.kotlin.behavioural.observer_pattern.example1_productstock.observer.MobileAlertObserverImpl

fun main(args: Array<String>) {
    val stockObservable = IPhoneObservableImpl()
    val notificationObserver1 = EmailAlertObserverImpl("darshna@gmail.com", stockObservable)
    val notificationObserver2 = MobileAlertObserverImpl("9999999999", stockObservable)

    //subscribe observer to observable
    stockObservable.subscribeObserver(notificationObserver1)
    stockObservable.subscribeObserver(notificationObserver2)

    //add iphone quantity
    stockObservable.setQuantity(2)

}