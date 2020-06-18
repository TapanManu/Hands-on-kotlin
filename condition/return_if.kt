fun main(){
val ans = generateAnswerString(42)
println(ans)
}
fun generateAnswerString(countThreshold: Int): String {
    val count=20
    return if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }
}
