val items = mutableMapOf<String,Int>("mouse" to 2000,"keyboard" to 3000,"lampu" to 1500)

fun main(){
    println("================ Selamat Datang di Mamunshop ================")
    listMenu()
    pilihanUser()
}

fun pilihanUser(){
    print("silahkan pilih menu = ")
    var pilihanUser = readLine()
    when(pilihanUser){
        "1" -> barang()
        "2" -> belanja()
        "3" -> tambahBarang()
    }
}

fun listMenu(){
    println("pilih kode berikut\n" +
            "\t1. list barang\n" +
            "\t2. belanja\n" +
            "\t3. tambah barang\n" +
            "\t4. update barang\n"
    )
}

fun belanja(){
    print("masukan nama barang = ")
    var inputBarang = readLine()
    val barangList = inputBarang!!.split(",")

    var total = beli(barangList.toTypedArray())
    println("Total Belanja = $total")
    print("masukan uang anda = ")
    var uangUser: String? = readLine()
    var uang = uangUser!!.toInt()
    bayar(uang,total)
}

fun bayar(uang: Int, total: Int) {
    var kembalian = uang - total
    if(uang > total){
        println("uang anda cukup kembaliannya $kembalian")
    }else if(uang < total){
        println("uang anda tidak cukup, kekurangan $kembalian")
    }else{
        println("uang anda tidak cukup, sisa $kembalian")
    }
}

fun beli(items: Array<String>): Int {
    var totalBelanja = 0
    for(item in items){
        when(item){
            "mouse" -> totalBelanja +=2000
            "keyboard" -> totalBelanja +=3000
            "lampu" -> totalBelanja +=1500
            else -> totalBelanja += 0
        }
    }
    return totalBelanja
}

fun barang(){
    for(item in items){
        println("$item")
    }
    print("apakah ingin menampilkan list menu lagi ? ")
    val result = readLine()
    if(result == "y") {
        listMenu()
        pilihanUser()
    }
}

fun tambahBarang(){
    print("masukan nama barang =")
    val name = readLine() 
    print("masukan harga barang = ")
    val inputHarga = readLine()
    val harga = inputHarga!!.toInt()

    items.put(name!!,harga)
    if(!name.isBlank() && !inputHarga.isBlank()){
        println("$name berhasil ditambahkan")
        pilihanUser()
    }else{
        println("$name gagal ditambahkan")
        pilihanUser()
    }
}