package consoleMonopoly;

import consoleMonopoly.exception.NumberOfPlayersException;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.Player;
import consoleMonopoly.service.GameCreator;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        int numberOfPlayers;
        Player[] players;

        Dice dice = new Dice();
        Random random = new Random();

        GameCreator gameCreator = new GameCreator();

        //******GAME******
        numberOfPlayers = gameCreator.playerCounter();
        if (numberOfPlayers > 6 || numberOfPlayers < 2) {
            throw new NumberOfPlayersException("Не корректное количество игроков!");
        }
        players = gameCreator.createPlayer(numberOfPlayers);

    }
}
