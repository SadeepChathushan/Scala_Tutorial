import scala.io.StdIn
object q2 extends App
{
  def calculateSquare(numbers: List[Int]): List[Int] =
  {
    numbers.map(number => number * number)
  }
  print("Input Integers List seperated by commas: \n")
  val getString = StdIn.readLine()
  val convertList = getString.split(",").map(_.trim.toInt).toList
  val outputList = calculateSquare(convertList)
  print(outputList)
}
