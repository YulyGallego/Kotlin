fun main(){
    print("ingrese la edad: ")
    val edad = readLine()!!.toInt()
    
    if (edad > 18){
        println("es mayor de edad")
    }else{
        println("es menor de edad")
    }
    println("la edad es: $edad")
}
