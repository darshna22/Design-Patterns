package creational.factory.vehicle.ordinary

fun main(args: Array<String>) {

    val ordinaryCarFactory = OrdinaryCarFactory()

    //Create maruti Car class by ordinaryCar factory class
    val carFactory1 = ordinaryCarFactory.createCar("Maruti", "Swift Dzire", color = "red", weight = 1335.00,5.00)
    carFactory1?.displayDetails()

    //Create hyundai Car class by ordinaryCar factory class
    val carFactory2 = ordinaryCarFactory.createCar("Hyundai", "Venue", color = "black", weight = 1335.00,5.00)
    carFactory2?.startVehicle()
    carFactory2?.startVehicle()
    carFactory2?.displayDetails()

    //Create Mahendra Car class by ordinaryCar factory class
    val carFactory3 = ordinaryCarFactory.createCar("Mahendra", "Mahendra XUV700", color = "white", weight = 1335.00,5.00)
    carFactory3?.displayDetails()

    //Create diff Car class by ordinaryCar factory class
    val carFactory4 = ordinaryCarFactory.createCar("SKODA", "Skoda", color = "white", weight = 1335.00,5.00)
    carFactory4?.displayDetails()
}