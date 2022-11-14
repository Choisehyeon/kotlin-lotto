package lotto

class Validator {

    fun checkMoneyInput(input : String) {
        checkInputNullValidation(input)
        checkStringToIntValidation(input)
        checkMoneyValueValidation(input)
    }

    fun checkInputNullValidation(input: String) {
        require(input != null) { INPUT_NULL_ERROR_MSG }
    }
    fun checkStringToIntValidation(input : String) {
        try {
            input.toInt()
        } catch (e : NumberFormatException) {
            throw IllegalArgumentException(INPUT_VALUE_ERROR_MSG)
        }
    }
    fun checkMoneyValueValidation(input : String) {
        require(input.toInt() % LOTTO_PRICE == 0) { MONEY_VALUE_ERROR_MSG }
    }

    companion object {
        const val LOTTO_PRICE = 1000

        const val INPUT_NULL_ERROR_MSG = "[ERROR] 값이 입력되지 않았습니다."
        const val INPUT_VALUE_ERROR_MSG = "[ERROR] 값이 숫자로만 이루어져야합니다."
        const val MONEY_VALUE_ERROR_MSG = "[ERROR] 돈은 1000으로 나누어떨어지는 값이어야 합니다."
    }
}