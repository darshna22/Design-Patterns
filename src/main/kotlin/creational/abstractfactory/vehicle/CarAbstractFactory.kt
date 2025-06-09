package src.main.kotlin.creational.abstractfactory.vehicle

import creational.factory.vehicle.Vehicle

abstract class CarAbstractFactory {
    abstract fun createCar(
        carCompany: String,
        name: String,
        color: String,
        weight: Double,
        maxSpeed: Double,
    ): Vehicle?
}