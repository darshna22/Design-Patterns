package src.main.kotlin.creational.factory.send_notification.notification

class EmailNotification: Notification {
    override fun send(msg: String) {
        println(msg)
    }
}