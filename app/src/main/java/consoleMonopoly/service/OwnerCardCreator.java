package consoleMonopoly.service;

import static consoleMonopoly.enums.Collor.*;
import consoleMonopoly.gameKit.OwnerCard;
import java.util.ArrayList;

public class OwnerCardCreator {

    public ArrayList<OwnerCard> create() {
        ArrayList<OwnerCard> ownerCards = new ArrayList<>(28);
        ownerCards.add(new OwnerCard("Старая Дорога", BROWN, 2, 10, 30, 90, 160, 250, 50, 50, 30));
        ownerCards.add(new OwnerCard("Главное шоссе", BROWN, 4, 20, 60, 180, 320, 450, 50, 50, 30));
        ownerCards.add(new OwnerCard("Аквопарк", BLUE, 6, 30, 90, 270, 400, 550, 50, 50, 50));
        ownerCards.add(new OwnerCard("Городской парк", BLUE, 6, 30, 90, 270, 400, 550, 50, 50, 50));
        ownerCards.add(new OwnerCard("Горнолыжный курорт", BLUE, 8, 40, 100, 300, 450, 600, 50, 50, 60));
        ownerCards.add(new OwnerCard("Спальный район", PINK, 10, 50, 150, 450, 625, 750, 100, 100, 70));
        ownerCards.add(new OwnerCard("Деловой квартал", PINK, 10, 50, 150, 450, 625, 750, 100, 100, 70));
        ownerCards.add(new OwnerCard("Торговая площадь", PINK, 12, 60, 180, 500, 700, 900, 100, 100, 80));
        ownerCards.add(new OwnerCard("Улица Пушкина", ORANGE, 14, 70, 200, 550, 750, 950, 100, 100, 90));
        ownerCards.add(new OwnerCard("Проспект мира", ORANGE, 14, 70, 200, 550, 750, 950, 100, 100, 90));
        ownerCards.add(new OwnerCard("Проспект победы", ORANGE, 16, 80, 220, 600, 800, 1000, 100, 100, 100));
        ownerCards.add(new OwnerCard("Бар", RED, 18, 90, 250, 700, 875, 1050, 150, 150, 110));
        ownerCards.add(new OwnerCard("Ночной клуб", RED, 18, 90, 250, 700, 875, 1050, 150, 150, 110));
        ownerCards.add(new OwnerCard("Ресторан", RED, 20, 100, 300, 750, 925, 1100, 150, 150, 120));
        ownerCards.add(new OwnerCard("Компьютеры", YELLOW, 22, 110, 330, 800, 975, 1150, 150, 150, 130));
        ownerCards.add(new OwnerCard("Интернет", YELLOW, 22, 110, 330, 800, 975, 1150, 150, 150, 130));
        ownerCards.add(new OwnerCard("Сотовая связь", YELLOW, 24, 120, 360, 850, 1025, 1200, 150, 150, 140));
        ownerCards.add(new OwnerCard("Морские перевозки", GREEN, 26, 130, 390, 900, 1100, 1275, 200, 200, 150));
        ownerCards.add(new OwnerCard("Железная дорога", GREEN, 26, 130, 390, 900, 1100, 1275, 200, 200, 150));
        ownerCards.add(new OwnerCard("Авиакомпания", GREEN, 28, 150, 450, 1000, 1200, 1400, 200, 200, 160));
        ownerCards.add(new OwnerCard("Курортная зона", PURPLE, 35, 175, 500, 1100, 1300, 1500, 200, 200, 175));
        ownerCards.add(new OwnerCard("Гостиничный комплекс", PURPLE, 50, 200, 600, 1400, 1700, 2000, 200, 200, 200));
        return ownerCards;
    }

}
