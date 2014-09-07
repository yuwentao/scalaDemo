package yuwentao.scala.homework.lscj

object scalaDemo1 {
  //输入常量最大值
  def maxConst(i: Int, j: Int): Unit =
    {
      if (i > j) {
        println(i);
      } else {
        println(j)
      }
    }
  //字符转换为十进制编码
  def changeCharToInt(ss: Char): Int =
    {
      var tt: Int = ss.toInt
      println(tt);
      return tt;
    }
 
  def main(args: Array[String]): Unit =
    {
      maxConst(10, 100);
      changeCharToInt('F');
    }
}