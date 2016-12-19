println (Short.MinValue)


println(Short.MaxValue)

println(Int.MinValue)

println(Float.MinValue)



"100".toInt

"100".toDouble

"100".toFloat

"1".toLong

"1".toShort

"1".toByte

//"foo".toInt

Integer.parseInt("1", 2)

Integer.parseInt("10", 2)

Integer.parseInt("100", 2)

Integer.parseInt("1", 8)

Integer.parseInt("10", 8)


implicit class StringToInt(s: String){
    def toInt(radix : Int) = Integer.parseInt(s, radix)
}





