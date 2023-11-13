package blackjack.view
class InputView(private val maxTryCount: Int = DEFAULT_MAX_TRY_COUNT) {

    fun readLineNumber(question: String? = null, count: Int = 0): Int {
        val inputResult: Result<Int> = runCatching {
            val input: String = readLine(question, count)

            require(input.toIntOrNull() != null) { "숫자를 입력해주세요." }

            return input.toInt()
        }.onFailure {
            println(it.message)

            if (it is IllegalArgumentException) {
                return this.readLineNumber(question, count + 1)
            }
        }

        return inputResult.getOrThrow()
    }

    fun readLineStringList(question: String?, count: Int = 0, separator: String = ","): List<String> {
        val inputResult: Result<List<String>> = runCatching {
            val input: String = readLine(question, count)

            return input.split(separator)
        }.onFailure {
            println(it.message)

            if (it is IllegalArgumentException) {
                return this.readLineStringList(question, count + 1, separator)
            }
        }

        return inputResult.getOrThrow()
    }

    private fun readLine(question: String?, count: Int = 0): String {
        val inputResult: Result<String> = runCatching {
            if (count >= this.maxTryCount) {
                throw IllegalStateException("입력 횟수를 초과하였습니다.")
            }

            if (question != null) {
                if (count > 0) {
                    val leftCount: String = (maxTryCount - count).toString()
                    println("잘못된 입력입니다. $leftCount 번 더 입력할 수 있습니다.")
                }

                println(question)
            }

            return readlnOrNull() ?: throw IllegalArgumentException("입력값이 없습니다.")
        }.onFailure {
            if (count < this.maxTryCount) {
                return this.readLine(question, count + 1)
            }

            throw IllegalStateException("입력 횟수를 초과하였습니다.")
        }

        return inputResult.getOrThrow()
    }

    companion object {
        private const val DEFAULT_MAX_TRY_COUNT: Int = 3
    }
}
