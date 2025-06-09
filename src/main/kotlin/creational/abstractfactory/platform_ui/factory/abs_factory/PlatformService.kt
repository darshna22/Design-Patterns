package src.main.kotlin.creational.abstractfactory.platform_ui.factory.abs_factory

import src.main.kotlin.creational.abstractfactory.platform_ui.factory.PlatformUI
import src.main.kotlin.creational.abstractfactory.platform_ui.ui_component.Button
import src.main.kotlin.creational.abstractfactory.platform_ui.ui_component.TextField

class PlatformService {
    private lateinit var button:Button
    private lateinit var textField:TextField

    fun platform(platformUI: PlatformUI){
        button=platformUI.createButton()
        textField=platformUI.createTextField()
    }

    fun renderUI(){
        button.paint()
        textField.paint()
    }
}