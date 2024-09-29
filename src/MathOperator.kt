fun main() {
    val result1 : Double = 10.0 / 3.0
    println(result1)

    val result2 : Int = 12 / 2 + 3
    println(result2)

    var total: Int = 0

    val barang1 = 100
    total += barang1 // "+=" sama artinya dengan "total = 100 + barang1"

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)
    total++ // total +1, bisa juga total-- artinya total -1
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat) //tanda "!" berarti kebalikannya maka hasilnya false
}