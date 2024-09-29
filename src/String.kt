fun main() {
    var firstname: String = "Yunus"
    var lastname: String = "Kholis"

    var address: String = """
       
       Jl. Mawar Drono,
       Tridadi Sleman,
       Sleman DIY
    """.trimIndent()

    println("firstname : $firstname")
    println("lastname : $lastname")
    println("address : $address")

    var fullname: String = "$firstname $lastname"
    println("fullname: $fullname")

    var desc: String = "$fullname lenght = ${fullname.length}"
    println(desc)
}