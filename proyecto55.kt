fun main(argumento: Array<String>) {
    print("Ingrese un valor entre 1 y 10:")
    val valor = readln().toInt()
    for(i in valor..valor*12 step valor)
        println(i)
}