package blackjack.domain.enum

class CardDealer(initCardDeck: List<Card> = Card.values().toList()) {

    private var deck: MutableList<Card> = initCardDeck.shuffled().toMutableList()

    fun dealCard(): Card {
        return deck.removeAt(0)
    }

    fun shuffleDeck() {
        deck = deck.shuffled().toMutableList()
    }
}
