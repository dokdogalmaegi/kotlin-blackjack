package blackjack.service

import blackjack.domain.Player

interface PlayerFactory {
    fun createPlayerList(nameList: List<String>): List<Player>
}
