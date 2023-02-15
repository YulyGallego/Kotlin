fun main (){
    val nota1 = 2.0
    val nota2 = 1.0
    val nota3 = 1.0

    val prom = (nota1 + nota2 + nota3)/3

    if(prom >= 3.5){
        println("gana la materia")
    }else if(prom >2){
        println("puede recuperar")
    }else{
        println("pierde la materia")
    }
}