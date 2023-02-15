fun main (){
    var prom = 0.0
    print("ingrese el nombre del estudiante: ")
    var nombre = String?=readLine()

    print("ingrese la nota1: ")
    var nota1 = readLine()!!.toInt()
    print("ingrese la nota2: ")
    var nota2 = readLine()!!.toInt()
    print("ingrese la nota3: ")
    var nota3 = readLine()!!.toInt()
    
    prom=(n1 + n2 + n3)/3
    println("el promedio es de : $prom")

    if(prom >= 3.0){
        println("gana la materia")
    }else{
        println("pierde la materia")
    }

}