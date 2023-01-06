package consoleMonopoly.gameKit;

import java.util.Random;


public class Dice {
    
    public int d6throw (Random random){   
    return random.nextInt(6)+1;   
    }
    
}
