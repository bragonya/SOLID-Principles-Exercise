class Engine (var sparkState:Boolean, var pistonsState:Boolean){

    fun isEngineWorking() = sparkState && pistonsState


    fun useEngine() {
        sparkState = randomNumber(0,10) >2
        pistonsState = randomNumber(0,10) >4
    }

    //TODO this method is repeated in Wallet class
    fun randomNumber(min:Int,max:Int) = min + Math.random()%max

    fun fixEngine() = if(!isEngineWorking()) 13_000L.also { pistonsState = true; sparkState = true } else 0L

    fun fixPrice() = 13_000L

}