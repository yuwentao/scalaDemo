package yuwentao.scala.homework.lscj

/**
 * @author yuwentao
 *
 * 2014Äê6ÔÂ3ÈÕ
 */
object scalaDemo2 {
  def hello(m: String) = {
    var a = 1
    for (i <- m) a = a * i
    if (a % 2 == 0) a = a - 1
    else a
  }

  def main(args: Array[String]): Unit = {
	  val m="Scala"
	    println(hello(m))
  }
}