package blackjack

import blackjack.domain.enum.Card
import blackjack.domain.enum.CardDealer
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class CardDealerTest {

    @Test
    fun `카드를 배분 할 수 있다`() {
        val testCardDealer: CardDealer = CardDealer()

        val card: Card = testCardDealer.dealCard()
        assertThat(card).isInstanceOf(Card::class.java)
    }

    @Test
    fun `카드를 섞을 수 있다`() {
        val testCardDealer: CardDealer = CardDealer()

        assertDoesNotThrow {
            testCardDealer.shuffleDeck()
        }
    }
}
