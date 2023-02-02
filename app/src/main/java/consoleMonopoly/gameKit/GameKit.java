package consoleMonopoly.gameKit;

import java.util.ArrayList;

public class GameKit {
    private Bank bank;
    private Dice dice;
    private ArrayList<GameMapPosition> gameMapPositions;
    private ArrayList<OwnerCard> ownerCards;
    private Player[] players;

    public GameKit(Bank bank, Dice dice, ArrayList<GameMapPosition> gameMapPositions, ArrayList<OwnerCard> ownerCards, Player[] players) {
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public ArrayList<GameMapPosition> getGameMapPositions() {
        return gameMapPositions;
    }

    public void setGameMapPositions(ArrayList<GameMapPosition> gameMapPositions) {
        this.gameMapPositions = gameMapPositions;
    }

    public ArrayList<OwnerCard> getOwnerCards() {
        return ownerCards;
    }

    public void setOwnerCards(ArrayList<OwnerCard> ownerCards) {
        this.ownerCards = ownerCards;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

   
}
