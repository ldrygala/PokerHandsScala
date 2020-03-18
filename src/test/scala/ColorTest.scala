import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ColorTest extends AnyWordSpec with Matchers {
  "Color" should {
    "parse clubs" in {
      Color.parse('C') shouldBe Color.Heart
    }
  }
}
