package creational.abstractfactory.luxury

import creational.abstractfactory.CarAbstractFactory
import creational.factory.vehicle.Vehicle

class LuxuryCarFactory : CarAbstractFactory() {

    override fun createCar(
        carCompany: String,
        name: String,
        color: String,
        weight: Double,
        maxSpeed: Double,
    ): Vehicle? {
        if (carCompany.isEmpty()) return null
        return when (carCompany) {
            "Mercedes" -> Mercedes(name = name, color = color, weight = weight, maxSpeed = maxSpeed)
            "Audi" -> Audi(name = name, color = color, weight = weight, maxSpeed = maxSpeed)
            "BMW" -> BMW(name = name, color = color, weight = weight, maxSpeed = maxSpeed)
            else -> throw IllegalArgumentException("This $name company car we are not selling")
        }
    }
}