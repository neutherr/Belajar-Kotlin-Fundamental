//Function dengan input pada function main dan nullable
fun namaAdmin(firstName: String, lastName: String? = null, usia: Int) { //default parameternya null jadi bisa kosong
    if (lastName == null){ //kondisi jika lastname-nya null
        println("Si Atmin $firstName umur $usia")
    } else //jika tidak null print semua
    println("Si Atmin $firstName $lastName umur $usia")

}

fun main() {
    namaAdmin("Poizy", "Kikir", 21)
    namaAdmin("Lanang", null, 21)
}