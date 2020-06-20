object ZAD4 {

  def main(args: Array[String]) : Unit = {
    println(OperationOnInt(2, x => x*10))
  }

  def OperationOnInt(i: Int, function: Int => Int): Int ={
    function(function(function(i)))
  }
}
