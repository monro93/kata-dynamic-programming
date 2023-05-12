class DiceCounter {
  fun howManyPossibilitiesToObtain(numberOfDice: Int, targetNumber: Int): Int =
    when(numberOfDice) {
      1 -> if (targetNumber in 1..6) 1 else 0
      2 -> if (targetNumber in 2..7) targetNumber - 1 else 13 - targetNumber
      else -> TODO()
    }
}