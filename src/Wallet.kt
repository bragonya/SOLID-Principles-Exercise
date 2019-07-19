class Wallet(private var money:Double){

    fun addMoney(value:Int){
        money+= value
    }

    fun sependMoney(value:Double):Boolean{
        if(!hasMoney(value.toLong())) return false
        money -= value
        return true
    }

    fun hasMoney(value: Long):Boolean{
        return (money>value)
    }

    fun balance():Double = money

}