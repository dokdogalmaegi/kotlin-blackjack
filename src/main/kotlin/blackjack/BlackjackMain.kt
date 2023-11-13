package blackjack

import blackjack.view.InputView

fun main() {
    val inputView: InputView = InputView()

    val playerNameList: List<String> = inputView.readLineStringList("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
    println(playerNameList)
}