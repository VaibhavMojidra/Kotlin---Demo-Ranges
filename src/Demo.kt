fun main(args: Array<String>) {

	//To create a Kotlin range we call rangeTo() function on the range start value and provide the end value as an argument.
	for (num in 1.rangeTo(4)) {
		println(num)
	}

	//The rangeTo() is often called in its operator form ... So the above code can be re-written using .. operator as follows:
	for (num in 1..4) {
		println(num)
	}

	//If we want to define a backward range we can use the downTo operator
	for (num in 4 downTo 1) {
		println(num)
	}
	//We can use step() function to define the distance between the values of the range.
	for (num in 1..10 step 2) {
		println(num)
	}

	//Ranges can be created for characters like we have created them for integer values.
	for (ch in 'a'..'d') {
		println(ch)
	}

	//The function reversed() can be used to reverse the values of a range.
	for (num in (1..5).reversed()) {
		println(num)
	}

	//The function until() can be used to create a range but it will skip the last element given.

	for (num in 1 until 5) {
		println(num)
	}

	//We can use first, last and step properties of a range to find the first, the last value or the step of a range.

	println((5..10).first)
	println((5..10 step 2).step)
	println((5..10).reversed().last)

	//The filter() function will return a list of elements matching a given predicate
	var a = 1..10
	val f = a.filter { T -> T % 2 == 0 }
	//There are many other useful functions we can apply to our range, like min, max, sum, average, count:
	println(a.min())
	println(a.max())
	println(a.sum())
	println(a.average())
	println(a.count())

	println(f)

	//The distinct() function will return a list of distinct values from a range having repeated values
	var b = listOf(1, 1, 2, 4, 4, 6, 10)

	println(b.distinct())
}