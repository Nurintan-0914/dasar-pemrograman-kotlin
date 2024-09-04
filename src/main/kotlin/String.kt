fun main (args: Array<String>) {
    val myName: String = "Depandi Enda"
    for (chr in myName){
        print(chr)
    }
    print('\n')

    val s = "abc" + 1
    println(s + "def")

    var text = """
        for (c in "foo")
        print(c)
    """
    println(text)

//    var text = """
//        |tell me and i forget.
//        |teach me and i remember.
//        |invovle me and i learn
//        |(benjamin franklin)
//    """.trimMargin()
}