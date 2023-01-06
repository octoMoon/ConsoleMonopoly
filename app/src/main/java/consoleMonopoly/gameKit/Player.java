package consoleMonopoly.gameKit;

public class Player {

    private String name;
    private int numberInLine;
    private int money = 14800000;
    private boolean isAi;
    private boolean isBanker;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberInLine() {
        return numberInLine;
    }

    public void setNumberInLine(int numberInLine) {
        this.numberInLine = numberInLine;
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
