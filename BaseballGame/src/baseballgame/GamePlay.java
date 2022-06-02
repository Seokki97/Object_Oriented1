package baseballgame;
class GamePlay {
    GameSetting gameSetting = new GameSetting();

    public void playGame() {
        gameSetting.setComputerValue();

        while (gameSetting.ball.getStrike() < 3) {
            gameSetting.inputPlayerNum();
            gameSetting.setPlayerValue();
            gameSetting.determineStrikeOrBall();
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


}


