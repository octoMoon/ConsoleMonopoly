package consoleMonopoly.gameKit;

import java.util.Random;

public class Dice {

    public int d6throw(Random random) {
        int i = random.nextInt(12) + 1;
        System.out.println("Вы бросили кубик и выпало: " + i);
        return i;
    }

}
