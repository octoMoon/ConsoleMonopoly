package consoleMonopoly.service;

import consoleMonopoly.gameKit.Player;
import java.util.Scanner;

public class PlayersCreator {

    public int playerCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько будет игроков ? (Не больше 6!)");
        return scanner.nextInt();
    }

    public Player[] createPlayer(int count) {
        Player[] players = new Player[count];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            players[i] = new Player();
            System.out.println("Введите имя нового игрока, добавте бот и банкир в конце имени для определения ии и банкира (1 банкир, 1 бот!)");
            players[i].setName(scanner.nextLine());
            players[i].setId(i);
        }

        return players;
    }

  
}
