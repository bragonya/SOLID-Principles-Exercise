package domain.fixeds

class Payment(private val newAmountOfMoney:Long, val carWasRepaired:Boolean){
    operator fun plus(number:Double):Double{
        return number + this.newAmountOfMoney
    }

    operator fun minus(number:Double):Double{
        return number - this.newAmountOfMoney
    }

    fun getPaymentValue():Long = newAmountOfMoney

}