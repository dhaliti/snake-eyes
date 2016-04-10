//package testing;
import java.util.Random;

/**
 *
 * @author dwen
 */
 
public class SnakeEyes{
    
public static void main(String args[]){
    Random rand = new Random();
    
    int dice1;
    int dice2;
    int count = 0;
   
    while(true){
        dice1 = rand.nextInt(6)+1;
        dice2 = rand.nextInt(6)+1;
        System.out.printf("Dice one rolled |%d|, dice two rolled |%d|.\n", dice1,dice2);
        count +=1;
        
        if(dice1 == 1 && dice2 == 1){
            System.out.printf("It rolled \"Snake eyes\" after %d times of rolling.\n", count);
            break;
          }
    }
    
    
    }
}
    
    

