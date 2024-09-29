fun main() {
    var nilai: String = "D"
    when (nilai) {
        "A" -> {
            println("Excellent")
        }

        "B" -> {
            println("Good")
        }

        "C" -> {
            println("NotBad")
        }

        else -> {
            println("YTTA")
        }
    }

    //When Expression Multiple Option
    when (nilai) {
        "A", "B", "C" -> {
            println("selamat anda lulus")
        }

        else ->
            println("Maaf, Anda Tidak Lulus")
    }

    // When Expressions In (Ketika Nilai Termaksuk "A","B","C")
    nilai = "A"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("Maaf, Anda Belum Lulus")
    }

    val name = "Yunus"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    // When Expressions tanpa memasukkan variabel ke parameter seperti ; when(nilaiUjian)
    val nilaiUjian = 90
    when {
        nilaiUjian > 80 -> println("Gacor Le")
        nilaiUjian > 60 -> println("Mantap Le")
        nilaiUjian > 40 -> println("Lumayan Le")
    }

    val value =  27
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }

}