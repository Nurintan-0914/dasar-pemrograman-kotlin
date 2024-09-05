fun main(args: Array<String>){
    //simple calculator
    println("welcome to calculator")
    println("enter the first number: ")
    val a = readLine()!!.toDouble()
    println("enter the second number: ")
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val qoutient = a / b
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("Product: ${product}")
    println("Qoutient: ${qoutient}")
    println("thank you for using calculator.")

}