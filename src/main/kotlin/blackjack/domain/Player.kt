package blackjack.domain

import blackjack.domain.enum.Card

class Player(val name: String, private var cardList: List<Card> = listOf(), private var isPlay: Boolean = true) {

    fun addCard(card: Card) {
        this.cardList += listOf(card)
    }

    fun getSnapshot(): Player {
        return Player(this.name, this.cardList)
    }

    fun isPlay(): Boolean = this.isPlay

    override fun toString(): String = "$name: ${cardList.joinToString(", ")}"

    override fun equals(other: Any?): Boolean {
        if (other !is Player) {
            return false
        }

        return this.name == other.name && this.cardList == other.cardList && this.isPlay == other.isPlay
    }
}
