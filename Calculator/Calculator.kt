package com.song.calculator



fun main() {
    var num1 = readLine()!!.toInt()
    var op = readLine()!!
    var num2 = readLine()!!.toInt()
    var result = 0

    when (op) {
        "+" -> {
            result = num1 + num2
        }

        "-" -> {
            result = num1 - num2
        }

        "*" -> {
            result = num1 * num2
        }

        "/" -> {
            result = num1 / num2
        }

        "%" -> {
            result = num1 % num2
        }
        else -> {
            println("잘못된 계산입니다, 다시 입력해 주세요")
        }


    }

    if(op == "+") {
        result = num1 + num2
    } else if(op == "-") {
        result = num1 - num2
    } else if(op == "*") {
        result = num1 * num2
    } else if (op == "/") {
        result = num1 / num2
    } else if (op == "%") {
        result = num1 % num2
    }
    else {
        println("잘못된 계산입니다, 다시 입력해 주세요")
    }

    println(result)

}

//class Calculator {
//    fun addOperation(): Int {
//
//    var num1 = readLine()!!.toInt()
//    var op = readLine()!!
//    var num2 = readLine()!!.toInt()
//    var result = 0
//
//    when (op) {
//        "+" -> {
//            result = num1 + num2
//        }
//
//        "-" -> {
//            result = num1 - num2
//        }
//
//        "*" -> {
//            result = num1 * num2
//        }
//
//        "/" -> {
//            result = num1 / num2
//        }
//
//        "%" -> {
//            result = num1 % num2
//        }
//        else -> {
//            println("잘못된 계산입니다, 다시 입력해 주세요")
//        }
//
//
//    }
//
//        return result
//
//    }
//}







