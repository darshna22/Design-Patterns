package src.main.kotlin.creational.abstractfactory.vehicle


fun main(args: Array<String>) {

    val carFactory = CarFactoryProvider()
    val ordinaryCarFactory = carFactory.createFactory(VehicleType.ORDINARY)
    val luxuryCarFactory = carFactory.createFactory(VehicleType.LUXURY)

    //Create maruti Car class by ordinaryCar factory
    val carFactory1 = ordinaryCarFactory.createCar("Maruti", "Swift Dzire", color = "red", weight = 1335.00, 5.00)
    carFactory1?.displayDetails()

    //Create audi Car class by ordinaryCar factory
    val factory2 = luxuryCarFactory.createCar("Audi", "Audi A4", color = "black", weight = 1335.00, 5.00)
    factory2?.startVehicle()
    factory2?.startVehicle()
    factory2?.displayDetails()

    //Create Mercedes Car class by ordinaryCar factory
    val factory3 =
        luxuryCarFactory.createCar("Mercedes", "Mercedes C-Class", color = "white", weight = 1335.00, 5.00)
    factory3?.displayDetails()

    //Create diff Car class by ordinaryCar factory
    val factory4 = ordinaryCarFactory.createCar("SKODA", "Skoda", color = "white", weight = 1335.00, 5.00)
    factory4?.displayDetails()
}