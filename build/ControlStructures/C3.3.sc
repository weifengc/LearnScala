//Use a for loop with embedded if statements

for (i <- 1 to 10 if i % 2 == 0) println(i)

for{
    i <- 1 to 10
    if i % 2 == 0
}println(i)

for{
    i <- 1 to 10
    if i > 3
    if i < 6
    if i % 2 == 0
}println(i)


