package src.main.kotlin.creational.abstractfactory.platform_ui.windows

import src.main.kotlin.creational.abstractfactory.platform_ui.ui_component.TextField

class MacOsTextField:TextField {
    override fun paint() {
        println("MacOS Text field painted")
    }

    override fun enter(input: String) {
        println("data entered in text field")
    }
}