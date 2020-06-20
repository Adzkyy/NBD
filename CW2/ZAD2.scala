object ZAD2 {
  def main(args: Array[String]): Unit ={

    println("Account 1 :")
    val account1 = new BankAccount(1000)
    println(account1.balance)
    account1.DepositMoney(500)
    println(account1.balance)
    account1.WithdrawMoney(1100)
    println(account1.balance)

    println("\nAccount 2 :")
    val account2 = new BankAccount()
    println(account2.balance)
    account2.DepositMoney(100)
    println(account2.balance)
    account2.WithdrawMoney(300)
    println(account2.balance)
  }
}

class BankAccount (private var _balance: Double){

  def balance: Double = _balance

  def this (){
    this(0)
  }

  def WithdrawMoney(amount: Double) ={
    _balance = _balance - amount
  }

  def DepositMoney(amount: Double) ={
    _balance= _balance + amount
  }
}
