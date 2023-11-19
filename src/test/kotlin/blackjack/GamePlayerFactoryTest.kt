package blackjack

import blackjack.domain.Player
import blackjack.serviceimpl.GamePlayerFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GamePlayerFactoryTest {

    private val testGamePlayerFactory: GamePlayerFactory = GamePlayerFactory()

    @Test
    fun `게임 참여자를 생성할 수 있다`() {
        val testGamePlayer: List<Player> = testGamePlayerFactory.createPlayerList(listOf("test"))

        assertThat(testGamePlayer[0]).isNotNull.isInstanceOf(Player::class.java)
    }
}
