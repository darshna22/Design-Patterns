package src.main.kotlin.creational.factory.food_delivery

import src.main.kotlin.creational.factory.food_delivery.creator.BurgerCreator
import src.main.kotlin.creational.factory.food_delivery.creator.FoodCreator
import src.main.kotlin.creational.factory.food_delivery.creator.PizzaCreator
import src.main.kotlin.creational.factory.food_delivery.creator.SushiCreator

fun main() {
    //pizza
    var foodCreator: FoodCreator = PizzaCreator()
    foodCreator.prepareFood()


    //burger
    foodCreator = BurgerCreator()
    foodCreator.prepareFood()

    //sushi
    foodCreator = SushiCreator()
    foodCreator.prepareFood()

}