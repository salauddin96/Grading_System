import java.util.Scanner
fun main(args: Array<String>) {
    var read = Scanner(System.`in`)

    println("Enter Your Sub_Mark: ")

    val inputmark:Int = read.nextInt()

    if (inputmark <= 100 && inputmark >= 80) {
        val keno = 100 - inputmark
        println("Your Grade is A+")
        println("Outstanding")
        println("$keno kom paico keno?")
    }
    else if (inputmark <= 79 && inputmark >= 70) {
        println("Your Grade is A")
        println("Good")
    }
    else if (inputmark <= 69 && inputmark >= 60) {
        println("Your Grade is A-")
        println("Not bad")
    }
    else if (inputmark <= 59 && inputmark >= 50) {
        println("Your Grade is B")
    }
    else if (inputmark <= 49 && inputmark >= 40) {
        println("Your Grade is C")
    }
    else if (inputmark <= 39 && inputmark >= 33) {
        println("Your Grade is D")
    }
    else if (inputmark <= 32 && inputmark >= 0) {
        println("Your Grade is F")
        println("Again seat for exam")
    }
}