package src.main.kotlin.creational.abstractfactory.platform_ui.windows

import src.main.kotlin.creational.abstractfactory.platform_ui.ui_component.Button

class WindowsButton:Button {
    override fun paint() {
        println("Window button painted")
    }

    override fun click() {
        println("Window button clicked")
    }
}