package src.main.kotlin.creational.factory.notification

import creational.factory.notification.Notification

class PushNotification: Notification {
    override fun notifyUser() {
        println("Sending push notification")
    }
}