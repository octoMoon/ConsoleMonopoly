package consoleMonopoly.service;

import static consoleMonopoly.enums.Collor.*;
import static consoleMonopoly.enums.MapType.*;
import consoleMonopoly.gameKit.GameMapPosition;
import consoleMonopoly.gameKit.Player;
import java.util.ArrayList;
import java.util.Scanner;

public class GameCreator {

    int bank;

    public int playerCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько будет игроков ? (Не больше 6!)");
        return scanner.nextInt();
    }

    public Player[] createPlayer(int count) {
        Player[] players = new Player[count];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            players[i] = new Player();
            System.out.println("Введите имя нового игрока, добавте бот и банкир в конце имени для определения ии и банкира (1 банкир, 1 бот!)");
            players[i].setName(scanner.nextLine());
            players[i].setId(i);
        }

        return players;
    }

    public ArrayList<GameMapPosition> createGameMap() {
        ArrayList<GameMapPosition> gameMap = new ArrayList<>(40);
        gameMap.add(new GameMapPosition(START));
        gameMap.add(new GameMapPosition(SITES, 60, "Старая дорога", BROWN));
        gameMap.add(new GameMapPosition(CHESS));
        gameMap.add(new GameMapPosition(SITES, 60, "Главное шоссе", BROWN));
        gameMap.add(new GameMapPosition(TAX, 200, "Подоходный налог"));
        gameMap.add(new GameMapPosition(TRANSPORT, 200, "Западный морской порт"));
        gameMap.add(new GameMapPosition(SITES, 100, "Аквапарк", BLUE));
        gameMap.add(new GameMapPosition(CHANCE));
        gameMap.add(new GameMapPosition(SITES, 100, "Городской парк", BLUE));
        gameMap.add(new GameMapPosition(SITES, 120, "Горнолыжный курорт", BLUE));
        gameMap.add(new GameMapPosition(JAIL));
        gameMap.add(new GameMapPosition(SITES, 140, "Спальный район", PINK));
        gameMap.add(new GameMapPosition(COMMUNICATION, 150, "Электрическая компания"));
        gameMap.add(new GameMapPosition(SITES, 140, "Деловой квартал", PINK));
        gameMap.add(new GameMapPosition(SITES, 160, "Торговая площадь", PINK));
        gameMap.add(new GameMapPosition(TRANSPORT, 200, "Северный морской порт"));
        gameMap.add(new GameMapPosition(SITES, 180, "Улица Пушкина", ORANGE));
        gameMap.add(new GameMapPosition(CHANCE));
        gameMap.add(new GameMapPosition(SITES, 180, "Проспект мира", ORANGE));
        gameMap.add(new GameMapPosition(SITES, 200, "Проспект победы", ORANGE));
        gameMap.add(new GameMapPosition(FREE_PARKING));
        gameMap.add(new GameMapPosition(SITES, 220, "Бар", RED));
        gameMap.add(new GameMapPosition(CHANCE));
        gameMap.add(new GameMapPosition(SITES, 220, "Ночной клуб", RED));
        gameMap.add(new GameMapPosition(SITES, 240, "Ресторан", RED));
        gameMap.add(new GameMapPosition(TRANSPORT, 200, "Восточный морской порт"));
        gameMap.add(new GameMapPosition(SITES, 260, "Компьютеры", YELLOW));
        gameMap.add(new GameMapPosition(SITES, 260, "Интернет", YELLOW));
        gameMap.add(new GameMapPosition(COMMUNICATION, 150, "Водопроводная компания"));
        gameMap.add(new GameMapPosition(SITES, 280, "Сотовая связь", YELLOW));
        gameMap.add(new GameMapPosition(GO_JAIL));
        gameMap.add(new GameMapPosition(SITES, 300, "Морские перевозки", GREEN));
        gameMap.add(new GameMapPosition(SITES, 300, "Железная дорога", GREEN));
        gameMap.add(new GameMapPosition(CHANCE));
        gameMap.add(new GameMapPosition(SITES, 320, "Авиакомпания", GREEN));
        gameMap.add(new GameMapPosition(TRANSPORT, 200, "Южный морской порт"));
        gameMap.add(new GameMapPosition(CHANCE));
        gameMap.add(new GameMapPosition(SITES, 350, "Курортная зона", PURPLE));
        gameMap.add(new GameMapPosition(TAX, 100, "Подоходный налог"));
        gameMap.add(new GameMapPosition(SITES, 400, "Гостиничный комплекс", PURPLE));

        return gameMap;

    }

}
