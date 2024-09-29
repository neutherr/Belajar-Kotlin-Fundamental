fun main() {
    val pembelian = 50 // Ubah nilai ini untuk menguji berbagai rentang

    val diskon = if (pembelian >= 500) {
        0.3 // Diskon 30%
    } else if (pembelian >= 300) {
        0.2 // Diskon 20%
    } else if (pembelian >= 100) {
        0.1 // Diskon 10%
    } else {
        0.0 // Diskon 5%
    }

    println("Total pembelian: $pembelian")
    println("Diskon yang diterapkan: ${diskon * 100}%")
}
