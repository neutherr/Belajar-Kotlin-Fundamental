// fungsi dalam fungsi main, tidak bisa diakses oleh file lain
fun main() {
    fun helloWorld(){
        println("Hello World")
    }

    helloWorld()

}
