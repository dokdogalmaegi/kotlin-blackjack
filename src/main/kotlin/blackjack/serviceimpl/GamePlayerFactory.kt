package blackjack.serviceimpl

import blackjack.domain.Player
import blackjack.service.PlayerFactory

class GamePlayerFactory : PlayerFactory {

    override fun createPlayerList(nameList: List<String>): List<Player> = nameList.map(::Player)
}
