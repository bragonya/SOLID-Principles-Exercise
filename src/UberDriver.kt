class UberDriver() {
    var name = "José"
    var lastName = "Perrier"
    var age = 19
    var colorSkin = "moreno"
    //TODO dependency injection
    var car:Car = Car()
    var wallet:Wallet=Wallet(100_000L)

    fun drive():Boolean{
        if(car.isCarWorking()){
            return car.startCar()
        }else{
            val payment= car.fixCar(wallet)
            if(payment.carWasRepaired) {
                wallet.money = payment - wallet.money
                return true
            }
            return false
        }
    }
}