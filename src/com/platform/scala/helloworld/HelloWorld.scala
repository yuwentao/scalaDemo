package com.platform.scala.helloworld

object HelloWorld {
  def main(args: Array[String]): Unit = {
    //println("Hello World");
    args.filter((arg: String) => arg.startsWith("G"))
      .foreach((arg: String) => Console.println("Found " + arg))
  }
}