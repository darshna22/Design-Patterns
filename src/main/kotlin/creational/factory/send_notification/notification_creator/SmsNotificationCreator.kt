package src.main.kotlin.creational.factory.send_notification.notification_creator

import src.main.kotlin.creational.factory.send_notification.notification.Notification
import src.main.kotlin.creational.factory.send_notification.notification.SmsNotification

class SmsNotificationCreator : NotificationCreator() {
    override fun createNotification(): Notification {
        return SmsNotification()
    }
}