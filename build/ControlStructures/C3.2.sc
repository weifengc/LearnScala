// THis is about how to use multiple loops

for(i <- 1 to 2; j <- 1 to 2) println(s"i is $i, j is $j")

for{
    i <- 1 to 2
    j <- 1 to 2
}{
    println(s"i is $i , j is $j")
}



for {
    i <- 1 to 3
    j <- 1 to 5
    k <- 1 to 10
}println(s"i = $i, j = $j, k = $k")


val array = Array.ofDim[Int](2,2)

