package blackjack.domain

import blackjack.domain.enum.Card

class Player(private val name: String, private var cardList: List<Card> = listOf()) {

    fun addCard(card: Card) {
        this.cardList += listOf(card)
    }

    fun getSnapshot(): Player {
        return Player(this.name, this.cardList)
    }

    override fun toString(): String = "$name: ${cardList.joinToString(", ")}"
}
