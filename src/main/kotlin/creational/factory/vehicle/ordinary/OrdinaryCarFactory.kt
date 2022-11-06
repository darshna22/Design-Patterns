package creational.factory.vehicle.ordinary

import creational.factory.vehicle.Vehicle

class OrdinaryCarFactory {
    fun createCar(
        carCompany: String,
        name: String,
        color: String,
        weight: Double,
        maxSpeed: Double
    ): Vehicle? {
        if (carCompany.isEmpty()) return null
        return when (carCompany) {
            "Hyundai" -> Hyundai(name = name, color = color, weight = weight, maxSpeed = maxSpeed)
            "Maruti" -> Hyundai(name = name, color = color, weight = weight, maxSpeed = maxSpeed)
            "Mahendra" -> Hyundai(name = name, color = color, weight = weight, maxSpeed = maxSpeed)
            else -> throw IllegalArgumentException("This $name company car we are not selling")
        }
    }
}