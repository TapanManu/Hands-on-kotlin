fun main(){
val stringLength: Int = stringLengthFunc("Android")
println(stringLength)
}
val stringLengthFunc: (String) -> Int = { input ->
    input.length
}
