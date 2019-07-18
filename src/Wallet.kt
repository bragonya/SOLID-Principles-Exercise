// TODO Likely I need to think on encapsulation, because money value can be changed by another external entity
class Wallet{
    var money:Double

    init {
        money = randomNumber(70_000,100_000)
    }

    //TODO this method is repeated in Engine class
    fun randomNumber(min:Int,max:Int) = min + Math.random()%max
}