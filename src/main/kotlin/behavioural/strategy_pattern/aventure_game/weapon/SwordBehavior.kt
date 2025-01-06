package src.main.kotlin.behavioural.strategy_pattern.aventure_game.weapon

class SwordBehavior : WeaponBehavior {
    override fun useWeapon() {
        println("swinging with sword")
    }
}