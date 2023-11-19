package blackjack

import blackjack.domain.BlackjackGame
import blackjack.domain.Player
import blackjack.serviceimpl.GamePlayerFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

class BlackjackGameTest {

    private val gamePlayerFactory: GamePlayerFactory = GamePlayerFactory()

    @Test
    fun `블랙잭 게임을 시작할 수 있다`() {
        val testPlayerList: List<Player> = gamePlayerFactory.createPlayerList(listOf("test1", "test2"))

        val testGame: BlackjackGame = BlackjackGame(testPlayerList)

        assertDoesNotThrow { testGame.start() }
    }

    @Test
    fun `블랙잭 게임 시작 시 게임을 진행한다`() {
        val testPlayerList: List<Player> = gamePlayerFactory.createPlayerList(listOf("test1", "test2"))

        val testGame: BlackjackGame = BlackjackGame(testPlayerList)

        val startedPlayer: List<Player> = testGame.start()

        assertThat(startedPlayer).doesNotContain(*testPlayerList.toTypedArray())
    }

    @Test
    fun `플레이어 없이 게임을 세팅할 수 없다`() {
        val testPlayerList: List<Player> = gamePlayerFactory.createPlayerList(listOf())

        assertThrows<IllegalArgumentException> { BlackjackGame(testPlayerList) }
    }
}
