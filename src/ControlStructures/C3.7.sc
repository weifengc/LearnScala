val i = 12

i match {
    case 1 => println("Jan")
    case 2 => println("Feb")
    case 12 => println("Dec")
    case _ => println(_)
}

val month = i match {
    case 1 => "January"
    case 2 => "February"
    case 3 => "March"
    case 12 => "Dec"
    case _ => "Invalid month"
}


