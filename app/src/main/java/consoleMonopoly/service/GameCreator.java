package consoleMonopoly.service;

import static consoleMonopoly.enums.Collor.*;
import static consoleMonopoly.enums.MapType.*;
import consoleMonopoly.gameKit.GameMap;
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
        }

        return players;
    }

    public ArrayList<GameMap> createGameMap() {
        ArrayList<GameMap> gameMap = new ArrayList<>(40);
        gameMap.add(new GameMap(START));
        gameMap.add(new GameMap(SITES, 60, "Старая дорога", BROWN));
        gameMap.add(new GameMap(CHESS));
        gameMap.add(new GameMap(SITES, 60, "Главное шоссе", BROWN));
        gameMap.add(new GameMap(TAX, 200, "Подоходный налог"));
        gameMap.add(new GameMap(TRANSPORT, 200, "Западный морской порт"));
        gameMap.add(new GameMap(SITES, 100, "Аквапарк", BLUE));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 100, "Городской парк", BLUE));
        gameMap.add(new GameMap(SITES, 120, "Горнолыжный курорт", BLUE));
        gameMap.add(new GameMap(JAIL));
        gameMap.add(new GameMap(SITES, 140, "Спальный район", PINK));
        gameMap.add(new GameMap(COMMUNICATION, 150, "Электрическая компания"));
        gameMap.add(new GameMap(SITES, 140, "Деловой квартал", PINK));
        gameMap.add(new GameMap(SITES, 160, "Торговая площадь", PINK));
        gameMap.add(new GameMap(TRANSPORT, 200, "Северный морской порт"));
        gameMap.add(new GameMap(SITES, 180, "Улица Пушкина", ORANGE));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 180, "Проспект мира", ORANGE));
        gameMap.add(new GameMap(SITES, 200, "Проспект победы", ORANGE));
        gameMap.add(new GameMap(FREE_PARKING));
        gameMap.add(new GameMap(SITES, 220, "Бар", RED));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 220, "Ночной клуб", RED));
        gameMap.add(new GameMap(SITES, 240, "Ресторан", RED));
        gameMap.add(new GameMap(TRANSPORT, 200, "Восточный морской порт"));
        gameMap.add(new GameMap(SITES, 260, "Компьютеры", YELLOW));
        gameMap.add(new GameMap(SITES, 260, "Интернет", YELLOW));
        gameMap.add(new GameMap(COMMUNICATION, 150, "Водопроводная компания"));
        gameMap.add(new GameMap(SITES, 280, "Сотовая связь", YELLOW));
        gameMap.add(new GameMap(GO_JAIL));
        gameMap.add(new GameMap(SITES, 300, "Морские перевозки", GREEN));
        gameMap.add(new GameMap(SITES, 300, "Железная дорога", GREEN));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 320, "Авиакомпания", GREEN));
        gameMap.add(new GameMap(TRANSPORT, 200, "Южный морской порт"));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 350, "Курортная зона", PURPLE));
        gameMap.add(new GameMap(TAX, 100, "Подоходный налог"));
        gameMap.add(new GameMap(SITES, 400, "Гостиничный комплекс", PURPLE));

        return gameMap;

    }

}
