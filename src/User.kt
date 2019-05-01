abstract class User(var vehicle: Vehicle) {


    var name = "José"
    var lastName = "Perrier"
    var age = 19
    var colorSkin = "moreno"


    fun useVehicle(){
        vehicle.useVehicle()
    }


}