package consoleMonopoly.service;

import static consoleMonopoly.enums.Collor.BLUE;
import consoleMonopoly.enums.MapType;
import consoleMonopoly.gameKit.GameMap;
import consoleMonopoly.gameKit.OwnerCard;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchCardServiceTest {

    public SearchCardServiceTest() {
    }

    @Test
    public void testLookForOwnCard() {
        System.out.println("lookForOwnCard");
        ArrayList<OwnerCard> ownerCards;
        OwnerCardCreator ownerCardCreator = new OwnerCardCreator();
        ownerCards = ownerCardCreator.create();
        GameMap gameMap = new GameMap(MapType.TAX, 0, "Горнолыжный курорт");
        SearchCardService instance = new SearchCardService();
        OwnerCard expResult = new OwnerCard("Горнолыжный курорт", BLUE, 8, 40, 100, 300, 450, 600, 50, 50, 60);
        OwnerCard result = instance.lookForOwnCard(ownerCards, gameMap);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

}
