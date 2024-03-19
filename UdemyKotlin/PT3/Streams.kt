fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { index, num ->
        val complement = target - num
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, index)
        }
        map[num] = index
    }
    throw IllegalArgumentException("No two sum solution")
}

fun twoSumWithStreams(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { index, num ->
        val complement = target - num
        map[complement]?.let { return intArrayOf(it, index) }
        map[num] = index
    }
    throw IllegalArgumentException("No two sum solution")
}

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    // Calculate two sum without using streams
    val startTimeNoStream = System.currentTimeMillis()
    val resultNoStream = twoSum(nums, target)
    val endTimeNoStream = System.currentTimeMillis()
    val elapsedTimeNoStream = endTimeNoStream - startTimeNoStream

    println("Indices of the two numbers without using streams: ${resultNoStream[0]} and ${resultNoStream[1]}")
    println("Time taken without using streams: $elapsedTimeNoStream milliseconds")

    // Calculate two sum using streams
    val startTimeStream = System.currentTimeMillis()
    val resultStream = twoSumWithStreams(nums, target)
    val endTimeStream = System.currentTimeMillis()
    val elapsedTimeStream = endTimeStream - startTimeStream

    println("Indices of the two numbers using streams: ${resultStream[0]} and ${resultStream[1]}")
    println("Time taken using streams: $elapsedTimeStream milliseconds")
}
