object Q1 {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def Enc(c: Char, key: Int, a: String) = a((a.indexOf(c.toUpper) + key) % a.size)

  def Dec(c: Char, key: Int, a: String) = a((a.indexOf(c.toUpper) - key) % a.size)

  def cipher(algo: (Char, Int, String) => Char, s: String, key: Int, a: String) = s.map(algo(_, key, a))

  def main(args: Array[String]) = {
    val encword = cipher(Enc, "BAT", 3, alphabet)
    println(encword)
    val decword = cipher(Dec, encword, 3, alphabet)
    println(decword)

  }

}
