//fun hitungTotal(name: String, values: Array<Int>): Int {
//    var total = 0 (tanpa vararg)

fun hitungTotal(name: String, vararg values: Int): Int{ //hanya bisa 1 dalam 1 fungsi
    var total = 0

    for (value in values){
        total += value
    }

    return total
}

fun main() {
    val result = hitungTotal("Yunus", 10, 10, 10, 10)
    //val result = hitungTotal("Yunus", arrayOf(10, 10, 10, 10))
    println(result)
}