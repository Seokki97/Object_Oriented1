package baseballgame2;

public class GameSetting {

    public String erq(BaseballCalculator baseballCalculator){
        if(baseballCalculator.strike ==3){
        return "게임이 종료되었습니다. 게임을 다시 시작하려면 1, 종료하면 2를 누르세요";
        }
        else return "ㄴ";
    }

}
