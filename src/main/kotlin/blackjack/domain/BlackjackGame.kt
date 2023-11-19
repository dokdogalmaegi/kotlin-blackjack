package blackjack.domain

import blackjack.domain.enum.CardDealer

class BlackjackGame(private var playerList: List<Player>) {

    private val cardDealer: CardDealer = CardDealer()

    init {
        require(playerList.isNotEmpty()) { "플레이어가 존재하지 않습니다." }
    }

    fun process(player: Player): Player {
        require(player.isPlay()) { "이미 게임이 종료된 플레이어입니다." }

        val playerSnapshot: Player = player.getSnapshot()
        playerSnapshot.addCard(cardDealer.dealCard())

        return playerSnapshot
    }
}
