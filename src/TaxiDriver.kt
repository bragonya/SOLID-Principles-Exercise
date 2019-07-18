const val DRIVE_PRICE = 1_000
class TaxiDriver(
    //TODO encapsulation
    var name:String,
    var lastName:String,
    var age:Int,
    var colorSkin:String
) {


    //TODO dependency injection
    var car:Car = Car()
    var wallet:Wallet=Wallet()

    init {
        println("✍️ new Taxi Driver was registered as $name with ${wallet.money} of cash")
    }


    fun drive():Boolean{
        println("😎 $name is going to drive")
        if(car.isCarWorking()){
            car.startCar()
            //TODO Should UberDriver class charge his own drive?
            wallet.money += DRIVE_PRICE
            println("🥳 $name won $DRIVE_PRICE")
            printDriverStatus()
            return true
        }else{
            val payment= car.fixCar(wallet)
            if(payment.carWasRepaired) {
                //TODO Should UberDriver class discount his own reparation?
                wallet.money = payment - wallet.money
                println("🥳 $name repaired his car")
                drive()
                return true
            }
            println("😔 $name can't perform the trip")
            printDriverStatus()
            return false
        }
    }

    fun printDriverStatus(){
        println("name: $name lastName: $lastName age: $age colorSkin: $colorSkin money: ${wallet.money}")
    }
}