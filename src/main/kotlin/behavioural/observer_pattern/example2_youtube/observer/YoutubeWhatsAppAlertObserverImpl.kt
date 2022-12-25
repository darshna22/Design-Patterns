package src.main.kotlin.behavioural.observer_pattern.example2_youtube.observer

import src.main.kotlin.behavioural.observer_pattern.example2_youtube.observable.YoutubeObservable

class YoutubeWhatsAppAlertObserverImpl(val mobileNo: String, val youtubeObservable: YoutubeObservable) : YoutubeNotificationObserver {

    override fun update() {
        sendWhatsAppMsg()
    }

    private fun sendWhatsAppMsg() {
        println("msg sent to $mobileNo \n hurry up new blog add to channel")
    }
}