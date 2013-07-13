package _03
/**
 * Created with IntelliJ IDEA.
 * User: ishi
 * Date: 2013/01/31
 * Time: 13:40
 * To change this template use File | Settings | File Templates.
 */

import scala.collection.mutable.Set

object SetMap {
  def main(args:Array[String]):Unit = {
    println("SetMap start!!")

    var jetSet = scala.collection.immutable.Set("Boeing", "Airbus")
    println(jetSet.getClass)
    println(jetSet.hashCode())
    jetSet += "Lear"
    println(jetSet.hashCode())
    println(jetSet.hashCode())
    println(jetSet.contains("Cessna"))
    println(jetSet)

    val movieSet = Set("Boeing", "Airbus")
    println(movieSet.getClass)
    println(movieSet.hashCode())
    movieSet += "Lear"
    println(movieSet.hashCode())
    println(movieSet.hashCode())
    println(movieSet.contains("Cessna"))
    println(movieSet)
  }
}

