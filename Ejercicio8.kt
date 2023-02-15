fun main (){
    print("ingrese la cantidad de numeros a procesar")
    val cantidad = readLine()!!.toInt()

    for(i in 1..cantidad){
        print("ingrese un nuemro")
        val numero = readLine()!!.toInt()

        if(numero % 11 == 0){
            println("el numero $numero es divisible entre 11")
        }else{
            println("el numero $numero no es divisible entre 11")
        }
    }

}
