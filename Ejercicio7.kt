fun main(){
    var numero = Int
    var continuar = "si"
    while(continuar.uppercase()=="SI"){
        print("ingrese un numero: ")
         numero = readLine()!!.toInt()

        if(numero < 0 ){
            numero = numero * -1
        }
        println("el numero positivo es: $numero")
        print("desea ingresar otro numero ? (si/no)")
        continuar= readLine()!!
    }
}
