fun main() {
    val a = 10
    val b = 3

    println("Penjumlahan: ${a + b}")   // Output: 13
    println("Pengurangan: ${a - b}")   // Output: 7
    println("Perkalian: ${a * b}")     // Output: 30
    println("Pembagian: ${a / b}")     // Output: 3
    println("Modulus: ${a % b}")       // Output: 1

    var c = 5

    c += 3  // a = a + 3
    println("Hasil setelah +=: $c")  // Output: 8

    c -= 2  // a = a - 2
    println("Hasil setelah -=: $c")  // Output: 6

    c *= 2  // a = a * 2
    println("Hasil setelah *=: $c")  // Output: 12

    c /= 4  // a = a / 4
    println("Hasil setelah /=: $c")  // Output: 3

    c %= 2  // a = a % 2
    println("Hasil setelah %=: $c")  // Output: 1
}
