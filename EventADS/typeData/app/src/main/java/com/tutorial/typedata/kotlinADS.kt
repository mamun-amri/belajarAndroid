package com.tutorial.typedata

fun main(){
    /*data type*/
    var nama : String = "mamun"
    var umur : Int = 23

   /* val alamat : String = null

    val lengthVariable = alamat.length
    println(lengthVariable)

    val lengthVariableElvis = alamat?.length ?: "rumah"
    println(lengthVariableElvis)

    val lengthVariableAssert = alamat!!.length
    println(lengthVariableAssert)*/

    /*data class*/
    data class Student(
        val name: String,
        val age: Int
    )

    data class Dosen(val name:String, val age:Int)

    val studentDataClass = Student("mamun", 23)
    println(studentDataClass)
    val studentClass = Dosen("amri",22)
    println(studentClass)


    /*kondisi if when*/
    val usia = 22
    if(usia < 23){
        println("usia muda")
    }else{
        println("usia dewasa")
    }

    when(usia){
        22 -> println("usia muda")
        30 -> println("usia dewasa")
    }

    /*perulanga*/
    for (i in 0 until 5){
        println("perluangan ke - " +i)
    }

    val variableList : List<Int> = listOf(1,2,3,4,5)
    println("ini indeks ke - " + variableList[3])

    val mutableList: MutableList<Int> = mutableListOf(6,7,8,9)
    println("ini indeks ke - " + mutableList[2])

    /*map*/
    val lab = mapOf(
        "lab1" to "multimedia",
    "lab2" to "pemrograman"
    )

    println(lab["lab1"])

    val lambdaName = "mamun"

    
























































}