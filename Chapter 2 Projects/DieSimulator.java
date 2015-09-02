import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {  
            // Option A
            Random random = new Random();
            System.out.println(random.nextInt(6)+1);
            
            // Option B
            double random2 = Math.random(); // returns [0,1)
            random2 *=6;    //returns [0, 6)
            random2 += 1;    //returns [1, 7)
            System.out.println( (int) random2);
    }
}
