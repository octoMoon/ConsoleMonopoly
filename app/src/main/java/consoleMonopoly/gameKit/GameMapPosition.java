package consoleMonopoly.gameKit;

import consoleMonopoly.enums.Collor;
import consoleMonopoly.enums.MapType;

public class GameMapPosition {

    private MapType type;
    private Collor collor;
    private int price;
    private boolean isFree = true;
    private String name;

    public GameMapPosition(MapType type) {
        this.type = type;
    }

    public GameMapPosition(MapType type, int price, String name) {
        this.type = type;
        this.price = price;
        this.name = name;
    }

    public GameMapPosition(MapType type, int price, String name, Collor collor) {
        this.type = type;
        this.collor = collor;
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public MapType getType() {
        return type;
    }

    public void setType(MapType type) {
        this.type = type;
    }

    public Collor getCollor() {
        return collor;
    }

    public void setCollor(Collor collor) {
        this.collor = collor;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setIsFree(boolean isBy) {
        this.isFree = isBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
