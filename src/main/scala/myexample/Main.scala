package myexample

import messages.proto.{Money, Person}


object Main {
  def main(args: Array[String]): Unit = {
    val s = Person("", Money(BigDecimal("123.123")))
    println(s.toByteArray)
  }
}
