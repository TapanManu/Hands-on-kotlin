class Dice(val numSides:Int){
    fun roll():Int{
        return (1..numSides).random()
    }
}
fun main(){
    println(Dice(6).roll())
}
