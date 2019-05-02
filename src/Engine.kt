class Engine (var sparkState:Boolean, var pistonsState:Boolean){

    fun isEngineWorking() = sparkState && pistonsState


    fun useEngine() {
        sparkState = randomNumber() >2
        pistonsState = randomNumber() >4
    }

    fun randomNumber() = Math.random()%10

    fun fixEngine() = 13_000L.also { pistonsState = true; sparkState = true }

}