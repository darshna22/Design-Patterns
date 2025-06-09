package src.main.kotlin.creational.factory.send_notification.notification_creator

import src.main.kotlin.creational.factory.send_notification.notification.EmailNotification
import src.main.kotlin.creational.factory.send_notification.notification.Notification

class EmailNotificationCreator: NotificationCreator() {
    override fun createNotification(): Notification {
        return EmailNotification()
    }
}