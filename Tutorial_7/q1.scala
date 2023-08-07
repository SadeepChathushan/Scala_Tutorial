import scala.io.StdIn
object q1 extends App
{
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }
  println("Enter the list of Integers seperated by comma: ")
  val getString = StdIn.readLine()
  val convertList = getString.split(",").map(_.trim.toInt).toList
  val outputList = filterEvenNumbers(convertList)

  println(outputList)
}
