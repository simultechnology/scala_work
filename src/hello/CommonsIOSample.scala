package hello

/**
 * Created with IntelliJ IDEA.
 * User: ishi
 * Date: 2012/08/30
 * Time: 1:30
 * To change this template use File | Settings | File Templates.
 */

import java.io._
import java.net._
import org.apache.commons.io._

object CommonsIOSample extends App {
  val in: InputStream = new URL("http://www.google.co.jp").openStream()
  try {
    println(IOUtils.toString(in))
  } finally {
    IOUtils.closeQuietly(in)
  }
}
