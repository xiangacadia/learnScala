// Data: Dec 31, 2014
// Description: Callback functions, pass function as an object
// From: A Scala Tutorial for Java Programmers

object Timer {

	// ()=> is for the type of functions that take no argument and 
	// return nothing
	// the type *Unit* is similar to *void* in C/C++
	def onePerSecond (callback: () => Unit) {
		while (true) { callback(); Thread sleep 1000}
	}

	def timeFlies() {
		println ("time flies likes an arraow...")
	}

	def main(args: Array[String]) {
		onePerSecond (timeFlies)
	}
	
}