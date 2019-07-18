import fixeds.Mechanic

class Car(val tires:ArrayList<Tire>, val engine:Engine ) {


    fun startCar():Boolean{
        if(Mechanic.isCarWorking(tires, engine)) {
            tires.forEach { it.useTire() }
            engine.useEngine()
            return true
        }
        return false
    }





}