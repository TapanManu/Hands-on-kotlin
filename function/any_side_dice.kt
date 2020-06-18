class Dice(val numSides:Int){
    fun roll():Int{
        val value = (1..numSides).random()
        return value
    }
}
fun main(){
    val myDice = Dice(6)
    println(myDice.roll())
}
