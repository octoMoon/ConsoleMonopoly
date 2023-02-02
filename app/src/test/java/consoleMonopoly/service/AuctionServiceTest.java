package consoleMonopoly.service;

import consoleMonopoly.gameKit.Bank;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuctionServiceTest {

    public AuctionServiceTest() {
    }

    @Test
    public void testKnockingOut() {
        System.out.println("knockingOut");
        boolean[] playersInGame = {true,true,false,false};
        int numOfPlayers = 4;
        AuctionService instance = new AuctionService();
        boolean expResult = false;
        boolean result = instance.knockingOut(playersInGame, numOfPlayers);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testFalseIdView() {
        System.out.println("falseIdView");
        boolean[] bools = {true,false,true,true};
        AuctionService instance = new AuctionService();
        int expResult = 1;
        int result = instance.falseIdView(bools);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }


}
