package ru.netology

val timeAgo: Int = 600

val timeAgoMinutes: Int = timeAgo / 60
val timeAgoHours: Int = timeAgo / 3600

fun main() {
    agoToText()
}

fun agoToText() {
    when (timeAgo) {
        in 0..60 -> println("только что")
        in 61..60 * 60 -> println("$timeAgoMinutes ${minutesEnding(timeAgoMinutes)} назад")
        in 60 * 60 + 1..24 * 60 * 60 -> println("$timeAgoHours ${hoursEnding(timeAgoHours)} назад")
        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> println("сегодня")
        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> println("вчера")
        else -> println("давно")
    }
}

fun minutesEnding(timeAgoMinutes: Int) =
    when (timeAgoMinutes) {
        1 -> "минуту"
        21 -> "минуту"
        41 -> "минуту"
        51 -> "минуту"
        2, 3, 4 -> "минуты"
        22, 23, 24 -> "минуты"
        32, 33, 34 -> "минуты"
        42, 43, 44 -> "минуты"
        52, 53, 54 -> "минуты"

        else -> "минут"
    }

fun hoursEnding(timeAgoHours: Int) =
    when (timeAgoHours) {
        21 -> "час"
        2, 3, 4 -> "часа"
        22, 23, 24 -> "часа"

        else -> "часов"
    }