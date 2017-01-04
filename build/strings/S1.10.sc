implicit class StringImprovements(s:String){
    def increment = s.map(c => (c+1).toChar)
}

val result = "HAL".increment


implicit class MathUtils(num : Int){
    def add(n : Int ) = num + n

    def selfCompute(n : Int) = num * n
}


2.add(2)

2.selfCompute(3)

object StringUtils{
    implicit class StringImprovements(val s : String){
        def increment = s.map(c => (c + 1).toChar )
    }
}

object Main extends App{
    println("HAL".increment)
}



