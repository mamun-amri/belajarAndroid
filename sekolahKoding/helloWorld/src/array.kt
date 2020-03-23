fun main(args: Array<String>){
    val nums = intArrayOf(1,2,4,5)
    for(num in nums)
        println(num)
    println(nums.toList())

    val seats = arrayOf(
        intArrayOf(1,2,3,4,5),
        intArrayOf(11,22,33,44,55),
        intArrayOf(111,222,333,444,555)
    )
    println("=============================")
    for(seat in seats)
        for(num in seat)
            println(num)
    print(seats.toList())
}