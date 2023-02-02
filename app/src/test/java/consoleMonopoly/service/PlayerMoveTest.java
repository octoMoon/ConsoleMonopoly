package consoleMonopoly.service;

import static consoleMonopoly.enums.Collor.YELLOW;
import static consoleMonopoly.enums.MapType.COMMUNICATION;
import static consoleMonopoly.enums.MapType.SITES;
import consoleMonopoly.gameKit.Bank;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PlayerMoveTest {
    
    public PlayerMoveTest() {
    }

    @Test
    public void testCheckOwn() {
        System.out.println("checkOwn");
        GameMapPosition gameMapPosition = new GameMapPosition(COMMUNICATION, 150, "Водопроводная компания");
        PlayerMove instance = new PlayerMove();
        boolean expResult = true;
        boolean result = instance.checkOwn(gameMapPosition);
        assertEquals(expResult, result);
      // fail("The test case is a prototype.");
    }

    @Test
    public void testByOwn() {
        System.out.println("byOwn");
        Player player = new Player(1, "Angela");
        GameMapPosition gameMapPosition = new GameMapPosition(SITES, 280, "Сотовая связь", YELLOW);
        Bank bank = new Bank();
        OwnerCard ownerCard = new OwnerCard("Сотовая связь", YELLOW, 24, 120, 360, 850, 1025, 1200, 150, 150, 140);
        PlayerMove instance = new PlayerMove();
        instance.byOwn(player, gameMapPosition, bank, ownerCard);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMove() {
        System.out.println("move");
        Dice dice = null;
        Random random = null;
        Scanner scanner = null;
        Player player = null;
        ArrayList<GameMapPosition> gameMapPositions = null;
        ArrayList<OwnerCard> ownerCards = null;
        Bank bank = null;
        Player[] players = null;
        PlayerMove instance = new PlayerMove();
        instance.move(dice, random, scanner, player, gameMapPositions, ownerCards, bank, players);
        fail("The test case is a prototype.");
    }
    
}
