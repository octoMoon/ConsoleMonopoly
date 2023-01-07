package consoleMonopoly;

import static consoleMonopoly.enums.Collor.*;
import consoleMonopoly.exception.NumberOfPlayersException;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.GameMap;
import static consoleMonopoly.enums.MapType.*;
import consoleMonopoly.gameKit.Player;
import consoleMonopoly.service.GameCreator;
import consoleMonopoly.service.PlayerMove;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int numberOfPlayers;
        boolean isGameOver = false;
        Player[] players;
        ArrayList<GameMap> gameMap;

        Dice dice = new Dice();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        PlayerMove playerMenu = new PlayerMove();
        GameCreator gameCreator = new GameCreator();
        
        gameMap=gameCreator.createGameMap();

        //******GAME******
        numberOfPlayers = gameCreator.playerCounter();
        if (numberOfPlayers > 6 || numberOfPlayers < 2) {
            throw new NumberOfPlayersException("Не корректное количество игроков!");
        }
        players = gameCreator.createPlayer(numberOfPlayers);
         
        while(isGameOver==false){
            for(int i =0; i<players.length; i++){
            playerMenu.menuView(players[i], scanner, dice, random);
            }
        
        }

    }
}
