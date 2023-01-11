package consoleMonopoly.service;

import consoleMonopoly.gameKit.Player;
import java.util.Scanner;

public class AuctionService {

    //Количество вышедших из аукциона
    public boolean boolView(boolean[] bools, int numOfPlayers) {
        int trues = 0;
        for (int i = 0; i < bools.length; i++) {
            if (bools[i] == true) {
                trues += 1;
            }
        }
        return trues == (numOfPlayers - 1);
    }

    //id победителя аукциона
    public int falseIdView(boolean[] bools) {
        int id = 99;
        for (int i = 0; i < bools.length; i++) {
            if (bools[i] == false) {
                id = i;
            }
        }
        return id;
    }

    //ход игрока
    public int step(Player player, Scanner scanner, int price) {
        System.out.println("Сейчас цена равна " + price);
        System.out.println("Введите новую ценy, ваш бюджет " + player.getMoney());
        System.out.println("0 если вы пасс");
        int scn = scanner.nextInt();
        return scn;
    }

    public int[] auction(Player[] player, Scanner scanner) {
        int price = 0;
        boolean auctionOver = false;
        boolean[] bools = new boolean[player.length];
        int[] is = new int[2];

        while (auctionOver == false) {
            auctionOver = boolView(bools, player.length);

            for (int i = 0; i < player.length; i++) {
                int n = step(player[i], scanner, price);
                if (n != 0) {
                    price += n;
                } else {
                    bools[i] = true;
                }
            }            
        }
        
        is[0] = falseIdView(bools);
        is[1] = price;
        return is;
    }

}
