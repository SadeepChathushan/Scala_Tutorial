class rational(n: Int, d: Int)
{
  require(d != 0, "Denominator must not be zero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  val numer: Int = n / gcdValue
  val denom: Int = d / gcdValue

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: rational = new rational(-numer, denom)

  override def toString: String = s"$numer / $denom"
}

object Main
{
  def main(args: Array[String]): Unit =
  {
    val x = new rational(3, 4)
    val negX = x.neg

    println(s"x: $x")
    println(s"Negative x: $negX")
  }
}
