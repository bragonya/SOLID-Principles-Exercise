class Car() {
    private var tires:ArrayList<Tire>
    private var engine:Engine

    init {
        //TODO dependency injection
        tires = ArrayList()
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

    fun addTire(tire: Tire) = tires.add(tire)

    fun fixCar(wallet: Wallet):Payment {
        // TODO Code isolation
        if(wallet.money >= tires.filter { !it.getState() }.fold(0) { sum:Long, element -> sum + element.brand.reparationPrice }){
            Payment(tires.filter { !it.getState() }.fold(0) { sum:Long, element -> sum + element.repairTire() },true)
        }
        return Payment(0,false)
    }

    //TODO Code isolation
    fun isCarWorking() = engine.isEngineWorking() && tires.fold(true) { isWorking, tire -> isWorking && tire.getState()}

    class Payment(val newAmountOfMoney:Long,val carWasRepaired:Boolean){
        operator fun plus(number:Long):Long{
            return this.newAmountOfMoney + number
        }

        operator fun minus(number:Long):Long{
            return this.newAmountOfMoney - number
        }

    }

}