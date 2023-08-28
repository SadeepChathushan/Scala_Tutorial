object Q2 {
  def main(args:Array[String]): Unit =
  {
    val words = List("apple", "banana", "cherry", "date")
    val result = countLetter(words)
    println("Count of letters in all words:"+result)
  }

  def countLetter(x: List[String]):Int =
    {
      val convert = x.map(str=>str.length)
      val letterCount = convert.reduce((x,y)=>x + y)
      letterCount
    }
}
