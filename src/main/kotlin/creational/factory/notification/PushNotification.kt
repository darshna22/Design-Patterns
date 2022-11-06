package creational.factory.notification

class PushNotification:Notification {
    override fun notifyUser() {
        println("Sending push notification")
    }
}