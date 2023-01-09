package consoleMonopoly.gameKit;

import consoleMonopoly.enums.Collor;
import consoleMonopoly.enums.MapType;

public class GameMap {

    private MapType type;
    private Collor collor;
    private int tax;
    private boolean isFree = true;
    private String name;

    public GameMap(MapType type) {
        this.type = type;
    }

    public GameMap(MapType type, int tax, String name) {
        this.type = type;
        this.tax = tax;
        this.name = name;
    }

    public GameMap(MapType type, int tax, String name, Collor collor) {
        this.type = type;
        this.collor = collor;
        this.tax = tax;
        this.name = name;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
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
