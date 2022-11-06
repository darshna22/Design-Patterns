package creational.factory.notification

fun main(args: Array<String>) {

    val notificationFactory = NotificationFactory()

    //Create SMS Notification class object by notification factory class
    val notification1 = notificationFactory.createFactory("SMS")
    notification1?.notifyUser()

    //Create push Notification class object by notification factory class
    val notification2 = notificationFactory.createFactory("PUSH")
    notification2?.notifyUser()

    //Create email Notification class object by notification factory class
    val notification3 = notificationFactory.createFactory("EMAIL")
    notification3?.notifyUser()
}