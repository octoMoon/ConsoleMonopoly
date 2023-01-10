package consoleMonopoly;

import static consoleMonopoly.enums.Collor.*;
import consoleMonopoly.exception.NumberOfPlayersException;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.GameMap;
import static consoleMonopoly.enums.MapType.*;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import consoleMonopoly.service.GameCreator;
import consoleMonopoly.service.OwnerCardCreator;
import consoleMonopoly.service.PlayerMove;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int numberOfPlayers;
        int bankMoney;
        boolean isGameOver = false;
        Player[] players;
        ArrayList<GameMap> gameMap;
        ArrayList<OwnerCard> ownerCardsPool;

        Dice dice = new Dice();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        PlayerMove playerMenu = new PlayerMove();
        GameCreator gameCreator = new GameCreator();
        OwnerCardCreator ownerCardCreator = new OwnerCardCreator();

        gameMap = gameCreator.createGameMap();
        ownerCardsPool = ownerCardCreator.create();

        //******GAME******
        System.out.println(gameMap.get(1).getName());
        numberOfPlayers = gameCreator.playerCounter();
        if (numberOfPlayers > 6 || numberOfPlayers < 2) {
            throw new NumberOfPlayersException("Не корректное количество игроков!");
        }
        players = gameCreator.createPlayer(numberOfPlayers);

        while (isGameOver == false) {
            for (int i = 0; i < players.length; i++) {
                playerMenu.menuView(players[i], scanner, dice, random, gameMap.get(2));
            }
        }

    }
}
