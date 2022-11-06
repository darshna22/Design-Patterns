package creational.factory.notification

class EmailNotification:Notification {
    override fun notifyUser() {
        println("Sending email notification")
    }
}