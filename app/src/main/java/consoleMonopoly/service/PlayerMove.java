package consoleMonopoly.service;

import static consoleMonopoly.enums.MapType.*;
import consoleMonopoly.exception.NotMoveException;
import consoleMonopoly.gameKit.Bank;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayerMove {

    public boolean checkOwn(GameMapPosition gameMapPosition) {
        if (gameMapPosition.getType() == COMMUNICATION || gameMapPosition.getType() == SITES || gameMapPosition.getType() == TRANSPORT) {
            return true;
        } else {
            return false;
        }
    }

    public void byOwn(Player player, GameMapPosition gameMapPosition, Bank bank, OwnerCard ownerCard) {
        player.setMoney(player.getMoney() - gameMapPosition.getPrice());
        bank.setMoney(bank.getMoney() + gameMapPosition.getPrice());
        gameMapPosition.setIsFree(false);
        player.getOwnerCards().add(ownerCard);
        System.out.println("Вы купили " + gameMapPosition.getName());
        System.out.println("Ваш бюджет" + player.getMoney());
    }

    public void move(Dice dice, Random random, Scanner scanner, Player player,
            ArrayList<GameMapPosition> gameMapPositions, ArrayList<OwnerCard> ownerCards, Bank bank, Player[] players) {

        PlayerMenu playerMenu = new PlayerMenu();
        SearchCardsService searchCardService = new SearchCardsService();
        AuctionService auctionService = new AuctionService();

        int step = dice.d6throw(random);

        if (player.getPosition() + 1 > 40) {
            player.setPosition((player.getPosition() + 1) - 40);
        } else {
            player.setPosition(player.getPosition() + step);
        }
        GameMapPosition gameMapPosition = gameMapPositions.get(player.getPosition());
        boolean isOwn = checkOwn(gameMapPosition);

        playerMenu.viewInfo(player, scanner, step, gameMapPosition);
        OwnerCard ownerCard = searchCardService.lookForOwnCard(ownerCards, gameMapPosition);

        //Игрок на собствености
        if (isOwn == true && gameMapPosition.isFree() == true) {
            System.out.println("");
            System.out.println("1. Купить собственость за " + gameMapPosition.getPrice());
            System.out.println("2. Просить банкира выставить собственость на аукцион");

            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    byOwn(player, gameMapPosition, bank, ownerCard);
                case 2:
                    auctionService.auction(players, scanner, bank, ownerCard);
                default:
                    throw new NotMoveException("Такого хода нет!");
            }
        }
        if (isOwn == true && gameMapPosition.isFree() == false) {
            int rent = ownerCard.getBuildingFreeRent();
            bank.setMoney(bank.getMoney() + rent);
            player.setMoney(player.getMoney() - rent);
            System.out.println("Вы оплатили ренту: " + rent);
            System.out.println("Ваш бюджет" + player.getMoney());
        }

        //Игрок на шансе
        //Игрок в тюрьме
        //Игрок на парковке
        //Игрок на старте
    }

}
