fun String.hello(): String {
    return "Hello $this"
}

fun String.printHello() {
    println("Hellow $this")
}

fun main() {
    val name = "Yunus"
    println(name.hello())

    name.printHello()
    "Kholis".printHello()
}

//contoh tanpa extension func
/*
fun hello(name: String): String {  // Fungsi biasa yang menerima parameter String
    return "Hello $name"
}

fun main() {
    val name = "Yunus"
    println(hello(name))           // Memanggil fungsi dengan melewatkan String sebagai argumen
*/
