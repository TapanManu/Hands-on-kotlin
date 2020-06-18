class Dice{
    var sides = 6
    fun roll():Int{
        val value = (1..6).random()
        return value
    }
}
fun main(){
    val myDice = Dice()
    println(myDice.roll())
}
