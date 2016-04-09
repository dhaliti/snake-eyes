//package testing;
import java.util.Random;

/**
 *
 * @author dwen
 */
 
public class DiceChance 
{
    
public static void main(String args[])
   {
    Random rand = new Random();
    
    int dice1;
    int dice2;
    int count = 0;
    
    
    while(true){
        if((dice1 = rand.nextInt(6)+1) == 1 && (dice1 = rand.nextInt(6)+1) == 1){
            System.out.printf("The dics rolled %d times till \"Snake eyes\" happend\n", count);
            break;
        }else count +=1;
        
       
    }
    
    
    }
}
    
    

