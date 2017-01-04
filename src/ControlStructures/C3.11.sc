def echoWahtYouGateMe(x : Any) : String = x match {
    case 0 => "zero"
    case true => "true"
    case "Hello" => "you said 'hello' "
    case Nil => "an empty List"
    case List(0, _, _) => "a three list with 0 as the first element"
    case List(1, _ *) => "a list beginning iwth 1 having any number of elements"
    case Vector(1, _*) => "a vector starting with 1, having any number of elements"

    case (a, b) => s"got $a and $b"
    case (a, b, c) => s"got $a, $b, and $c"

    case s : String => s"you gave me this string: $s"
    case i : Int => s" thanks for the int $i"
    case f : Float => s"thanks for the float : $f"
    case a : Array[Int] => s"an array of int : ${a.mkString(",")}"
    case as: Array[String] => s"an array of strings : ${as.mkString(",")}"
    case m : Map[_, _] => m.toString

    case _ => "Unknown"
}

println(echoWahtYouGateMe("a"))
println(echoWahtYouGateMe(List(1, 2, 3)))
