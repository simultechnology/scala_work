/**
 * Created with IntelliJ IDEA.
 * User: ishi
 * Date: 2013/07/13
 * Time: 14:40
 * To change this template use File | Settings | File Templates.
 */
import cop._03.ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]) =
    for (arg <- args)
      println(arg + ": " + calculate(arg))
}