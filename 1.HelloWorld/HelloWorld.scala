// Data: Dec 31, 2014
// Description: First Scala Program
// From: A Scala Tutorial for Java Programmers

// This format is like Java, which is purely object oriented.

// *object* declares a singleton object.
// [Static members do NOT exist in Scala]
// The declaration declares both a CLASS called HelloWorld,
// and an INSTANCE of that class.
// The INSTANCE is created on demand, the first time it is used.
object HelloWorld {
  def main (args : Array[String]) {
    println("Hello World")
  }
}

// vim: set ts=2 sw=2 et:
