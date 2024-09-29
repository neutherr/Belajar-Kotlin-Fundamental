fun main() {
    // 1. Konversi antara tipe integer
    val intValue: Int = 123
    val longValue: Long = intValue.toLong()  // Konversi dari Int ke Long
    val byteValue: Byte = intValue.toByte()  // Konversi dari Int ke Byte
    println("Long Value: $longValue")  // Output: Long Value: 123
    println("Byte Value: $byteValue")  // Output: Byte Value: 123

    // 2. Konversi antara floating-point tipe
    val floatValue: Float = 3.14f
    val doubleValue: Double = floatValue.toDouble()  // Konversi dari Float ke Double
    println("Double Value: $doubleValue")  // Output: Double Value: 3.14

    // 3. Konversi dari String ke angka
    val numberString: String = "456"
    val intFromString: Int = numberString.toInt()  // Konversi dari String ke Int
    val doubleFromString: Double = "7.89".toDouble()  // Konversi dari String ke Double
    println("Integer from String: $intFromString")  // Output: Integer from String: 456
    println("Double from String: $doubleFromString")  // Output: Double from String: 7.89

    // 4. Casting dari objek
    val anyObject: Any = "Hello, Kotlin!"
    val stringValue: String = anyObject as String  // Casting dari Any ke String
    println("String Value: $stringValue")  // Output: String Value: Hello, Kotlin!

    // 5. Safe casting
    val anotherObject: Any = 123
    val safeStringValue: String? = anotherObject as? String  // Safe casting dari Any ke String
    println("Safe String Value: $safeStringValue")  // Output: Safe String Value: null

    // 6. Konversi dari tipe numerik ke String
    val numericValue: Int = 789
    val stringFromNumber: String = numericValue.toString()  // Konversi dari Int ke String
    println("String from Number: $stringFromNumber")  // Output: String from Number: 789
}
