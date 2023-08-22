class Rational2(n: Int, d: Int)
{
  require(d != 0, "Denominator must not be zero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  val numer: Int = n / gcdValue
  val denom: Int = d / gcdValue

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational2 = new Rational2(-numer, denom)

  def sub(that: Rational2): Rational2 =
  {
    new Rational2(numer * that.denom - that.numer * denom, denom * that.denom)
  }

  override def toString: String = s"$numer / $denom"
}

object q2
{
  def main(args: Array[String]): Unit =
  {
    val x = new Rational2(3, 4)
    val y = new Rational2(5, 8)
    val z = new Rational2(2, 7)

    val result = x.sub(y).sub(z)

    println(s"x: $x")
    println(s"y: $y")
    println(s"z: $z")
    println(s"x - y - z: $result")
  }
}
