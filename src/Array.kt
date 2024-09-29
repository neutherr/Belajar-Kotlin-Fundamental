fun main() {
    val fruits = arrayOf("Apple", "Banana", "Cherry")


    // Mengakses elemen array
    println(fruits[0]) // Output: Apple

    // Mengubah elemen array
    fruits[1] = "Blueberry"

    val index = fruits.indexOf("Blueberry")

    println(fruits[1]) // Output: Blueberry
    println(fruits.size) // Output: 3
    println(fruits.first()) // Output: Apple
    println(fruits.last())  // Output: Cherry
    println(index) // Output: 1

}
