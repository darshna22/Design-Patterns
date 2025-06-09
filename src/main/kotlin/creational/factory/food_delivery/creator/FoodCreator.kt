package src.main.kotlin.creational.factory.food_delivery.creator

import src.main.kotlin.creational.factory.food_delivery.food.Food

abstract class FoodCreator {
    abstract fun createFood(): Food
    fun prepareFood() {
        val food = createFood()
        food.prepare()
    }
}