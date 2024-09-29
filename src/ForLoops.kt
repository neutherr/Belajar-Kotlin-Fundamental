fun main() {

    //For Array
    var array = arrayOf("Muhammad", "Yunus", "Kholis")

    var total = 0
    for (name in array) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    //For Range
    for(i in 0..100 step 5){
        println(i)
    }

    //Kombinasi Range dan Array
    val ukuranArray = array.size -1
    for (index in 0..ukuranArray){
        println("Index $index = ${array.get(index)}")
    }
}