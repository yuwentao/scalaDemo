package com.platform.scala.helloworld

object Timer3 {
  def periodicCall(seconds: Int, callback: () => Unit): Unit =
    {
      while (true) {
        callback()
        Thread.sleep(seconds * 1000)
      }
    }

  def main(args: Array[String]): Unit =
    {
      periodicCall(1, () =>
        Console.println("Time flies... oh, you get the idea."))
    }
}