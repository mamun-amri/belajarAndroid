fun main(args: Array<String>){
    var lagi = ""
    do{
        print("masukan angka a = ")
        val a = readLine()
        print("masukan angka b = ")
        val b = readLine()
        print("operator = ")
        val operator = readLine()
        val angkaA = a!!.toInt()
        val angkaB = b!!.toInt()
        val hasil = when (operator) {
            "*" -> angkaA * angkaB
            "+" -> angkaA + angkaB
            "/" -> angkaA / angkaB
            "-" -> angkaA - angkaB
            else -> {
                " masukan operator salah satu (-,+,/,*) = "
            }
        }
        println("hasil dari $angkaA $operator $angkaB adalah = $hasil ")
        print("apakah mau menghitung lagi y/t = ")
        var lagi = readLine()
        if (lagi == "y") lagi = "y"
        else lagi = "t"
    }while(lagi == "y")
}