package src.main.kotlin.creational.factory.food_delivery.creator

import src.main.kotlin.creational.factory.food_delivery.food.Food
import src.main.kotlin.creational.factory.food_delivery.food.Pizza
import src.main.kotlin.creational.factory.food_delivery.food.Sushi

class SushiCreator : FoodCreator() {
    override fun createFood(): Food {
        return Sushi()
    }
}