package src.main.kotlin.creational.abstractfactory.platform_ui.factory

import src.main.kotlin.creational.abstractfactory.platform_ui.windows.MacOsButton
import src.main.kotlin.creational.abstractfactory.platform_ui.windows.MacOsTextField
import src.main.kotlin.creational.abstractfactory.platform_ui.windows.WindowsButton
import src.main.kotlin.creational.abstractfactory.platform_ui.windows.WindowsTextField

class MacOsPlatform : PlatformUI() {
    override fun createButton() = MacOsButton()

    override fun createTextField() = MacOsTextField()
}