class Dice(val numSides:Int){
    fun roll():Int{
        return (1..numSides).random()
    }
}
fun main(){
   val dice =Dice(6).roll()
   val luckyNumber = 4
   
   if(dice == luckyNumber){
       println("You won")
   }
   else
      println("You rolled ${dice},try again once more")
   
}
