fun main(){
    creatMobil("jazz",500)
    creatMobil()
    creatMobil(cc = 400)//untuk specifik hanya memberi cc nya
}

fun creatMobil(name: String = "standar", cc: Int = 200) {
    println("mobil $name punya cc $cc")
}
