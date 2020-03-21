import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PokerHandTest extends AnyWordSpec with Matchers {

  "Poker hand" should {
    "pick the highest card 7" in {
      PokerHand.evaluate("5H 4C 6S 7S 2D") should equal("high card : 7")
    }
    "pick the highest card 9" in {
      PokerHand.evaluate("5H 4C 6S 9S 2D") should equal("high card : 9")
    }

    "pick the highest card J" in {
      PokerHand.evaluate("5H 4C 6S JS 2D") should equal("high card : J")
    }

    "pick the highest card T" in {
      PokerHand.evaluate("5H 4C 6S TS 2D") should equal("high card : T")
    }

    "pick the highest card Q" in {
      PokerHand.evaluate("5H 4C 6S QS 2D") should equal("high card : Q")
    }

    "pick the highest card K" in {
      PokerHand.evaluate("5H 4C 6S KS 2D") should equal("high card : K")
    }

    "pick the highest card A" in {
      PokerHand.evaluate("5H 4C 6S AS 2D") should equal("high card : A")
    }

    "pick pair of A" in {
      PokerHand.evaluate("5H 4C 6S AS AD") should equal("pair of : A")
    }

    "pick two pairs of A,K" in {
      PokerHand.evaluate("5H KC KS AS AD") should equal("two pairs of : A,K")
    }
  }
}
