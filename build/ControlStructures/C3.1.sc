val a = Array("apple", "banana", "orange")

for (e <- a) println(e)

for (e <- a){
    val s = e.toUpperCase()
    println(s)
}

val newArray = for(e <- a ) yield e.toUpperCase()
newArray.foreach(println)

val newArray2 = for (e <- a) yield {
    val s = e.toUpperCase()
    s
}

newArray2.foreach(println)

for (i <- 0 until a.length){
    println(s"$i is  ${a(i)}")
}

for( (e, count) <- a.zipWithIndex ){
    println(s"$count is $e")
}

for (i <- 1 to 3 )println(i)


1 to 3


for (i <- 1 to 10 if i < 4 ) println(i)



val names = Map("fname" -> "Robert", "lname" -> "Goren")

for( (k, v) <-names ) println(s"$k is $v")

