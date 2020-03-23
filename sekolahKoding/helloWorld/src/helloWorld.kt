fun main(args: Array<String>){
    /*var names = arrayOf("mamun","amri")
    println(names.toList())*/
    var universitas = "unbaja"
    /*val hasil = if(universitas == "unbaja"){
        println("kampus ku adalah unbaja")
    }else{
        println("kampus ku bukan di universitas unbaja")
    }*/

    var uang:Int
    var utang:Int
    uang    = 10000
    utang   = 1000

    if(uang > utang){
        println("uang anda lebih besar")
    }else if(uang == utang){
        println("uang anda cukup dan hutang lunas")
    }else{
        println("sayang sekali uangnya tidak cukup")
    }

    //study kasus
    var buahan  = arrayOf("kelengkeng","apel","dukuh")
    var mobil   = arrayOf("bmw","lamborgini","ertiga")
    var result  = "dukuh"
    if(result in buahan){
        println("ini adalah " + result )
    }else{
        println("ini adalah " + result)
    }

    println("========= perulangan =========")
    for (i in 1..10){
        println("no $i")
    }

    val peringkat = arrayOf("gold","rubby","silver")
    for (item in peringkat){
        println(" yeah aku dapat $item")
    }

    println("========= latihan =========")
    var treasure = arrayOf("gold","silver","zonk","silver","silver","zonk","gold","gold","silver","zonk")
    treasure.toList()
    var gold    = 0
    var silver  = 0
    for(item in treasure){
        /*if(item == "gold") {
            gold++
        }else if(item == "silver"){
            silver++
        }*/

        when(item){
            "gold"      -> gold++
            "silver"    -> silver++
        }
    }

    println("gold $gold dan silver $silver")
}
