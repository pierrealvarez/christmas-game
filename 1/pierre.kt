class Solution {
    fun isPalindrome(number: Int): Boolean {
        val numberToCharList = number.toString().toList()
        val numberToListSize = numberToCharList.size

        val leftDivideBy = if (numberToListSize % 2 == 0) {
            numberToListSize / 2
        } else {
            numberToListSize / 2 + 1
        }

        val splitRight = numberToCharList.subList(0, numberToListSize / 2)
        val splitLeft = numberToCharList.subList(leftDivideBy, numberToListSize)

        return splitRight == splitLeft.reversed() && numberToListSize != 1
    }
}
