package src.main.kotlin.behavioural.observer_pattern.example2_youtube.observable

import src.main.kotlin.behavioural.observer_pattern.example2_youtube.observer.YoutubeNotificationObserver

class ChannelObservableImpl : YoutubeObservable {
    private var blogsNo = 0
    private val observersList = mutableListOf<YoutubeNotificationObserver>()
    override fun subscribeObserver(notificationObserver: YoutubeNotificationObserver) {
        observersList.add(notificationObserver)
    }

    override fun unSubscribeObserver(notificationObserver: YoutubeNotificationObserver) {
        observersList.add(notificationObserver)
    }

    override fun notifyUser() {
        for (observer in observersList) {
            observer.update()
        }
    }

    override fun getBlogs(): Int {
        return blogsNo
    }

    override fun addBlogs(blog: Int) {
        blogsNo += blog
        if (blogsNo != 0) notifyUser()
    }


}