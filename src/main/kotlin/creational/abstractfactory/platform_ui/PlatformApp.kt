package src.main.kotlin.creational.abstractfactory.platform_ui

import src.main.kotlin.creational.abstractfactory.platform_ui.factory.MacOsPlatform
import src.main.kotlin.creational.abstractfactory.platform_ui.factory.WindowsPlatform
import src.main.kotlin.creational.abstractfactory.platform_ui.factory.abs_factory.PlatformService

fun main() {
    val platformService = PlatformService()
    platformService.platform(WindowsPlatform())
    platformService.renderUI()

    platformService.platform(MacOsPlatform())
    platformService.renderUI()
}