fun main(args: Array<String>){
    var s ="A programmer gets stuck in the shower because the instructuions on the shampoo were: Lather, wash, and Repeat."
    println(s)
    s = s.toLowerCase()

    //counters initialization
    var vowelCount = 0
    var consonantCount = 0

    //definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnopqrstvwxz"

   //main loop
    for (c in s){
        if (vowels.contains(c)){
            vowelCount++
        } else if (consonants.contains(c)){
            consonantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")
}