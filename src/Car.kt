class Car() {
    private var tires:ArrayList<Tire>
    private var engine:Engine

    init {
        //TODO dependency injection
        tires = arrayListOf(Tire(true,TIRE_BRANDS.FIRESTONE),
            Tire(true,TIRE_BRANDS.BRIDGESTONE),
            Tire(true,TIRE_BRANDS.FIRESTONE),
            Tire(true,TIRE_BRANDS.MICHELIN))
        engine = Engine(true,true)
    }

    fun startCar():Boolean{
        if(isCarWorking()) {
            tires.forEach { it.useTire() }
            engine.useEngine()
            return true
        }
        return false
    }

    //TODO It's strange that the car can repair by itself, Do we need another entity?
    fun fixCar(wallet: Wallet):Payment {
        // TODO Single responsibility
        if(wallet.money >= tires.filter { !it.getState() }.fold(0) { sum:Long, element -> sum + element.brand.reparationPrice }+engine.fixPrice()){
            Payment(tires.filter { !it.getState() }.fold(0) { sum:Long, element -> sum + element.repairTire() } + engine.fixEngine(),true)
        }
        return Payment(0,false)
    }

    //TODO Single responsibility
    fun isCarWorking() = engine.isEngineWorking() && tires.fold(true) { isWorking, tire -> isWorking && tire.getState()}

    class Payment(val newAmountOfMoney:Long,val carWasRepaired:Boolean){
        operator fun plus(number:Double):Double{
            return number + this.newAmountOfMoney
        }

        operator fun minus(number:Double):Double{
            return number - this.newAmountOfMoney
        }

    }

}