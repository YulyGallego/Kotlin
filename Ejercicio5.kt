fun main(){
    var count = 44

    val answerString = when{
        count == 42 -> "el valor es igual a 42."
        count > 35 -> "el valor es mayor a 35."
        else -> "no cumple con ninguna de las anteriores"
    }
    println(answerString)
}