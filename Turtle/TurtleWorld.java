import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.setPenWidth(100);
        turtle.penDown();
        
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setPenColor(Color.BLUE);
        turtle2.setPenWidth(100);
        turtle2.penDown();
        
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.setPenColor(Color.GREEN);
        turtle3.setPenWidth(100);
        turtle3.penDown();
        
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle4.setPenColor(Color.YELLOW);
        turtle4.setPenWidth(100);
        turtle4.penDown();
        
        Turtle turtle5 = new Turtle(turtleWorld);
        turtle5.setPenColor(Color.BLACK);
        turtle5.setPenWidth(100);
        turtle5.penDown();

        for (int i = 0; i < 36; i ++) 
        {
            turtle.turn(60);
            turtle.forward(100);
            turtle.turn(120);
            turtle.forward(100);
            turtle.turn(120);
            turtle.forward(100);
            turtle.turn(50);
        }
        for (int i = 0; i < 36; i ++) 
        {
            turtle2.turn(60);
            turtle2.forward(80);
            turtle2.turn(120);
            turtle2.forward(80);
            turtle2.turn(120);
            turtle2.forward(80);
            turtle2.turn(50);
        }
        for (int i = 0; i < 36; i ++) 
        {
            turtle3.turn(60);
            turtle3.forward(60);
            turtle3.turn(120);
            turtle3.forward(60);
            turtle3.turn(120);
            turtle3.forward(60);
            turtle3.turn(50);
        }
        for (int i = 0; i < 36; i ++) 
        {
            turtle4.turn(60);
            turtle4.forward(40);
            turtle4.turn(120);
            turtle4.forward(40);
            turtle4.turn(120);
            turtle4.forward(40);
            turtle4.turn(50);
        }
    }
}
    
         
    

