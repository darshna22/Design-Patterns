package src.main.kotlin.creational.factory.send_notification.notification

class PushNotification: Notification {
    override fun send(msg: String) {
        println(msg)
    }
}