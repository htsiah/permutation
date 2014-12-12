import scala.io.StdIn

object Permutations {

	def main(args: Array[String]) {
		print("How many lottery number? ")
		val num1 = readInt()
		println()
		print("How many lottery  number to pick? ")
		val num2 = readInt()
		println("Total Permutation: " + factorial(num1,num2).toString)
	}
	
	def factorial(x: BigInt, y: BigInt) : BigInt = {
		if (y > 1) 
			x * factorial( x - 1, y - 1)
		else
			x
	}

}
