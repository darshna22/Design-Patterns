package src.main.kotlin.creational.abstractfactory.platform_ui.factory

import src.main.kotlin.creational.abstractfactory.platform_ui.windows.WindowsButton
import src.main.kotlin.creational.abstractfactory.platform_ui.windows.WindowsTextField

class WindowsPlatform : PlatformUI() {
    override fun createButton() = WindowsButton()

    override fun createTextField() = WindowsTextField()
}