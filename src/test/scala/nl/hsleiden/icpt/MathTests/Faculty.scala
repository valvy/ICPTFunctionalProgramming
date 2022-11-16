package nl.hsleiden.icpt.MathTests
import nl.hsleiden.icpt.Lesson1
import org.scalatestplus.play._

class Faculty extends PlaySpec  {
  "Faculteit" must {
    "0 terug geven bij 0" in {
      Lesson1.faculty(0) mustBe 0
    }
  }
}
