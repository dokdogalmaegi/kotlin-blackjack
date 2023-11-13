package blackjack.domain.enum

enum class Card(val value: Int, private val symbol: String, private val cardType: Type) {
    SPADE_ACE(1, "A", Type.SPADE),
    SPADE_TWO(2, "2", Type.SPADE),
    SPADE_THREE(3, "3", Type.SPADE),
    SPADE_FOUR(4, "4", Type.SPADE),
    SPADE_FIVE(5, "5", Type.SPADE),
    SPADE_SIX(6, "6", Type.SPADE),
    SPADE_SEVEN(7, "7", Type.SPADE),
    SPADE_EIGHT(8, "8", Type.SPADE),
    SPADE_NINE(9, "9", Type.SPADE),
    SPADE_TEN(10, "10", Type.SPADE),
    SPADE_JACK(10, "Jack", Type.SPADE),
    SPADE_QUEEN(10, "Queen", Type.SPADE),
    SPADE_KING(10, "King", Type.SPADE),

    HEART_ACE(1, "A", Type.HEART),
    HEART_TWO(2, "2", Type.HEART),
    HEART_THREE(3, "3", Type.HEART),
    HEART_FOUR(4, "4", Type.HEART),
    HEART_FIVE(5, "5", Type.HEART),
    HEART_SIX(6, "6", Type.HEART),
    HEART_SEVEN(7, "7", Type.HEART),
    HEART_EIGHT(8, "8", Type.HEART),
    HEART_NINE(9, "9", Type.HEART),
    HEART_TEN(10, "10", Type.HEART),
    HEART_JACK(10, "Jack", Type.HEART),
    HEART_QUEEN(10, "Queen", Type.HEART),
    HEART_KING(10, "King", Type.HEART),

    DIAMOND_ACE(1, "A", Type.DIAMOND),
    DIAMOND_TWO(2, "2", Type.DIAMOND),
    DIAMOND_THREE(3, "3", Type.DIAMOND),
    DIAMOND_FOUR(4, "4", Type.DIAMOND),
    DIAMOND_FIVE(5, "5", Type.DIAMOND),
    DIAMOND_SIX(6, "6", Type.DIAMOND),
    DIAMOND_SEVEN(7, "7", Type.DIAMOND),
    DIAMOND_EIGHT(8, "8", Type.DIAMOND),
    DIAMOND_NINE(9, "9", Type.DIAMOND),
    DIAMOND_TEN(10, "10", Type.DIAMOND),
    DIAMOND_JACK(10, "Jack", Type.DIAMOND),
    DIAMOND_QUEEN(10, "Queen", Type.DIAMOND),
    DIAMOND_KING(10, "King", Type.DIAMOND),

    CLUB_ACE(1, "A", Type.CLUB),
    CLUB_TWO(2, "2", Type.CLUB),
    CLUB_THREE(3, "3", Type.CLUB),
    CLUB_FOUR(4, "4", Type.CLUB),
    CLUB_FIVE(5, "5", Type.CLUB),
    CLUB_SIX(6, "6", Type.CLUB),
    CLUB_SEVEN(7, "7", Type.CLUB),
    CLUB_EIGHT(8, "8", Type.CLUB),
    CLUB_NINE(9, "9", Type.CLUB),
    CLUB_TEN(10, "10", Type.CLUB),
    CLUB_JACK(10, "Jack", Type.CLUB),
    CLUB_QUEEN(10, "Queen", Type.CLUB),
    CLUB_KING(10, "King", Type.CLUB);

    override fun toString(): String = "${symbol}${cardType.symbol}"

    companion object {
        enum class Type(val symbol: String) {
            SPADE("스페이드"),
            HEART("하트"),
            DIAMOND("다이아몬드"),
            CLUB("클로버"),
        }
    }
}
