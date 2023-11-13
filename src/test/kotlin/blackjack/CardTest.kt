package blackjack

import blackjack.domain.enum.Card
import io.kotest.matchers.shouldBe
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CardTest {

    @ParameterizedTest
    @CsvSource("SPADE_ACE, A스페이드", "HEART_ACE, A하트", "DIAMOND_ACE, A다이아몬드", "CLUB_ACE, A클로버")
    fun `toString 호출 시 카드의 풀네임을 반환한다`(card: Card, expected: String) {
        card.toString() shouldBe expected
    }
}
