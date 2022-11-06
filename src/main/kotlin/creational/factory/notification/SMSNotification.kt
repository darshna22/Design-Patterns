package creational.factory.notification

class SMSNotification:Notification {
    override fun notifyUser() {
        println("Sending sms notification")
    }
}