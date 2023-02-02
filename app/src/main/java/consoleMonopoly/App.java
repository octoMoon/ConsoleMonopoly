package consoleMonopoly;

import static consoleMonopoly.enums.Collor.*;
import consoleMonopoly.gameKit.Bank;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import consoleMonopoly.service.GameCardsCreator;
import consoleMonopoly.service.OwnerCardsCreator;
import consoleMonopoly.service.PlayerMove;
import consoleMonopoly.service.PlayersCreator;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //*******CREATE_GAME******
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        Dice dice = new Dice();
        Random random = new Random();

        PlayersCreator playersCreator = new PlayersCreator();
        GameCardsCreator gameCardsCreator = new GameCardsCreator();
        OwnerCardsCreator ownerCardsCreator = new OwnerCardsCreator();
        ArrayList<GameMapPosition> gameMapPositions = gameCardsCreator.create();
        ArrayList<OwnerCard> ownerCards = ownerCardsCreator.create();
        PlayerMove playrMove = new PlayerMove();

        int playersCount = playersCreator.playerCounter();
        Player[] players = playersCreator.createPlayer(playersCount);

        //******GAME******
        while (true) {
            for (int i = 0; i < players.length; i++) {
                playrMove.move(dice, random, scanner, players[i], gameMapPositions, ownerCards, bank, players);
            }
        }
    }
}
