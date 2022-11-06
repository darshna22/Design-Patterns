package creational.abstractfactory

import creational.abstractfactory.luxury.LuxuryCarFactory
import creational.abstractfactory.ordinary.OrdinaryCarFactory
import creational.factory.vehicle.Vehicle
import java.lang.IllegalArgumentException

class CarFactoryProvider {
    fun createFactory(vehicleType: VehicleType): CarAbstractFactory {
        return when (vehicleType) {
            VehicleType.LUXURY -> LuxuryCarFactory()
            VehicleType.ORDINARY -> OrdinaryCarFactory()
            else -> throw IllegalArgumentException("this type vehicle not available in our company")
        }
    }
}


