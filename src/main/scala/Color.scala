sealed trait Color
object Color {
  def parse(input: Char): Color = input match {
    case 'C' => Clubs
  }

  case object Hearts extends Color
  case object Clubs extends Color
  case object Diamonds extends Color
  case object Spades extends Color
}
