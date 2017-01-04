//use keyword yield to create a new collection object

val names = Array("chris", "ed", "maurice")

val capNames = for(e <- names) yield e.capitalize

capNames.foreach(println)

val lengths =  for( e <- names) yield {
    e.length
}


val fruits = scala.collection.mutable.ArrayBuffer[String]()

fruits += "apple"
fruits += "banana"
fruits += "orange"

val out  = for (e <- fruits) yield e.toUpperCase()

out.foreach(println)





