package consoleMonopoly.service;

import static consoleMonopoly.enums.MapType.*;
import consoleMonopoly.exception.NotMoveException;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.GameMap;
import consoleMonopoly.gameKit.Player;
import java.util.Random;
import java.util.Scanner;

public class PlayerMove {

    public void menuView(Player player, Scanner scanner, Dice dice, Random random, GameMap gameMap) {
        int i = dice.d6throw(random);
        boolean isOwn = false;
        int bank = 0;
        String location = gameMap.getName();
        System.out.println("Активный игрок: " + player.getName());
        System.out.println("Бюджет: " + player.getMoney());
        System.out.println("Вы бросили кубик и перемесчаетесь на " + i + " позиций");
        player.setPosition(player.getPosition() + i);
        if (gameMap.getType() == COMMUNICATION || gameMap.getType() == SITES || gameMap.getType() == TRANSPORT) {
            isOwn = true;
        }
        System.out.println("Находится на позиции: " + location);

        //Игрок на собствености
        if (isOwn == true && gameMap.isFree() == true) {
            System.out.println("");
            System.out.println("1. Купить собственость за " + gameMap.getTax());
            System.out.println("2. Просить банкира выставить собственость на аукцион");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    player.setMoney(player.getMoney() - gameMap.getTax());
                    bank += gameMap.getTax();
                    System.out.println("Вы купили " + gameMap.getName());
                    System.out.println("Ваш бюджет" + player.getMoney());
                case 2:
                    //Ход банкира
                default:
                    throw new NotMoveException("Такого хода нет!");
            }
        }
        if (isOwn == true && gameMap.isFree() == false) {
            
            System.out.println("Вы оплатили ренту");
        }

        //Игрок на шансе
        //Игрок в тюрьме
        //Игрок на парковке
        //Игрок на старте
    }

}
