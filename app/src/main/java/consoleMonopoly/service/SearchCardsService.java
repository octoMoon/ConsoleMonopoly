package consoleMonopoly.service;

import consoleMonopoly.exception.NotCardException;
import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.OwnerCard;
import java.util.ArrayList;

public class SearchCardsService {

    //Сопостовляет Поле-Карту
    public OwnerCard lookForOwnCard(ArrayList<OwnerCard> ownerCards, GameMapPosition gameMap) {
        String name = gameMap.getName();
        for (OwnerCard ownerCard : ownerCards) {
            if (ownerCard.getCardName().equals(name)) {
                return ownerCard;
            }
        }
        throw new NotCardException("Нет карты с таким именем!");
    }

}
