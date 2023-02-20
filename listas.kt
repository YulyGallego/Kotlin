fun main(){
    //lista inmutable
    val numbers = listOf(1,2,3,4,5)

    println(numbers)
    println()
    for(i in numbers){
        println(i)
    }

    println()

    //lista mutable

    val numbers2 = mutableListOf(1,2,3,4,5)
    numbers2.add(6)
    numbers2.remove(1)

    println(numbers2)
    println()

    for(i in numbers2){
        println(i)
    }
     println("tamaño: " + numbers2.count())
}