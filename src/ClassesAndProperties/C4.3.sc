
object Pizza{
    val DEFAULT_CURST_SIZE = 12
    val DEFAULT_CURST_TYPE = "THIN"
}


class Pizza (var crustSize : Int, var curstType : String) {
    //one =arg auxiliary constructor
    def this(curstSize : Int){
        this(curstSize, Pizza.DEFAULT_CURST_TYPE)
    }

    //one-arg auxiliary constructor
    def this(curstType : String){
        this(Pizza.DEFAULT_CURST_SIZE, curstType)
    }

    def this(){
        this(Pizza.DEFAULT_CURST_SIZE, Pizza.DEFAULT_CURST_TYPE)
    }

    override def toString: String = s"A $crustSize inch pizza with a $curstType curst"

}

val p1 = new Pizza("Turkey")

val p2 = new Pizza(19)

val p3 = new Pizza()

val p4 = new Pizza(20, "Chicken")


class Socket(var timeout : Int = 1000)

val s1 = new Socket()
s1.timeout

val s2 = new Socket(2000)
s2.timeout


