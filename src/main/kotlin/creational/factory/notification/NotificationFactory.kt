package creational.factory.notification

import src.main.kotlin.creational.factory.notification.PushNotification
import java.lang.IllegalArgumentException

class NotificationFactory {
    fun createFactory(channel:String):Notification?{
        if(channel.isBlank()) return null
        return when(channel){
            "SMS"-> SMSNotification()
            "EMAIL"-> EmailNotification()
            "PUSH"-> PushNotification()
            else -> throw IllegalArgumentException("Unknown Channel $channel")
        }
    }
}