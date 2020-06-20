object ZAD5 {
  def main(args: Array[String]) : Unit = {

    val employee = new Person2("Justin", "Bieber", 5) with Employee
    employee.payment = 3000
    println(s"Employee:\n payment: ${employee.payment}\n tax value: ${employee.tax}")

    val teacher = new Person2("Miley", "Cirus", 10) with Teacher
    employee.payment = 3000
    println(s"Teacher:\n payment: ${teacher.payment}\n tax value: ${teacher.tax}")

    val student = new Person2("Katy","Perry", 15) with Student
    println(s"Student:\n tax: ${student.tax}")

    val studentEmployee = new Person2("Jason","Derulo",20) with Student with Employee
    studentEmployee.payment = 3000
    println(s"StudentEmployee:\n payment: ${studentEmployee.payment}\n tax value: ${studentEmployee.tax}")

    val employeeStudent = new Person2("Mick","Jagger",25) with Employee with Student
    employeeStudent.payment = 3000
    println(s"EmployeeStudent:\n payment: ${employeeStudent.payment}\n tax value: ${employeeStudent.tax}")
  }
}

case class Person2(name: String,surname: String,private var _tax: Double){
  def tax: Double = _tax
}

trait Employee extends Person2{
  var payment = 3000.0
  override def tax: Double = payment * 0.2
}

trait Teacher extends Employee {
  override def tax: Double = payment * 0.1
}

trait Student extends Person2 {
  override def tax: Double = 0
}