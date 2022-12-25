package src.main.kotlin.behavioural.observer_pattern.example1_productstock.observable

import src.main.kotlin.behavioural.observer_pattern.example1_productstock.observer.NotificationObserver


class IPhoneObservableImpl : StockObservable {
    private var stockNo = 0
    private val observersList = mutableListOf<NotificationObserver>()
    override fun subscribeObserver(notificationObserver: NotificationObserver) {
        observersList.add(notificationObserver)
    }

    override fun unSubscribeObserver(notificationObserver: NotificationObserver) {
        observersList.add(notificationObserver)
    }

    override fun notifyUser() {
        for (observer in observersList) {
            observer.update()
        }
    }

    override fun getQuantity(): Int {
        return stockNo
    }

    override fun setQuantity(quantity: Int) {
        stockNo += quantity
        if (stockNo != 0) notifyUser()
    }


}