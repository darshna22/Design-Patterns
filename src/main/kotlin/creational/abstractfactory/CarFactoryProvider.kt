package src.main.kotlin.creational.abstractfactory

import creational.abstractfactory.CarAbstractFactory
import creational.abstractfactory.VehicleType
import creational.abstractfactory.luxury.LuxuryCarFactory
import creational.abstractfactory.ordinary.OrdinaryCarFactory

class CarFactoryProvider {
    fun createFactory(vehicleType: VehicleType): CarAbstractFactory {
        return when (vehicleType) {
            VehicleType.LUXURY -> LuxuryCarFactory()
            VehicleType.ORDINARY -> OrdinaryCarFactory()
            else -> throw IllegalArgumentException("this type vehicle not available in our company")
        }
    }
}


