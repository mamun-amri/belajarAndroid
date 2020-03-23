var pokemons = mutableMapOf<String,Int>(
                "charmander"    to 100,
                "pikachu"       to 100,
                "pulbasaur"     to 100
)

fun main(args:Array<String>){
    println(pokemons.toList())
    addNewPokemon("cupika",50)
    upgradePower("pikachu",10)
    battle("pikachu","pulbasaur")
}

fun addNewPokemon(nama:String,power:Int = 100){
    pokemons.put(nama,power)
    println("$nama berhasil dibuat")
}

fun upgradePower(nama:String , power:Int = 10){
    var newPower = pokemons[nama]!! + power
    pokemons.replace(nama,newPower)
    println("$nama powernya menjadi $newPower ")
}

fun battle(pokemon:String,pokemon1: String){
    var powerPokemon = pokemons[pokemon]
    var powerPokemont1 = pokemons[pokemon1]
    if(powerPokemon!! < powerPokemont1!!) {
        pokemons.remove(pokemon)
        println("$pokemon ini dikalahkan oleh $pokemon1")
    } else if(powerPokemon!! > powerPokemont1!!){
        pokemons.remove(pokemon1)
        println("$pokemon1 ini dikalahkan oleh $pokemon")
    }else{
        println("$pokemon1 ini sama-sama kuat dengan $pokemon")
    }

    println(pokemons.toList())
}