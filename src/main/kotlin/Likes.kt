fun main() {
    val amountOfLikes0 = 34
    val amountOfLikes1 = 501
    val amountOfLikes2 = 1211
    println("Понравилось " + amountOfLikes0 + " " + message(amountOfLikes0))
    println("Понравилось " + amountOfLikes1 + " " + message(amountOfLikes1))
    println("Понравилось " + amountOfLikes2 + " " + message(amountOfLikes2))
}

fun message(amount: Int): String {
    return if (amount % 10 == 1 && amount % 100 != 11) "человеку" else "людям"
}