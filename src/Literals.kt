fun main() {
    // Biner Literal (basis 2)
    val binaryValue: Int = 0b1101 // 0b diikuti oleh angka biner
    println("Nilai Biner: $binaryValue") // Output: 13

    // Heksadesimal Literal (basis 16)
    val hexValue: Int = 0x1A3 // 0x diikuti oleh angka heksadesimal
    println("Nilai Heksadesimal: $hexValue") // Output: 419

    // Desimal Literal (basis 10)
    val decimalValue: Int = 255 // Angka desimal biasa
    println("Nilai Desimal: $decimalValue") // Output: 255

    // Floating-Point Literal
    val floatValue: Float = 3.14f // Huruf 'f' di akhir untuk menandakan Float
    val doubleValue: Double = 2.718281828459045 // Double adalah default untuk angka desimal
    println("Nilai Float: $floatValue") // Output: 3.14
    println("Nilai Double: $doubleValue") // Output: 2.718281828459045

    // String Literal
    val singleLineString: String = "Hello, Kotlin!" // String literal satu baris
    val multiLineString: String = """
        |Ini adalah string multi-baris.
        |Baris pertama.
        |Baris kedua.
    """.trimMargin() // String literal multi-baris dengan margin
    println("String Satu Baris: $singleLineString")
    println("String Multi Baris: $multiLineString")
}

