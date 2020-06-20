package CW1

object CW1 {

  val daysList: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
  val digits : List[Int] = List(0,1,0,2,3,0,4,5,6,7,0,0,8,9)
  val products = Map("iphone" -> 1000, "xiaomi" -> 500, "nokia" -> 400)
  var values : List[Double] = List(1.2, 2.3, -5, -5.7, 12.4, 12 , 15)

  def main(args: Array[String]): Unit ={
    println("1A")
    DaysToStringFor(daysList)
    println()
    println("1B")
    PDaysToStringFor(daysList)
    println()
    println("1C")
    DaysToStringWhile(daysList)
    println()
    println("2a")
    println(Recur(daysList))
    println()
    println("2b")
    println(RecurFromLast(daysList))
    println()
    println("3")
    println(RecurTail(daysList, result = ""))
    println()
    println("4a")
    println(daysList.tail.foldLeft(daysList.head)((m,n) => m + ", " + n))
    println("4b")
    println(daysList.foldRight("")((m,n) => m + ", " + n))
    println("4c")
    println(daysList.foldLeft("")((m,n) => m + (if(n.startsWith("P")) n+", " else "")))
    println()
    println("5")
    val productsAfterDiscount = products.transform((k,v) => v * 0.9)
    val productsAfterDisc = products.mapValues(_*0.9) // dwa sposoby
    println("Produkty przed zniżką: \n"+products.toList+ "\n")
    println("Produkty po zniżce: \n"+productsAfterDiscount.toList)
    println()
    println("6")
    WriteTruple("Xiaomi",5)
    println()
    println("7")
    println(SearchOption(1))
    println(SearchOption(3))
    println()
    println("8")
    println(Remove0(digits))
    println()
    println("9")
    println(digits)
    println(AddOneEach(digits))
    println()
    println("10")
    print(FilterScope(values))

  }

  def FilterScope(digits: List[Double]): List[Double] = {
    digits.filter(x => x >= -5 && x <= 12).map(_.abs)
  }

  def AddOneEach(digits: List[Int]): List[Int] = {
    digits.map(v => v+1)
  }

  def Remove0(digits: List[Int]): List[Int] ={
    digits.filter(_.!=(0))
  }

  def SearchOption(id: Int): Option[(Int, String)] = {
    val somethingMap = Map(1 -> "something1", 2 -> "something2")
    somethingMap.find({case (k,v) => k == id})
  }

  def WriteTruple(t: (String, Int)): Unit ={
    println(t)
  }

  def DaysToStringFor(days: List[String]): Unit = {
    for(i <- days){
      print(i+", ")
    }
  }

  def PDaysToStringFor(days: List[String]): Unit ={
    for(i <- days if i.startsWith("P")){
      print(i+", ")
    }
  }

  def DaysToStringWhile(days: List[String]): Unit ={
    var a: Int = 0
    while(a < days.length){
      print(days(a)+", ")
      a+=1
    }
  }

  def Recur(days: List[String]) : String ={
    if(days.length == 1)
      return days.head
    days.head+", "+Recur(days.tail)
  }

  def RecurFromLast(days: List[String]) : String ={
    if(days.length == 1)
      return days.head
    RecurFromLast(days.tail)+", " + days.head
  }

  def RecurTail(days: List[String], result: String) : String ={
    if(days.length == 0)
      result;
    else RecurTail(days.tail, result + days.head + ", ")
  }
}
