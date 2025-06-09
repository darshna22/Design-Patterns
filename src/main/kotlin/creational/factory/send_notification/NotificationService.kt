package src.main.kotlin.creational.factory.send_notification

import src.main.kotlin.creational.factory.send_notification.notification_creator.EmailNotificationCreator
import src.main.kotlin.creational.factory.send_notification.notification_creator.NotificationCreator
import src.main.kotlin.creational.factory.send_notification.notification_creator.PushNotificationCreator
import src.main.kotlin.creational.factory.send_notification.notification_creator.SmsNotificationCreator

fun main() {

    //email
    var creator: NotificationCreator = EmailNotificationCreator()
    creator.sendNotification("Hi Welcome to our website")

    //sms
    creator = SmsNotificationCreator()
    creator.sendNotification("Your OTP is 11111")

    //push
    creator = PushNotificationCreator()
    creator.sendNotification("you have new followers")
}