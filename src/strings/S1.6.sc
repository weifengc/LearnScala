val numPattern = "[0-9]+".r

val address = " 123 Main Street Suite 101"

val match1 = numPattern.findFirstIn(address)

val matches = numPattern.findAllIn(address)

matches.foreach(println)

val matchesArr = numPattern.findAllIn(address).toArray

import scala.util.matching.Regex

val numPattern2 = new Regex("[0-9]+")

val match3 = numPattern2.findFirstIn(address)

val result = numPattern.findFirstIn(address).getOrElse("no match")

numPattern.findAllIn(address).foreach(println)

match1 match {
    case Some(s) => println(s"Found $s")
    case None => println("Found nothing")
}

