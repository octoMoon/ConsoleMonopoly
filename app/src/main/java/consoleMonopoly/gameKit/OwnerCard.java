package consoleMonopoly.gameKit;

import consoleMonopoly.enums.Collor;
import java.util.Objects;

public class OwnerCard {

    private String cardName;
    private Collor collor;
    private int buildingFreeRent;
    private int oneHouseRent;
    private int twoHouseRent;
    private int threeHouseRent;
    private int fourHouseRent;
    private int hotelRent;

    private int costHouse;
    private int costHotel;
    private int plege;

    public OwnerCard(String cardName, Collor collor, int buildingFreeRent, int oneHouseRent, int twoHouseRent, int threeHouseRent, int fourHouseRent, int hotelRent, int costHouse, int costHotel, int plege) {
        this.cardName = cardName;
        this.collor = collor;
        this.buildingFreeRent = buildingFreeRent;
        this.oneHouseRent = oneHouseRent;
        this.twoHouseRent = twoHouseRent;
        this.threeHouseRent = threeHouseRent;
        this.fourHouseRent = fourHouseRent;
        this.hotelRent = hotelRent;
        this.costHouse = costHouse;
        this.costHotel = costHotel;
        this.plege = plege;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Collor getCollor() {
        return collor;
    }

    public void setCollor(Collor collor) {
        this.collor = collor;
    }

    public int getBuildingFreeRent() {
        return buildingFreeRent;
    }

    public void setBuildingFreeRent(int buildingFreeRent) {
        this.buildingFreeRent = buildingFreeRent;
    }

    public int getOneHouseRent() {
        return oneHouseRent;
    }

    public void setOneHouseRent(int oneHouseRent) {
        this.oneHouseRent = oneHouseRent;
    }

    public int getTwoHouseRent() {
        return twoHouseRent;
    }

    public void setTwoHouseRent(int twoHouseRent) {
        this.twoHouseRent = twoHouseRent;
    }

    public int getThreeHouseRent() {
        return threeHouseRent;
    }

    public void setThreeHouseRent(int threeHouseRent) {
        this.threeHouseRent = threeHouseRent;
    }

    public int getFourHouseRent() {
        return fourHouseRent;
    }

    public void setFourHouseRent(int fourHouseRent) {
        this.fourHouseRent = fourHouseRent;
    }

    public int getHotelRent() {
        return hotelRent;
    }

    public void setHotelRent(int hotelRent) {
        this.hotelRent = hotelRent;
    }

    public int getCostHouse() {
        return costHouse;
    }

    public void setCostHouse(int costHouse) {
        this.costHouse = costHouse;
    }

    public int getCostHotel() {
        return costHotel;
    }

    public void setCostHotel(int costHotel) {
        this.costHotel = costHotel;
    }

    public int getPlege() {
        return plege;
    }

    public void setPlege(int plege) {
        this.plege = plege;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OwnerCard other = (OwnerCard) obj;
        return Objects.equals(this.cardName, other.cardName);
    }
    
    
}
