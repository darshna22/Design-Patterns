package src.main.kotlin.behavioural.strategy_pattern

import src.main.kotlin.behavioural.strategy_pattern.sorting.Context
import src.main.kotlin.behavioural.strategy_pattern.sorting.strategy.BubbleSort
import src.main.kotlin.behavioural.strategy_pattern.sorting.strategy.MergeSort

fun main() {
    val context = Context(BubbleSort())
    context.executeSortingStrategy()
    //change strategy
    context.setSortingStrategy(MergeSort())
    context.executeSortingStrategy()

}