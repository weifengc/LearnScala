case class Person()

def isPerson(x : Any) :Boolean = x match {
    case p : Person => true
    case _ => false
}

println(isPerson(new Person))
println(isPerson("Person"))

trait SentienBeing
trait Animal extends SentienBeing
case class Dog(name : String ) extends Animal
case class Persons(name: String, age : Int) extends SentienBeing

def printInfo(x : SentienBeing) = x match {
    case Persons(name, age) => println(s"this is a person name $name, age $age")
    case Dog(name) => println(s"This is a dog with name $name")
}

printInfo(new Persons("Will", 27))
printInfo(new Dog("Denny"))

