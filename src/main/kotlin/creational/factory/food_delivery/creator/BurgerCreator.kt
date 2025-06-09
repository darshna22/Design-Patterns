package src.main.kotlin.creational.factory.food_delivery.creator

import src.main.kotlin.creational.factory.food_delivery.food.Burger
import src.main.kotlin.creational.factory.food_delivery.food.Food
import src.main.kotlin.creational.factory.food_delivery.food.Pizza

class BurgerCreator : FoodCreator() {
    override fun createFood(): Food {
        return Burger()
    }
}