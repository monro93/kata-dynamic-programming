
typealias NumberOfDices = Int
typealias TargetNumber = Int
typealias Combinations = Int

class DiceCounter {

  private val memoizedValues: MutableMap<Pair<NumberOfDices, TargetNumber>, Combinations> = mutableMapOf()

  fun howManyPossibilitiesToObtain(numberOfDice: NumberOfDices, targetNumber: TargetNumber): Combinations {
    val key = numberOfDice to targetNumber
    return memoizedValues[key] ?: realCalculation(numberOfDice, targetNumber).also { memoizedValues[key] = it }
  }

  private fun realCalculation(numberOfDice: NumberOfDices, targetNumber: TargetNumber) = when (numberOfDice) {
    1 -> if (targetNumber in diceNumbers()) 1 else 0
    else -> diceNumbers().sumOf { diceValue ->
      howManyPossibilitiesToObtain(numberOfDice - 1, targetNumber - diceValue)
    }
  }

  private fun diceNumbers() = (1 .. 6)
}