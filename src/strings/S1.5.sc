val upper = "hello, world".map(c => c.toUpper)

val upper2 = "hello, world".map(_.toUpper)

val upper3 = "hello, world".filter(_ != 'l').map(_.toUpper)

for(c <- "hello") println(c)

val upper4 = for(c <- "hello, world") yield c.toUpper

val result = for{
    c <- "hello world"
    if c != 'l'
} yield c.toUpper

"hello".foreach(println)

