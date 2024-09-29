//While akan terus melakukan perulangan sampai terjadi kondisi true

//While Loops
fun main() {

    var i = 0;

    while (i < 100){
        println("ulangi dan tulis sampai 100 kali, ini perulangan ke = $i")
        i++ //increment
    }
    println("perulangan selesai")
//Do While Loop (kebalikannya)
//Kode blok dijalankan baru diakhir dicek kondisi, bedanya hanya pada output jika false maka akan berjalan satu hasil

    var index = 0

    do {
        println("Perulangan ke = $index")
        index++
    } while (index < 10)
}


