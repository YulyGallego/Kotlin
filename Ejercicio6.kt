fun main(){
    print("ingrese la cantidad de personas a saludar: ")
    val cantidadPersonas = readLine()!!.toInt()
    val contador = 1
    do{
        print("ingrese el nombre de la persona $contador")
        val nombre = readLine()!!
        println("Hola $nombre bienvenido")
        
        contador++
    }while(contador <= cantidadPersonas)
}