val foo = """ This is
    a multiline
    Stirng  """

val speech =
    """
      |Four score and
      |seven year ago
    """.stripMargin

val speech2 =
    """
      #Four score and
      # seven years ago
    """.stripMargin('#')


//This will remove the \n and replace it to be a space
val speech3 =
    """
      |Four score and
      |Seven years ago
      |our fasters
    """.stripMargin.replaceAll("\n", " ")

val s =
    """
      |This is known as a
      |"multipleline" string
      |or 'heredoc' syntax
    """.stripMargin.replaceAll("\n", " ")





