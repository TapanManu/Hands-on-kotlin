fun main() {
    val char = '$'
    val times_to_repeat = 20
    printLine(char,times_to_repeat)
    println("HI I AM TAPAN MANU")
    printLine(char,times_to_repeat)
}
fun printLine(char: Char,times_to_repeat:Int){
    repeat(times_to_repeat){
        print(char)
    }
    print("\n")
}
