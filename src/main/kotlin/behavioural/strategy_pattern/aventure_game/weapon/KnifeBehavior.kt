package src.main.kotlin.behavioural.strategy_pattern.aventure_game.weapon

class KnifeBehavior : WeaponBehavior {
    override fun useWeapon() {
        println("cutting with knife")
    }
}