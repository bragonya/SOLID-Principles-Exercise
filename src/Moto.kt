class Moto: Vehicle() {
    override fun useVehicle() = println("i'm in a motocycle")

    override fun vehicleName(): String = "Motocicleta"
}