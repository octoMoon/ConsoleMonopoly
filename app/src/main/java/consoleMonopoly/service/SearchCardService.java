package consoleMonopoly.service;

import consoleMonopoly.exception.NotCardException;
import consoleMonopoly.gameKit.GameMap;
import consoleMonopoly.gameKit.OwnerCard;
import java.util.ArrayList;

public class SearchCardService {

    public OwnerCard lookForOwnCard(ArrayList<OwnerCard> ownerCards, GameMap gameMap) {
        String name = gameMap.getName();
        for (OwnerCard ownerCard : ownerCards) {
            if (ownerCard.getCardName().equals(name)) {
                return ownerCard;
            }
        }
        throw new NotCardException("Нет карты с таким именем!");
    }

}
