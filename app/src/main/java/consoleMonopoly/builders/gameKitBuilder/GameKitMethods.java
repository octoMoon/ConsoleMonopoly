package consoleMonopoly.builders.gameKitBuilder;

import consoleMonopoly.gameKit.Bank;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import java.util.ArrayList;

public interface GameKitMethods {

    void setBank(Bank bank);

    void setDice(Dice dice);

    void setGameMapPosition(ArrayList<GameMapPosition> gameMapPositions);

    void setOwnerCard(ArrayList<OwnerCard> ownerCards);

    void setPlayers(Player[] players);
}
