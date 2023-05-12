import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class DiceCounterTest {

    @ParameterizedTest
    @CsvSource("1, 1", "2, 1", "3, 1", "4, 1", "5, 1", "6, 1", "7, 0", "-1, 0")
    fun `Ex1_given one dice we get the expected result`(targetNumber: Int, expectedCombinations: Int) {
        val diceCounter = DiceCounter()
        val result = diceCounter.howManyPossibilitiesToObtain(1, targetNumber)
        assertEquals(expectedCombinations, result)
    }

    @Disabled("Do ex1 first")
    @ParameterizedTest
    @CsvSource("2, 1", "3, 2", "4, 3", "5, 4", "6, 5", "7, 6", "8, 5", "9, 4", "10, 3", "11, 2", "12, 1", "13, 0")
    fun `EX2_given two dices we get the expected result`(targetNumber: Int, expectedCombination: Int) {
        val diceCounter = DiceCounter()
        val result = diceCounter.howManyPossibilitiesToObtain(2, targetNumber)
        assertEquals(expectedCombination, result)
    }

    @Disabled("Do ex2 first")
    @ParameterizedTest
    @CsvSource("3, 15, 10", "4, 8, 35", "5, 12, 305", "7, 38, 210")
    fun `EX3_given n dices we get the expected result`(numberOfDices: Int, targetNumber: Int, expectedCombination: Int) {
        val diceCounter = DiceCounter()
        val result = diceCounter.howManyPossibilitiesToObtain(numberOfDices, targetNumber)
        assertEquals(expectedCombination, result)
    }

    @Disabled("Do ex3 first")
    @Test
    fun `EX4_given 13 dices we get the expected result in a low time`() {
        val startTime = System.currentTimeMillis()
        val diceCounter = DiceCounter()
        val result = diceCounter.howManyPossibilitiesToObtain(13, 70)
        val endTime = System.currentTimeMillis()
        assertEquals(124787, result)
        assert(endTime - startTime < 500) { "It took too long: ${endTime - startTime}ms" }
    }
}