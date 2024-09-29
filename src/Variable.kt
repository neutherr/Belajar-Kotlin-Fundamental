// Deklarasi constant (nilai yang tetap dan diketahui saat compile-time)
const val PI: Double = 3.14159
const val APP_NAME: String = "KotlinApp"

fun main() {
    // Immutable variable (val) - nilainya tidak bisa diubah setelah diinisialisasi
    val immutableName: String = "Yunus"
    // immutableName = "Ali" // Error: Val cannot be reassigned

    // Mutable variable (var) - nilainya bisa diubah setelah inisialisasi
    var mutableAge: Int = 25
    println("Initial age: $mutableAge")
    mutableAge = 30 // Nilai age diubah
    println("Updated age: $mutableAge")

    // Nullable variable (var dengan tipe nullable)
    var nullableAddress: String? = null
    println("Nullable address (initial): $nullableAddress") // Output: null

    // Menggunakan safe call (?.) untuk mengakses properti nullable
    var addressLength: Int? = nullableAddress?.length
    println("Address length (null): $addressLength") // Output: null

    // Mengubah nilai nullable dan menggunakan safe call lagi
    nullableAddress = "Jl. Mawar No. 123"
    addressLength = nullableAddress?.length
    println("Address length (not null): $addressLength") // Output: 15

    // Menggunakan Elvis operator (?:) untuk memberikan nilai default jika nullable adalah null
    var safeLength: Int = nullableAddress?.length ?: 0
    println("Safe length with Elvis operator: $safeLength")

    // Contoh penggunaan constant
    println("Constant PI: $PI")
    println("Constant APP_NAME: $APP_NAME")
}
