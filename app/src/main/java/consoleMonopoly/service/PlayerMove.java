package consoleMonopoly.service;

import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.Player;
import java.util.Random;
import java.util.Scanner;

public class PlayerMove {

    public void menuView(Player player, Scanner scanner, Dice dice, Random random) {
        int i = dice.d6throw(random);
        System.out.println("Активный игрок: " + player.getName());
        System.out.println("Бюджет: " + player.getMoney());
        System.out.println("Вы бросили кубик и перемесчаетесь на " + i + " позиций");
        player.setPosition(player.getPosition()+i);
        System.out.println("Находится на позиции: " + player.getPosition());
        System.out.println("");
        System.out.println("2. Что то еще");
        System.out.println("3. Что то еще");

    }
}


