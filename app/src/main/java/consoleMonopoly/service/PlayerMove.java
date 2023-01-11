package consoleMonopoly.service;

import static consoleMonopoly.enums.MapType.*;
import consoleMonopoly.exception.NotMoveException;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayerMove {

    public void menuView(Player player, Scanner scanner, Dice dice, Random random, ArrayList<GameMapPosition> gameMapPositions, ArrayList<OwnerCard> ownerCards, int bankMoney) {
        int step = dice.d6throw(random);
        boolean isOwn = false;
        GameMapPosition gameMapPosition;

        SearchCardsService searchCardService = new SearchCardsService();

        System.out.println("Активный игрок: " + player.getName());
        System.out.println("Бюджет: " + player.getMoney());
        System.out.println("Вы бросили кубик и перемесчаетесь на " + step + " позиций");
        if (player.getPosition() + 1 > 40) {
            player.setPosition((player.getPosition() + 1) - 40);
        } else {
            player.setPosition(player.getPosition() + step);
        }
        gameMapPosition = gameMapPositions.get(player.getPosition());

        if (gameMapPosition.getType() == COMMUNICATION || gameMapPosition.getType() == SITES || gameMapPosition.getType() == TRANSPORT) {
            isOwn = true;
        }
        System.out.println("Находится на позиции: " + gameMapPosition.getName());

        //Игрок на собствености
        if (isOwn == true && gameMapPosition.isFree() == true) {
            System.out.println("");
            System.out.println("1. Купить собственость за " + gameMapPosition.getPrice());
            System.out.println("2. Просить банкира выставить собственость на аукцион");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    player.setMoney(player.getMoney() - gameMapPosition.getPrice());
                    bankMoney += gameMapPosition.getPrice();
                    gameMapPosition.setIsFree(false);
                    OwnerCard ownerCard = searchCardService.lookForOwnCard(ownerCards, gameMapPosition);
                    player.getOwnerCards().add(ownerCard);
                    System.out.println("Вы купили " + gameMapPosition.getName());
                    System.out.println("Ваш бюджет" + player.getMoney());
                case 2:
                //Ход банкира
                default:
                    throw new NotMoveException("Такого хода нет!");
            }
        }
        if (isOwn == true && gameMapPosition.isFree() == false) {

            System.out.println("Вы оплатили ренту");
        }

        //Игрок на шансе
        //Игрок в тюрьме
        //Игрок на парковке
        //Игрок на старте
    }

   

}
