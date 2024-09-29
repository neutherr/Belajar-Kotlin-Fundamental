//membuat function tanpa nama atau tanpa harus mendeskripsikan functoionnya
//tidak perlu return

//Method References
fun toUpper(value:String): String = value.toUpperCase()

fun main() {
    //membuat 2 parameter lambda string
    val lambdaName: (String, String) -> String = {firstName: String, lastName:String ->
        val result = "$firstName $lastName"
        result
    }

    val result = lambdaName("Yunus", "Kholis")
    println(result)

    //lambda it (hanya untuk 1 parameter
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Neuther"))

    //MethodReference
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("yunus"))
}