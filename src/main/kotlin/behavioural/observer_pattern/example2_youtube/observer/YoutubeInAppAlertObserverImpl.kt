package src.main.kotlin.behavioural.observer_pattern.example2_youtube.observer

import src.main.kotlin.behavioural.observer_pattern.example2_youtube.observable.YoutubeObservable

class YoutubeInAppAlertObserverImpl(val emailId: String, val youtubeObservable: YoutubeObservable) : YoutubeNotificationObserver {

    override fun update() {
        notifyUser()
    }

    private fun notifyUser() {
        println("mail sent to $emailId \n hurry up new blog add to channel")
    }
}