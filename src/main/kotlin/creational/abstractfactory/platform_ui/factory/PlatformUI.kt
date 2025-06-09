package src.main.kotlin.creational.abstractfactory.platform_ui.factory

import src.main.kotlin.creational.abstractfactory.platform_ui.ui_component.Button
import src.main.kotlin.creational.abstractfactory.platform_ui.ui_component.TextField

abstract class PlatformUI {
    abstract fun createButton():Button
    abstract fun createTextField():TextField
}