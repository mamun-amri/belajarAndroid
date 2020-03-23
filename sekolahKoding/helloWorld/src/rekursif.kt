fun main(){
    var result = factorial(2)
    println("hasilnya adalah $result")
}

fun factorial(num:Int):Int{
    return if(num == 1) num
            else num*factorial(num-1)
}