package src.main.kotlin.behavioural.strategy_pattern.aventure_game.weapon

class BowAndArrowBehavior : WeaponBehavior {
    override fun useWeapon() {
        println("Shooting with arrow")
    }
}