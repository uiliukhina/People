fun main() {
    val amountOfLikes0 = 34
    val amountOfLikes1 = 501
    println("Понравилось " + amountOfLikes0 + " " + message(amountOfLikes0))
    println("Понравилось " + amountOfLikes1 + " " + message(amountOfLikes1))
}

fun message(amount: Int): String {
    return if (amount % 10 == 1) "человеку" else "людям"
}