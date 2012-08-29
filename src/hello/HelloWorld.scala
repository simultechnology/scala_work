/**
 * Created with IntelliJ IDEA.
 * User: ishi
 * Date: 2012/08/30
 * Time: 1:01
 * To change this template use File | Settings | File Templates.
 */

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val name: String = args(0)
    println("Hello %s!!".format(name));
  }
}

