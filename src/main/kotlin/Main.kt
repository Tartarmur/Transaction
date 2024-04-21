package ru.netology

fun main() {
    println("Расчет суммы комиссии за перевод:")
    val minComission = 35
    val comission = 0.0075
    val amount = 1_000 // c установленной не пользователем суммой

    var totalCommission = amount * comission
    if (totalCommission < minComission) {
        println("Cумма комиссии: " + minComission)
    } else {
        println("Cумма комиссии: " + totalCommission)
    }
}

