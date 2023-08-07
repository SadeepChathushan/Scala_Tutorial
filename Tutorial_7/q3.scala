import scala.io.StdIn
object q3 extends App
{
  def isPrime(number: Int): Boolean =
  {
    if (number <= 1) return false
    if (number <= 3) return true

    for (i <- 2 to Math.sqrt(number).toInt)
    {
      if (number % i == 0)
      {
        return false
      }
    }
    true
  }

  def filterPrime(numbers: List[Int]): List[Int] =
  {
    numbers.filter(isPrime)
  }
  print("Enter input Integers seperated by commas: \n")
  val getString = StdIn.readLine()
  val inputList = getString.split(",").map(_.trim.toInt).toList
  val outputList = filterPrime(inputList)
  print(outputList)
}
