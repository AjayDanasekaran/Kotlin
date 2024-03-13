sealed class Result {
    class Success(val message: String) : Result()
    class Error(val error: Throwable) : Result()
}

fun processResult(result: Result) {
    when (result) {
        is Result.Success -> {
            println("Success: ${result.message}")
        }
        is Result.Error -> {
            println("Error: ${result.error.message}")
        }
    }
}

fun main() {
    val successResult = Result.Success("Data loaded successfully")
    val errorResult = Result.Error(Exception("Failed to load data"))

    processResult(successResult)
    processResult(errorResult)
}
