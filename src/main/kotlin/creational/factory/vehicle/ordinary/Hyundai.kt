package creational.factory.vehicle.ordinary

import creational.factory.vehicle.Vehicle

class Hyundai(
    private val name: String,
    private val color: String,
    private val weight: Double,
    override var maxSpeed: Double
) : Vehicle(name, color, weight) {

    override fun startVehicle() {
        // Code to start a Car
        println("Hyundai Car Started")
    }

    override fun stopVehicle() {
        // Code to stop a Car
        println("Hyundai Car Stopped")
    }


}