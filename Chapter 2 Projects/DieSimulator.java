import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        int x = 0;
        while(x < 1000)
        {
            Random random = new Random();
            System.out.println(random.nextInt(6)+1);
            x += 1;
        }
            
    }
}
