package cop._03

import scala.collection.mutable.Map

/**
 * Created with IntelliJ IDEA.
 * User: ishi
 * Date: 2013/07/13
 * Time: 14:29
 * To change this template use File | Settings | File Templates.
 */
class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val checksum = acc.checksum()
      cache += (s -> checksum)
      checksum
    }
}