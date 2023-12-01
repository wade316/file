package com.song.calculator


fun main() {
    val calc = Calculator()
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    println("1 더하기 2 결과는 : ${calc.addOperation(AddOperation(), 1, 2)} 입니다")
}