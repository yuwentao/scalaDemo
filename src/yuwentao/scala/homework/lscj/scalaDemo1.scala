package yuwentao.scala.homework.lscj

object scalaDemo1 {
  //���볣�����ֵ
  def maxConst(i: Int, j: Int): Unit =
    {
      if (i > j) {
        println(i);
      } else {
        println(j)
      }
    }
  //�ַ�ת��Ϊʮ���Ʊ���
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