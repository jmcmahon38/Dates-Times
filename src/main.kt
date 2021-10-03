import java.time.LocalDate
import java.time.LocalDate.now
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main(args: Array<String>) {
// Next full moon 10/20/2021
// Current date
    val date = LocalDate.now()

    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = date.format(formatter)

    val nextFullMoon : LocalDate = LocalDate.of(2021, 10, 20)
    // how do I convert this to a new format?
    val followingNextFullMoon : LocalDate = LocalDate.of(2021, 11, 19)
    val daysToNextMoon = date.until(nextFullMoon, ChronoUnit.DAYS)
    val daysToFollowingNextFullMoon = nextFullMoon.until(followingNextFullMoon, ChronoUnit.DAYS)

    println("today is: ${today.format(formatter)}\n" +
            "next full moon is: $nextFullMoon\n" +
            "Time between now and next full moon: $daysToNextMoon\n" +
            "Time between the next full moons: $daysToFollowingNextFullMoon\n")




// notes
    // Current date and time
//    val dateTime = LocalDateTime.now()
//    println(dateTime)

// Curent date
//    val date = LocalDate.now()
//    println(date)

// Current time
//    val time = LocalTime.now()
//    println(time)
//    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
//    println("years: $year")
//    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
//    var today = LocalDate.now()
//    println("today without format: $today")
//    var formattedToday = today.format(formatter)
//
//    println("Today is $formattedToday")
//    println("Enter your birth month: ")
//    var birthMonth: Int = readLine()!!.toInt()
//
//    println("Enter your birthday: ")
//    var birthDay: Int = readLine()!!.toInt()
//    println("Enter your birthyear: ")
//    var birthyear: Int = readLine()!!.toInt()
//
//    var holdBirthday: LocalDate = LocalDate.of(birthyear, birthMonth, birthDay)
//
//    if (holdBirthday.isBefore(today)){
//        println("you were born $holdBirthday")
//        holdBirthday = LocalDate.of(year+1, birthMonth, birthDay)//holdBirthday.plusYears(1)
//        println("next birthday $holdBirthday")
//    }
//
//    val nextBirthday = holdBirthday.format(formatter)
//    var daysToBirthday = today.until(holdBirthday, ChronoUnit.DAYS)
//    if (daysToBirthday.toInt() == 0) {
//        println("Happy Birthday!")
//    } else {
//        println("Your next birth is: $nextBirthday and days are $daysToBirthday")
//    }

    // Design a program that will determine when the next full moon will be based upon the current date.




}