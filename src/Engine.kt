class Engine (var sparkState:Boolean, var pistonsState:Boolean){

    fun isEngineWorking() = sparkState && pistonsState


    fun useEngine() {
        sparkState = Util.randomNumber(0,10) >2
        pistonsState = Util.randomNumber(0,10) >4
    }


    fun fixEngine() = if(!isEngineWorking()) 13_000L.also { pistonsState = true; sparkState = true } else 0L

    fun fixPrice() = 13_000L

}