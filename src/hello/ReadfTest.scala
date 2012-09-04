/**
 * Created with IntelliJ IDEA.
 * User: ishikawatakatsugu
 * Date: 2012/09/05
 * Time: 2:54
 * To change this template use File | Settings | File Templates.
 */

object ReadfTest extends App {
  val list : List[Any] = readf("{0}/{1}/{2}")

  println("year  : %s".format(list(0)))
  println("month : %s".format(list(1)))
  println("day   : %s".format(list(2)))

  val (year: String, month: String, day: String) = readf3("{0}/{1}/{2}");

  println("year  : %s".format(year))
  println("month : %s".format(month))
  println("day   : %s".format(day))

}
