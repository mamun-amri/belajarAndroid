fun main(args: Array<String>){
    //collection
    //bersifat read-only dan mutable (bisa di ubah)
    /*jenis-jenis
    * list [data didalamnya boleh sama]
    * map [datanya itu harus ada key dan value]
    * set [datanya harus unique / tidak boleh sama]
    * */

    //List read-only
   /* val members = listOf<String>("mamun","yuli","amri","mamun")
    println(members.get(1))
    println(members.toList())*/
    // list mutblelist
    val members = mutableListOf<String>("mamun","yuli","amri","mamun")
    println("sebelum di tambah data" + members.toList())
    members.add("siti")//tambah data dengan metode add
    println(members.toList())

    //Set read-only
    /*val numbers = setOf<Int>(1,2,3,4,5,5)
    println(numbers.toList())*/
    //mutable
    val numbers = mutableSetOf<Int>(1,2,3,4,5,5)
    println(numbers.toList())
    numbers.add(10)
    println(numbers.toList())

    //map read-only
    /*val names = mapOf<Int,String>(1 to "mamun",5 to "yuli",3 to "mae")
    println(names.toList())
    for(key in names.keys)
        println(names[key])*/
    val names = mutableMapOf<Int,String>(1 to "mamun",5 to "yuli",3 to "mae")
        names.put(1,"amri")
        names.forEach {
                key, value -> println("id =  $key , value = " + value)
        }

    // metode yang ada di collection -> map dan filter
    val seats = listOf(1,20,5,30,100,300)
    //memfilter angka, dan hanya untuk menampilkan angka dibawah 100
    val lessThan100 = seats.filter {
        it < 100
        // i -> i < 100
    }
    println(lessThan100.toList())
    //angka yang ada di seats di kalikan dengan 2
    val double = seats.map {
        it * 2
        // x -> x * 2
    }
    println(double.toList())

    // any,all,none
    /*
    * any return true jika ada salah satunya benar
    * all return true jika semuanya benar
    * none return true jika semuanya salah
    * */
    val texts = listOf<String>("mamun","ramun","imun")
    val result = texts.all{
                            it.contains("mun")//all atau none
                            //it.contains("ram")//any
                            //it.contains("mam")//none
                        }
    if(result) println("benar!") else println("salah!")

    val words = listOf("hanya","kamu","harus","bagaimana","yang","dipilih")
    val word = words.find {
        it.startsWith("ha")
    }

    val word1 = words.findLast {
        it.startsWith("ha")
    }

    println(word)
    println(word1)
    println(words.sorted())
}