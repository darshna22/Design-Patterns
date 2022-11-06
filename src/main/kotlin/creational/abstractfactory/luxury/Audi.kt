package creational.abstractfactory.luxury

import creational.factory.vehicle.Vehicle

class Audi(
    private val name: String,
    private val color: String,
    private val weight: Double,
    override var maxSpeed: Double
) : Vehicle(name, color, weight) {

    override fun startVehicle() {
        // Code to start a Car
        println("Audi Car Started")
    }

    override fun stopVehicle() {
        // Code to stop a Car
        println("Audi Car Stopped")
    }


}