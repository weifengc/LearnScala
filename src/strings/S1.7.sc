val address = "123 Main Street".replaceAll("[0-9]", "x")

val regex = "[0-9]".r
val newAddress = regex.replaceAllIn("123 Main Street", "x")

val result = "123".replaceFirst("[0-9]" , "x")

