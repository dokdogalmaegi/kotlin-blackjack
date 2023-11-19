package blackjack.domain

import blackjack.domain.enum.CardDealer

class BlackjackGame(private var playerList: List<Player>) {

    private val cardDealer: CardDealer = CardDealer()

    init {
        require(playerList.isNotEmpty()) { "플레이어가 존재하지 않습니다." }
    }

    fun start(): List<Player> {
        TODO("Not yet implemented")
    }
}
