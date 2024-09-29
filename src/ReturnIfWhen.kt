fun main() {
    fun sayHello(name: String = ""): String {
        return if (name == "") { //return diawal
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }
    println(sayHello("Eko"))
    println(sayHello())
}


//tanpa return when
/*fun main() {

    fun sayHello(name: String = ""): String {
        when(name){
            "" -> return "Hello, maaf gak tau nama"
            else -> return "Hello $name"
        }
    }
    println(sayHello("Buda"))
    println(sayHello())

}*/


// Tanpa ReturnIf
/*
fun main() {

    fun sayHello(name: String = ""): String{
        if (name == "") {
            return "Hello, Maaf g tau nama"
        } else {
            return "Hello $name"
        }
    }

    println(sayHello("Budi"))
    println(sayHello())
}*/
