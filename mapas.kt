fun main(){
    //inmutable
    val numbers = mapOf("yuyu" to 1, "sharis" to 2, "nicol" to 3, "daniel" to 4)

    println("mapas: $numbers")
    println("claves: ${numbers.keys}")
    println("valores: ${numbers.values}")
    
    for(i in numbers){
        println(i)
    }

    //mutable
    val numbers2 = mutableMapOf("yuyu" to 1, "sharis" to 2, "nicol" to 3, "daniel" to 4)
    numbers2.put("cristian",5)
    for(i in numbers2){
        println(i)
    }
}