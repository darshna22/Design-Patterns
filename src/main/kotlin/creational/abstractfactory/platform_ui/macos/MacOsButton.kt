package src.main.kotlin.creational.abstractfactory.platform_ui.windows

import src.main.kotlin.creational.abstractfactory.platform_ui.ui_component.Button

class MacOsButton:Button {
    override fun paint() {
        println("MacOS button painted")
    }

    override fun click() {
        println("MacOS button clicked")
    }
}