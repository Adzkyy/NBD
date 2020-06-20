object ZAD1 {

  val workingDays = List("poniedziałek", "wtorek", "środa", "czwartek", "piątek")
  val weekendDays = List("sobota", "niedziela")
  val allDays = workingDays.union(weekendDays)

  def main(args: Array[String]): Unit ={
    for(day <- allDays){
      println(day+" - "+CheckDay(day))
    }
    val notaDay = "Wymyślonek"
    println(notaDay+" - "+CheckDay(notaDay))
  }

  def CheckDay(day: String): String ={
    day match{
      case day: String if workingDays.contains(day.toLowerCase) => "Praca"
      case day: String if weekendDays.contains(day.toLowerCase) => "Weekend"
      case _ => "Dzień nierozpoznany"
    }
  }
}
