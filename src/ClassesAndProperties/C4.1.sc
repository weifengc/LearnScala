/**
  * Created by weifengc on 1/4/17.
  */

class Person(var firstName : String, var lastName : String) {

    println("the constrcutor begins")

    private val HOME = System.getProperty("user.home")

    var age = 0

    override def toString: String = s"$firstName $lastName is $age years old"

    def printHome { println(s"HOME = $HOME")}
    printHome

}


val p = new Person("Adam", "Meryer")


