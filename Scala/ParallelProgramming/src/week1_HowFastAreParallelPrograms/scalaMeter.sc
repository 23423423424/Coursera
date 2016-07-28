package week1_HowFastAreParallelPrograms
import org.scalameter._

object scalaMeter {
	val time = measure {
		(0 until 1000000).toArray
	}
	println(s"Array initialization time: $time ms")
}