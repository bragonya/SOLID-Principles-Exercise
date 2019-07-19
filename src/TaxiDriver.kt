import fixeds.Mechanic

const val DRIVE_PRICE = 1_000
class TaxiDriver(
    private var name:String,
    private var lastName:String,
    private var age:Int,
    private var colorSkin:String,
    private var wallet: Wallet
) {


    fun getName():String = name
    fun getLastName():String = lastName
    fun getAge():Int = age
    fun getColorSkin():String = colorSkin

    init {
        println("✍️ new Taxi Driver was registered as $name with ${wallet.balance()} of cash")
    }


    fun drive(car: Car):Boolean{
        println("😎 $name is going to drive")
        if(Mechanic.isCarWorking(car.tires, car.engine)){
            car.startCar()
            wallet.addMoney(DRIVE_PRICE)
            println("🥳 $name won $DRIVE_PRICE")
            printDriverStatus()
            return true
        }else{
            val payment= Mechanic.fixCar(car.tires, car.engine, wallet)
            if(payment.carWasRepaired) {
                wallet.sependMoney(payment.getPaymentValue().toDouble())
                println("🥳 $name repaired his car and your new balance is ${wallet.balance()} ")
                drive(car)
                return true
            }
            println("😔 $name can't perform the trip")
            printDriverStatus()
            return false
        }
    }

    fun printDriverStatus(){
        println("name: $name lastName: $lastName age: $age colorSkin: $colorSkin money: ${wallet.balance()}")
    }
}