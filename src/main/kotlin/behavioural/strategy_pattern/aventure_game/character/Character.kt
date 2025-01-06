package src.main.kotlin.behavioural.strategy_pattern.aventure_game.character

import src.main.kotlin.behavioural.strategy_pattern.aventure_game.weapon.WeaponBehavior

abstract class Character(weaponBehavior: WeaponBehavior) {
    var weaponBehavior: WeaponBehavior = weaponBehavior
    fun flight() {
        weaponBehavior.useWeapon()
    }

    fun setWeapon(weaponBehavior: WeaponBehavior) {
        this.weaponBehavior = weaponBehavior
    }
}