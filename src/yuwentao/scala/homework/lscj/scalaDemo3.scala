package yuwentao.scala.homework.lscj

/**
  * @author yuwentao
  *
  * 2014��6��3��
  */
class scalaDemo3 {
  def sign(m: Int) = {
    m % 3 match {
      case 0 => "wrong"
      case 1 => 'A'
      case 2 => '\123'
    }
  }
  /*  val a = 58
    val b: Int = sign(a)
    val c = sign(b)
    println(b * c)*/
}