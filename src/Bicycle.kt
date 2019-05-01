class Bicycle: Vehicle() {
    override fun useVehicle() = println("i'm a bicycle")

    override fun vehicleName(): String = "Bicicleta"
}