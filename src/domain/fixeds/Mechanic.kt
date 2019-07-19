package domain.fixeds

import domain.Engine
import domain.Tire
import domain.Wallet

object Mechanic {

    fun fixCar(tires:ArrayList<Tire>, engine: Engine, wallet: Wallet): Payment {
        if(wallet.hasMoney(totalFixTires(tires) + engine.fixPrice())){
            println("Has money, I am going to repair")
            return Payment(totalFixedTires(tires) + engine.fixEngine(), true)
        }

        println("You do not have enough balance , I am not going to repair")

        return Payment(0, false)
    }

    fun isCarWorking(tires:ArrayList<Tire>, engine: Engine):Boolean{
       return engine.isEngineWorking() && tires.fold(true) { isWorking, tire -> isWorking && tire.getState()}
    }

    private fun totalFixedTires(tires:ArrayList<Tire>):Long{
        return tires.filter { tire -> !tire.getState() }.fold(0){ sum:Long, tire -> sum + tire.repairTire() }
    }
    private fun totalFixTires(tires:ArrayList<Tire>):Long{
        return tires.filter { tire -> !tire.getState() }.fold(0){ sum:Long, tire -> sum + tire.brand.reparationPrice }
    }
}