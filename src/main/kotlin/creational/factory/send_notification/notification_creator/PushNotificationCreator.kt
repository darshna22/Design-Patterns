package src.main.kotlin.creational.factory.send_notification.notification_creator

import src.main.kotlin.creational.factory.send_notification.notification.Notification
import src.main.kotlin.creational.factory.send_notification.notification.PushNotification

class PushNotificationCreator : NotificationCreator() {
    override fun createNotification(): Notification {
        return PushNotification()
    }
}