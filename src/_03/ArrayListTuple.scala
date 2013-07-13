package _03

import java.math.BigInteger

/**
 * Created with IntelliJ IDEA.
 * User: ishi
 * Date: 2013/01/30
 * Time: 21:22
 * To change this template use File | Settings | File Templates.
 */
object ArrayListTuple {
  def main(args: Array[String]):Unit = {
    val big = new BigInteger("12345")
    println(big)

    val greetString = new Array[String](3)
    greetString(0) = "Hello "
    greetString(1) = ", "
    greetString(2) = "world\n"
    for (i <- 0 to 2) {
      print(greetString(i))
    }

    val numNames = Array("zero", "one", 1);
    for (i <- 0 to 2) {
      println(numNames(i))
    }

    val oneTwoThree = List(1, 2, 3)
    val oneTwo= List(1, 2)
    val threeFour = List(3, 4)

    val oneTwoThreeFour = oneTwo ::: threeFour;
    val oneTwoThreeFour2 = oneTwo :: threeFour;

    println(oneTwoThreeFour)
    println(oneTwoThreeFour2)

    val pair = (99, "LuftBallons")
    println(pair.getClass)
  }
}
