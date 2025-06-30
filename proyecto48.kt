fun main(parameter:Array<String>){
    var suma=0
    for(i in 1..10){
        println("Ingresa un numero")
        val num = readln().toInt()
        suma +=num
    }
    println("La suma de los numeros es $suma")
    val promedio = suma/10
    println("El promedio de los numero ingresados es $promedio")
}