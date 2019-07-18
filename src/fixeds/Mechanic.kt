package fixeds

import Car
import Engine
import Tire
import Wallet

object Mechanic {

    fun fixCar(tires:ArrayList<Tire>, engine: Engine, wallet: Wallet): Payment {
        if(wallet.money >= totalFixTires(tires) + engine.fixPrice()){
            Payment(totalFixedTires(tires) + engine.fixEngine(), true)
        }
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