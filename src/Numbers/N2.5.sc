def -=(x: Double, y : Double, precision : Double) = {
    if ((x - y).abs < precision) true else false
}


val a = 0.3
val b = 0.1 + 0.2

-=(a, b, 0.00001)

