package consoleMonopoly.service;

import consoleMonopoly.gameKit.Player;
import java.util.Scanner;

public class GameCreator {

    public int playerCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько будет игроков ? (Не больше 6!)");
        return scanner.nextInt();
    }

    public Player[] createPlayer(int count) {
        Player[] players = new Player[count];
        Scanner scanner = new Scanner(System.in);
        
        for (int i =0;i<count;i++) {
            players[i] = new Player();
            System.out.println("Введите имя нового игрока");
            players[i].setName(scanner.nextLine());
        }

        return players;
    }

}
