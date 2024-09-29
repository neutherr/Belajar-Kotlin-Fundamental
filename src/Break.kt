fun main() {

    //Break
    var i = 0

    while (true) { //akan terjadi infinite loop apabila true
        println("Perulangan ke $i")
        i++

        if (i == 100){
            break
        }
    }

    println("Perulangan Selesai")

    //Continue
    for (index in 1..100) {

        if (index % 2 ==0){
            continue //meng-skip angka yang bisa dibagi 2 (genap)
        }

        println("Angka Ganjil = $index")
    }

}