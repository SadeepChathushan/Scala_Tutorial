object Q1 {
  def main(args: Array[String]): Unit = {
    val celcius = List(0, 10, 20, 30)
    val avg = calculateAverage(celcius)
    println("Average Fahrenheit temperature:"+ avg)
  }

  def calculateAverage(cel: List[Int]): Double =
  {
    val far = cel.map(celsius => (celsius * 9/5) + 32)
    val sumFahrenheit = far.reduce(_ + _)
    val average = sumFahrenheit / cel.length
    average
  }
}
