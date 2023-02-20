fun main (){
    val animales = setOf("gallina", "perro", "gato", "tortuga", "pez", "cuy")
    println(animales)
    val animalBuscado = "cuy"

if (animalBuscado in animales) {
    println("El animal $animalBuscado está en el conjunto")
}else {
    println("El animal $animalBuscado no está en el conjunto")
}
}


