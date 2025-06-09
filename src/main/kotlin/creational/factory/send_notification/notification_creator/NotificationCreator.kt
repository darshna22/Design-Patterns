package src.main.kotlin.creational.factory.send_notification.notification_creator

import src.main.kotlin.creational.factory.send_notification.notification.Notification

abstract class NotificationCreator {
    abstract fun createNotification():Notification
    fun sendNotification(msg:String){
        val notification=createNotification();
        notification.send(msg)
    }
}