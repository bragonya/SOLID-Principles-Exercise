
fun main(args : Array<String>) {
        testDriver("José","Milla",15,"white",20)
}


fun testDriver(name:String,lastName:String,age:Int,colorSkin:String, iterations:Int)
{
        val taxiDriver = TaxiDriver(name,lastName,age,colorSkin)
        for (x in 0 until iterations){
                println("--------------------------------------------------👣 ITERATION ${x+1}-------------------------------------------------------------")
                taxiDriver.drive()
        }
        taxiDriver.drive()
}
