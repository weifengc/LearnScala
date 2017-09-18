val s = "Foo"
try{
    val i =  s.toInt
}catch {
    case e : Exception => e.printStackTrace()
}

def toInt(s : String ) : Option[Int] =
    try {
        Some(s.toInt)
    }catch {
        case e : Exception => throw e
    }


@throw(classOf[NumberFormatException])
def toInt2(s : String ) : Option[Int] =
    try {
        Some(s.toInt)
    } catch {
        case e : NumberFormatException => throw e
    }

