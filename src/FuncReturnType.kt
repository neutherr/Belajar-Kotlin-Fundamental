fun sum(a:Int, b:Int): Int { //return
    val total = a + b
    return total

}

fun main() {
    println(sum(10,10))
    println(sum(20,20))

    val result = sum(200,200) //memanggil fungsi dalam variabel
    println(result)
}