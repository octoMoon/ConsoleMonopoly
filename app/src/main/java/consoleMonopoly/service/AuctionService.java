package consoleMonopoly.service;

import consoleMonopoly.gameKit.Bank;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import java.util.Scanner;

public class AuctionService {

    private static final int IT_IS_NULL = 99;

    //Количество вышедших из аукциона
    public boolean knockingOut(boolean[] playersInGame, int numOfPlayers) {
        int trues = 0;
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == true) {
                trues += 1;
            }
        }
        return trues == (numOfPlayers - 1);
    }

    //id победителя аукциона
    public int falseIdView(boolean[] bools) {
        int id = IT_IS_NULL;
        for (int i = 0; i < bools.length; i++) {
            if (bools[i] == false) {
                id = i;
            }
        }
        return id;
    }

    //ход игрока
    public int step(Player player, Scanner scanner, int price) {
        System.out.println(player.getName());
        System.out.println("Сейчас цена равна " + price);
        System.out.println("Введите новую ценy, ваш бюджет " + player.getMoney());
        System.out.println("0 если вы пасс");
        int scn = scanner.nextInt();
        return scn;
    }

    //Проводит аукцион
    public void auction(Player[] player, Scanner scanner, Bank bank, OwnerCard ownerCard) {
        System.out.println("Аукцион за лот: " + ownerCard.getCardName());
        int price = 0;
        boolean auctionOver = false;
        boolean[] bools = new boolean[player.length];
        int[] result = new int[2];

        while (auctionOver == false) {

            for (int i = 0; i < player.length; i++) {
                int n = step(player[i], scanner, price);
                if (n > price) {
                    price = n;
                } else {
                    bools[i] = true;
                }
                auctionOver = knockingOut(bools, player.length);
            }
        }

        System.out.println("Аукцион закончен !");
        result[0] = price;
        result[1] = falseIdView(bools);
        System.out.println("Цена лота:" + result[0]);
        System.out.println("Победитель: " + player[result[1]].getName());

        finish(player[result[1]], result[0], ownerCard, bank);

    }

    public void finish(Player player, int price, OwnerCard ownerCard, Bank bank) {
        player.setMoney(player.getMoney() - price);
            player.getOwnerCards().add(ownerCard);
            bank.setMoney(bank.getMoney() + price);
    }

}
