fun main() {

    //val range =  1..100
    val range =  100 downTo 1 //step 2

    println(range)
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step) //bertambah 1 atau berkurang 1 (bisa disesuaikan)


}

//umumnya digunakan unntuk fungsi perulangan