fun main() {
    val nilaiMinimum : Int = 40
    val nilaiMencukupi : Int = 100
    val nilaiPeserta : Int = 39

    // Menghasilkan string hasil dari if-else
    val hasilUjian = if (nilaiPeserta in nilaiMinimum..nilaiMencukupi) {
        "Lulus"
    } else {
        "Mohon maaf anda tidak lulus"
    }

    // Cetak hasil dan nilai peserta
    println("Anda Dinyatakan : $hasilUjian")
    println("Nilai anda : $nilaiPeserta")
}
