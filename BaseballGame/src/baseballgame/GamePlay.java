package baseballgame;
class GamePlay {
    GameSetting gameSetting = new GameSetting();
    public void playGame() {
        gameSetting.setComputerValue();
        while (gameSetting.ball.getStrike() < 3) {
            gameSetting.inputPlayerNum();
            gameSetting.setPlayerValue();
            gameSetting.determineStrikeOrBall();
            gameSetting.setPlayerValue().clear();
            gameSetting.showScoreMessage();
        }
    }

    public void restartOrEndGame() {
        String playerInputToString = gameSetting.playerInput.nextLine();

        if (playerInputToString.equals("1")) {
            gameSetting.computer.getComputerAnswerValue().clear();
            gameSetting.ball.setStrike(0);
            gameSetting.ball.setBall(0);
            playGame();
        }
        if (playerInputToString.equals("2")) {
            System.exit(0);
        }
    }

    public String showEndMessage() {
        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
    }
}


