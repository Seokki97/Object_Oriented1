package baseballgame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class GameComplete{

    List<Integer> player = new ArrayList<>();
    List<Integer> computer = new ArrayList<>();

    public long w(List<Integer> player,List<Integer>computer){
        long a= 0;
        for(int i =0; i<3; i++) {
            int finalI = i;
            a += player.stream().filter(p -> p.equals(computer.get(finalI))).collect(Collectors.counting());
        }
        return a;
    }

    public static void main(String[] args) {
        GameComplete gc = new GameComplete();
        gc.player.add(1);
        gc.player.add(2);
        gc.player.add(3);

        gc.computer.add(2);
        gc.computer.add(1);
        gc.computer.add(5);
        System.out.println(gc.w(gc.player, gc.computer));

         }
}