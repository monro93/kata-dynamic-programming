class DiceCounter {
  fun howManyPossibilitiesToObtain(numberOfDice: Int, targetNumber: Int): Int =
    when(numberOfDice) {
      1 -> if (targetNumber in diceNumbers()) 1 else 0
      else -> diceNumbers().sumOf { diceValue ->
        howManyPossibilitiesToObtain(numberOfDice - 1, targetNumber - diceValue)
      }
    }

  private fun diceNumbers() = (1 .. 6)
}