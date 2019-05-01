class Car: Vehicle() {
    override fun useVehicle() = println("i'm a car")

    override fun vehicleName(): String = "Car"
}