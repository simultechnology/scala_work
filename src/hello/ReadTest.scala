/**
 * Created with IntelliJ IDEA.
 * User: ishi
 * Date: 2012/08/30
 * Time: 1:40
 * To change this template use File | Settings | File Templates.
 */
object ReadTest extends App {
  val name = readLine("Please input your name: ")
  println("Hello %s!!".format(name))

  println("Please input your age: ")
  val age = readInt()

  println("You are %d years old.".format(age))

  println("complete!!")
}

