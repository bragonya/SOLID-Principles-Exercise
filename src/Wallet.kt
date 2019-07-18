// TODO Likely I need to think on encapsulation, because money value can be changed by another external entity
class Wallet{
    var money:Double

    init {
        money = Util.randomNumber(70_000,100_000)
    }
}