package consoleMonopoly.service;

import static consoleMonopoly.enums.Collor.*;
import static consoleMonopoly.enums.MapType.*;
import consoleMonopoly.gameKit.GameMap;
import consoleMonopoly.gameKit.Player;
import java.util.ArrayList;
import java.util.Scanner;

public class GameCreator {

    public int playerCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько будет игроков ? (Не больше 6!)");
        return scanner.nextInt();
    }

    public Player[] createPlayer(int count) {
        Player[] players = new Player[count];
        Scanner scanner = new Scanner(System.in);
        
        for (int i =0;i<count;i++) {
            players[i] = new Player();
            System.out.println("Введите имя нового игрока, добавте бот и банкир в конце имени для определения ии и банкира (1 банкир, 1 бот!)");
            players[i].setName(scanner.nextLine());
        }

        return players;
    }
    
    public ArrayList<GameMap> createGameMap(){
    ArrayList<GameMap> gameMap = new ArrayList<>(40);
        gameMap.add(new GameMap(START));
        gameMap.add(new GameMap(SITES, 60000000, "Средняя улица", BROWN));
        gameMap.add(new GameMap(CHESS));
        gameMap.add(new GameMap(SITES, 60000000, "Балтийская улица", BROWN));
        gameMap.add(new GameMap(TAX,200000000, "Подоходный налог"));
        gameMap.add(new GameMap(TRANSPORT, 200000000, "Шереметьево"));
        gameMap.add(new GameMap(SITES, 100000000, "Оринтальная улица", BLUE));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 100000000, "Вермонт улица", BLUE));
        gameMap.add(new GameMap(SITES, 120000000, "Конектикут улица", BLUE));
        gameMap.add(new GameMap(JAIL));
        gameMap.add(new GameMap(SITES, 140000000, " улица", PINK));
        gameMap.add(new GameMap(COMMUNICATION,150000000,"Электрическая компания"));
        gameMap.add(new GameMap(SITES, 140000000, "Конектикут улица", PINK));
        gameMap.add(new GameMap(SITES, 160000000, "Конектикут улица", PINK));
        gameMap.add(new GameMap(TRANSPORT, 200000000, "Шереметьево"));
        gameMap.add(new GameMap(SITES, 180000000, "Конектикут улица", ORANGE));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 180000000, "Конектикут улица", ORANGE));
        gameMap.add(new GameMap(SITES, 200000000, "Конектикут улица", ORANGE));
        gameMap.add(new GameMap(FREE_PARKING));
        gameMap.add(new GameMap(SITES, 220000000, "Конектикут улица", RED));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 220000000, "Конектикут улица", RED));
        gameMap.add(new GameMap(SITES, 240000000, "Конектикут улица", RED));
        gameMap.add(new GameMap(TRANSPORT, 200000000, "Шереметьево"));
        gameMap.add(new GameMap(SITES, 260000000, "Конектикут улица", YELLOW));
        gameMap.add(new GameMap(SITES, 260000000, "Конектикут улица", YELLOW));
        gameMap.add(new GameMap(COMMUNICATION,150000000,"Электрическая компания"));
        gameMap.add(new GameMap(SITES, 280000000, "Конектикут улица", YELLOW));
        gameMap.add(new GameMap(GO_JAIL));
        gameMap.add(new GameMap(SITES, 300000000, "Конектикут улица", GREEN));
        gameMap.add(new GameMap(SITES, 300000000, "Конектикут улица", GREEN));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 320000000, "Конектикут улица", GREEN));
        gameMap.add(new GameMap(TRANSPORT, 200000000, "Шереметьево"));
        gameMap.add(new GameMap(CHANCE));
        gameMap.add(new GameMap(SITES, 350000000, "Конектикут улица", PURPLE));
        gameMap.add(new GameMap(TAX,100000000, "Подоходный налог"));
        gameMap.add(new GameMap(SITES, 400000000, "Конектикут улица", PURPLE));
        
        return gameMap;
    
    }

}
