import util.control.Breaks._

    println("\n===Break example====")

    breakable {
        for (i <- 1 to 10) {
            println(i)
            if (i > 4) break
        }
    }



    println("\n=== Continue exmaple===")

    val searchMe = "peter piper picked a peck of pickled peppers"

    var numPs = 0

    for (i <- 0 until searchMe.length) {
        breakable {
            if (searchMe.charAt(i) != 'p') {
                break()
            } else {
                numPs += 1
            }
        }

    }
    println("Found " + numPs + "p's in the string")



breakable{
    for( i <- 1 to 10){
        println(i)
        if(i > 4) break()
    }
}

