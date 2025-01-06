package src.main.kotlin.behavioural.strategy_pattern.sorting

import src.main.kotlin.behavioural.strategy_pattern.sorting.strategy.SortingStrategy

class Context(private var sortingStrategy: SortingStrategy) {

    fun executeSortingStrategy() {
        sortingStrategy.sort()
    }

    fun setSortingStrategy(sortingStrategy: SortingStrategy) {
        this.sortingStrategy = sortingStrategy

    }
}