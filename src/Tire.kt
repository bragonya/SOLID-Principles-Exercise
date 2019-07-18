class Tire(private var state:Boolean, var brand:TIRE_BRANDS){
    private var life:Int
    private val MAX_USAGE = 3

    init {
        life = 0
    }


    fun repairTire():Long =
        when(brand){
            TIRE_BRANDS.FIRESTONE -> TIRE_BRANDS.FIRESTONE.reparationPrice
            TIRE_BRANDS.BRIDGESTONE -> TIRE_BRANDS.BRIDGESTONE.reparationPrice
            TIRE_BRANDS.MICHELIN -> TIRE_BRANDS.MICHELIN.reparationPrice
        }.also {
            state = true
        }



    fun useTire(){
        if(life > MAX_USAGE)
            state = false
        else
            life++
    }

    fun getState() = state

}