package src.main.kotlin.behavioural.observer_pattern.example2_youtube.observable

import src.main.kotlin.behavioural.observer_pattern.example2_youtube.observer.YoutubeNotificationObserver

interface YoutubeObservable {
    fun subscribeObserver(notificationObserver: YoutubeNotificationObserver)
    fun unSubscribeObserver(notificationObserver: YoutubeNotificationObserver)
    fun notifyUser()
    fun getBlogs(): Int
    fun addBlogs(blog:Int)
}