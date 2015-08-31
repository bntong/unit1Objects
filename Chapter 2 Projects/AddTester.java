import java.awt.Rectangle;

public class AddTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5 , 10 , 20 , 30);
        System.out.println(box);
        box.add(0,0);
        System.out.println(box);
        System.out.println("The .add() method extends the rectangle to the specified point.");
    }
}