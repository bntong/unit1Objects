import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.forward(50);
        turtle2.setPenColor(Color.GREEN);
        turtle2.penDown();
        for (int i = 0; i < 50; i ++) 
        {
            turtle.turn(60);
            turtle.forward(100);
            turtle.turn(120);
            turtle.forward(100);
            turtle.turn(120);
            turtle.forward(100);
            turtle.turn(50);
        }
        for (int i = 0; i < 50; i ++) 
        {
            turtle2.turn(60);
            turtle2.forward(100);
            turtle2.turn(120);
            turtle2.forward(100);
            turtle2.turn(120);
            turtle2.forward(100);
            turtle2.turn(50);
        }
        
        
        
    }
}
    
         
    

