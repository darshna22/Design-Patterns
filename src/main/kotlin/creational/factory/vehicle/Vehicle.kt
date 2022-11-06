package creational.factory.vehicle

abstract class Vehicle(
    private val name: String,
    private val color: String,
    private val weight: Double
) {
    abstract var maxSpeed: Double

    abstract fun startVehicle()

    abstract fun stopVehicle()

    // Concrete (Non-Abstract) Method
    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }

}