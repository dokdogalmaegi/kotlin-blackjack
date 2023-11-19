package blackjack

import blackjack.domain.BlackjackGame
import blackjack.domain.Player
import blackjack.serviceimpl.GamePlayerFactory
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class BlackjackGameTest {

    private val gamePlayerFactory: GamePlayerFactory = GamePlayerFactory()

    @Test
    fun `플레이어 없이 게임을 세팅할 수 없다`() {
        val testPlayerList: List<Player> = gamePlayerFactory.createPlayerList(listOf())

        assertThrows<IllegalArgumentException> { BlackjackGame(testPlayerList) }
    }
}
