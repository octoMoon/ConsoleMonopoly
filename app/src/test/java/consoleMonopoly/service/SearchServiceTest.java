package consoleMonopoly.service;

import static consoleMonopoly.enums.Collor.BLUE;
import consoleMonopoly.enums.MapType;
import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.OwnerCard;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchServiceTest {
    
    public SearchServiceTest() {
    }

    @Test
   public void testLookForOwnCard() {
        System.out.println("lookForOwnCard");
        ArrayList<OwnerCard> ownerCards;
        OwnerCardsCreator ownerCardCreator = new OwnerCardsCreator();
        ownerCards = ownerCardCreator.create();
        GameMapPosition gameMap = new GameMapPosition(MapType.TAX, 0, "Горнолыжный курорт");
        SearchCardsService instance = new SearchCardsService();
        OwnerCard expResult = new OwnerCard("Горнолыжный курорт", BLUE, 8, 40, 100, 300, 450, 600, 50, 50, 60);
        OwnerCard result = instance.lookForOwnCard(ownerCards, gameMap);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    
}
