fun main(args: Array<String>){
    val valInt: Int  = 1
    val valsum: Long = 3L + valInt //konversi insplisit
    println("konversi variabel valInt secara implisit : " + valsum)
    val valLong: Long = valInt.toLong() //konversi eksplisit
    println("konversi variabel varInt secara eksplisit : " + valLong)
}