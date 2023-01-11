package consoleMonopoly.gameKit;

import java.util.ArrayList;

public class Player {

    private int id;
    private String name;
    private int money = 1500;
    private int position;
    private boolean isAi;
    private boolean isBanker;
    private ArrayList<OwnerCard> ownerCards;

    public Player() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public ArrayList<OwnerCard> getOwnerCards() {
        return ownerCards;
    }

    public void setOwnerCards(ArrayList<OwnerCard> ownerCards) {
        this.ownerCards = ownerCards;
    }
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isIsAi() {
        return isAi;
    }

    public void setIsAi(boolean isAi) {
        this.isAi = isAi;
    }

    public boolean isIsBanker() {
        return isBanker;
    }

    public void setIsBanker(boolean isBanker) {
        this.isBanker = isBanker;
    }

}
