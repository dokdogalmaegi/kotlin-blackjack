package blackjack

import blackjack.domain.Player
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlayerTest {

    @Test
    fun `플레이어를 생성할 수 있다`() {
        val testPlayer: Player = Player("test")

        assertThat(testPlayer).isNotNull.isInstanceOf(Player::class.java)
    }

    @Test
    fun `플레이어의 스냅샷을 반환한다`() {
        val testPlayer: Player = Player("test")

        val snapshotPlayer: Player = testPlayer.getSnapshot()

        assertThat(snapshotPlayer.toString()).isEqualTo(testPlayer.toString())
    }
}
