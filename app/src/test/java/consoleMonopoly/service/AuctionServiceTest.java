package consoleMonopoly.service;

import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuctionServiceTest {

    public AuctionServiceTest() {
    }

    @Test
    public void testBoolView() {
        System.out.println("boolView");
        boolean[] bools = {true, true, true, false};
        int numOfPlayers = 4;
        AuctionService instance = new AuctionService();
        boolean expResult = true;
        boolean result = instance.boolView(bools, numOfPlayers);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFalseIdView() {
        System.out.println("falseIdView");
        boolean[] bools = {true, true, false, true};
        AuctionService instance = new AuctionService();
        int expResult = 2;
        int result = instance.falseIdView(bools);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testStep() {
        System.out.println("step");
        Player player = null;
        Scanner scanner = null;
        int price = 0;
        boolean[] gameOver = null;
        AuctionService instance = new AuctionService();
        instance.step(player, scanner, price, gameOver);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAuction() {
        System.out.println("auction");
        Player[] player = null;
        OwnerCard ownerCard = null;
        GameMapPosition gameMap = null;
        Scanner scanner = null;
        AuctionService instance = new AuctionService();
        instance.auction(player, ownerCard, gameMap, scanner);
        fail("The test case is a prototype.");
    }

}
