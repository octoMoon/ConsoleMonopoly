package consoleMonopoly.service;

import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.Player;
import java.util.Scanner;

public class PlayerMenu {
    String line = "----------------------------------------------------------";
    
    public void viewInfo (Player player, Scanner scanner, int step, GameMapPosition gameMapPosition ){
        
        System.out.println(line);
        System.out.println("Активный игрок: " + player.getName());
        System.out.println("Бюджет: " + player.getMoney());
        System.out.println("Вы бросили кубик и перемесчаетесь на " + step + " позиций");
        System.out.println("И теперь вы находитесь: " + gameMapPosition.getName());
        System.out.println(line);
    }
    
}
