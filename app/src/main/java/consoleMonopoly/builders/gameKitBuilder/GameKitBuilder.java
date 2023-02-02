package consoleMonopoly.builders.gameKitBuilder;

import consoleMonopoly.gameKit.Bank;
import consoleMonopoly.gameKit.Dice;
import consoleMonopoly.gameKit.GameKit;
import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.OwnerCard;
import consoleMonopoly.gameKit.Player;
import java.util.ArrayList;

public class GameKitBuilder implements GameKitMethods {

    private Bank bank;
    private Dice dice;
    private ArrayList<GameMapPosition> gameMapPositions;
    private ArrayList<OwnerCard> ownerCards;
    private Player[] players;

    public GameKit getGameKit() {
        return new GameKit(bank, dice, gameMapPositions, ownerCards, players);
    }

    @Override
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void setDice(Dice dice) {
        this.dice = dice;
    }

    @Override
    public void setGameMapPosition(ArrayList<GameMapPosition> gameMapPositions) {
        this.gameMapPositions = gameMapPositions;
    }

    @Override
    public void setOwnerCard(ArrayList<OwnerCard> ownerCards) {
        this.ownerCards = ownerCards;
    }

    @Override
    public void setPlayers(Player[] players) {
        this.players = players;
    }

}
