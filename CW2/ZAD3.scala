object ZAD3 {

  def main(args: Array[String]): Unit ={
    println(GreetSpecificPerson(Person("Tony Montana","Scarface")))
    println(GreetSpecificPerson(Person("Jack Torrance","TheShining")))
    println(GreetSpecificPerson(Person("Sloth","TheGoonies")))
    println(GreetSpecificPerson(Person("Hodor","GameOfThrones")))
    println(Person("Bezimienny","Gothic"))
  }

  // Zmieniłem trochę koncepcje ale mam nadzieję, że to nie problem :)
  def GreetSpecificPerson(person: Person) ={
     person match {
      case Person(_,"Scarface") => s"Say 'hello' to my little friend! ${person.Name} in ${person.Surname}"
      case Person(_,"TheShining") => s"Heeeeere’s Johnny! ${person.Name} in ${person.Surname}"
      case Person(_,"TheGoonies") => s"Hey you guys! ${person.Name} in ${person.Surname}"
      case Person(_,"GameOfThrones") => s"Hodor! ${person.Name} in ${person.Surname}"
      case _ => "Witaj!"
    }
  }
}
case class Person (Name: String,Surname: String){}
