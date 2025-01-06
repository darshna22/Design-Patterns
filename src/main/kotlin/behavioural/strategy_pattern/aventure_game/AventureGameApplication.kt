package src.main.kotlin.behavioural.strategy_pattern.aventure_game

import src.main.kotlin.behavioural.strategy_pattern.aventure_game.character.Character
import src.main.kotlin.behavioural.strategy_pattern.aventure_game.character.King
import src.main.kotlin.behavioural.strategy_pattern.aventure_game.character.Queen
import src.main.kotlin.behavioural.strategy_pattern.aventure_game.weapon.AxeBehavior
import src.main.kotlin.behavioural.strategy_pattern.aventure_game.weapon.BowAndArrowBehavior
import src.main.kotlin.behavioural.strategy_pattern.aventure_game.weapon.KnifeBehavior
import src.main.kotlin.behavioural.strategy_pattern.aventure_game.weapon.SwordBehavior
import src.main.kotlin.behavioural.strategy_pattern.aventure_game.weapon.WeaponBehavior

fun main() {
    val weaponBehavior = SwordBehavior()
    val king: Character = King(weaponBehavior)
    print("King ")
    king.flight()
    king.setWeapon(AxeBehavior())
    print("King ")
    king.flight()

    val queen: Character = Queen(BowAndArrowBehavior())
    print("Queen ")
    king.flight()
    king.setWeapon(KnifeBehavior())
    print("Queen ")
    king.flight()

}