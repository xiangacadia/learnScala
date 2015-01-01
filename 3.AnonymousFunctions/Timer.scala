// Data: Dec 31, 2014
// Description: Anonymous functions for functions only used once
// From: A Scala Tutorial for Java Programmers

object Timer {

	def onePerSecond (callback: () => Unit) {
		while (true) { callback(); Thread sleep 1000}
	}

	def main(args: Array[String]) {
		// '=>' seperates the function's argument list from its body
		onePerSecond (() =>
			println ("times flies likes an arrow..."))
	}
	
}