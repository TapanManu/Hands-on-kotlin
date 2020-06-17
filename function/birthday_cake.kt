fun main(){
    cakeCandles(20)
    cakeTop(20)
    cakeBottom(20,5)
}
fun cakeTop(age:Int){
    println()
    repeat(age+2){
        print("=")
    }
}
fun cakeCandles(age : Int){
    print(" ")
    repeat(age){
        print("'")
    }
    println()
    print(" ")
    repeat(age){
        print("|")
    }
}
fun cakeBottom(age:Int,Layers:Int){
    
    repeat(Layers){
        println()
        repeat(age+2){
            print("@")
        }
        
    }
    
}

 ''''''''''''''''''''
 ||||||||||||||||||||
======================
@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@
