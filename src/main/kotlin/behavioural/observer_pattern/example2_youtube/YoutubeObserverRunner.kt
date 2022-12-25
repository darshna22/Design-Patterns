package src.main.kotlin.behavioural.observer_pattern.example2_youtube

import src.main.kotlin.behavioural.observer_pattern.example2_youtube.observable.ChannelObservableImpl
import src.main.kotlin.behavioural.observer_pattern.example2_youtube.observer.YoutubeEmailAlertObserverImpl
import src.main.kotlin.behavioural.observer_pattern.example2_youtube.observer.YoutubeInAppAlertObserverImpl
import src.main.kotlin.behavioural.observer_pattern.example2_youtube.observer.YoutubeWhatsAppAlertObserverImpl


fun main(args: Array<String>) {
    val channelObservable = ChannelObservableImpl()
    val notificationObserver1 = YoutubeEmailAlertObserverImpl("darshna@gmail.com", channelObservable)
    val notificationObserver2 = YoutubeWhatsAppAlertObserverImpl("9999999999", channelObservable)
    val notificationObserver3 = YoutubeInAppAlertObserverImpl("darshna@gmail.com", channelObservable)

    //subscribe observer to observable
    channelObservable.subscribeObserver(notificationObserver1)
    channelObservable.subscribeObserver(notificationObserver2)

    //add blog to channel
    channelObservable.addBlogs(2)

}