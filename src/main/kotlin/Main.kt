fun main(args: Array<String>) {
    //CREACION DE LA VARIABLE LISTA DONDE ALMACENA LOS DATOS
    //SE INCLUYE LA FUNCION DE GENERAR NUMEROS ALEATORIOS
    val lista: MutableList<Int> = MutableList(10) { ((Math.random() * 10) + 1).toInt() }
    println("lista completa")
    //SE MUESTRA LA LISTA
    println(lista)
    println("Elementos y su posicion")
    //CON AYUDA DE UN CICLO FOR SE MARCA LA POSICION DEL DATO Y EL VALOR DEL DATO
    for (posicion in lista.indices){
        print("[$posicion]${lista[posicion]}")

    }
    "\n"
    //SE CREA LA VARIABLE CANTIDAD Y SE HACE UNA COMPARACION DE IGUAL IGUAL
    //SE IMPRIME LA CANTIDAD DE ELEMENTOS CON EL VALOR DE 5 ASIGNADO
    val cant = lista.count { it == 5 }
    println("cantidad de elementos con el valor 5: $cant")

}