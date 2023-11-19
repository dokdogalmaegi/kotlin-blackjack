package blackjack.domain

import blackjack.domain.enum.CardDealer

class BlackjackGame() {

    private val cardDealer: CardDealer = CardDealer()

    fun process(player: Player): Player {
        require(player.isPlay()) { "이미 게임이 종료된 플레이어입니다." }

        val playerSnapshot: Player = player.getSnapshot()
        playerSnapshot.addCard(cardDealer.dealCard())

        return playerSnapshot
    }
}
