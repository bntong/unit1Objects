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
        turtle2.setPenColor(Color.ORANGE);
        turtle2.setPenWidth(100);
        turtle2.penDown();
        
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.setPenColor(Color.YELLOW);
        turtle3.setPenWidth(100);
        turtle3.penDown();
        
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle4.setPenColor(Color.GREEN);
        turtle4.setPenWidth(100);
        turtle4.penDown();
        
        Turtle turtle5 = new Turtle(turtleWorld);
        turtle5.setPenColor(Color.BLUE);
        turtle5.setPenWidth(100);
        turtle5.penDown();
        
        Turtle turtle6 = new Turtle(turtleWorld);
        turtle6.setPenColor(Color.MAGENTA);
        turtle6.setPenWidth(100);
        turtle6.penDown();
        
        Turtle turtle7 = new Turtle(turtleWorld);
        turtle7.setPenColor(Color.PINK);
        turtle7.setPenWidth(100);
        turtle7.penDown();
        
        Turtle turtle8 = new Turtle(turtleWorld);
        turtle8.setPenColor(Color.BLACK);
        turtle8.setPenWidth(100);
        turtle8.penDown();
        
        Turtle turtle9 = new Turtle(turtleWorld);
        turtle9.setPenColor(Color.WHITE);
        turtle9.setPenWidth(100);
        turtle9.penDown();

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
            turtle2.forward(90);
            turtle2.turn(120);
            turtle2.forward(90);
            turtle2.turn(120);
            turtle2.forward(90);
            turtle2.turn(50);
        }
        for (int i = 0; i < 36; i ++) 
        {
            turtle3.turn(60);
            turtle3.forward(80);
            turtle3.turn(120);
            turtle3.forward(80);
            turtle3.turn(120);
            turtle3.forward(80);
            turtle3.turn(50);
        }
        for (int i = 0; i < 36; i ++) 
        {
            turtle4.turn(60);
            turtle4.forward(70);
            turtle4.turn(120);
            turtle4.forward(70);
            turtle4.turn(120);
            turtle4.forward(70);
            turtle4.turn(50);
        }
        for (int i = 0; i < 36; i ++) 
        {
            turtle5.turn(60);
            turtle5.forward(60);
            turtle5.turn(120);
            turtle5.forward(60);
            turtle5.turn(120);
            turtle5.forward(60);
            turtle5.turn(50);
        }
         for (int i = 0; i < 36; i ++) 
        {
            turtle6.turn(60);
            turtle6.forward(50);
            turtle6.turn(120);
            turtle6.forward(50);
            turtle6.turn(120);
            turtle6.forward(50);
            turtle6.turn(50);
        }
         for (int i = 0; i < 36; i ++) 
        {
            turtle7.turn(60);
            turtle7.forward(40);
            turtle7.turn(120);
            turtle7.forward(40);
            turtle7.turn(120);
            turtle7.forward(40);
            turtle7.turn(50);
        }
         for (int i = 0; i < 36; i ++) 
        {
            turtle8.turn(60);
            turtle8.forward(30);
            turtle8.turn(120);
            turtle8.forward(30);
            turtle8.turn(120);
            turtle8.forward(30);
            turtle8.turn(50);
        }
         for (int i = 0; i < 36; i ++) 
        {
            turtle9.turn(60);
            turtle9.forward(5);
            turtle9.turn(120);
            turtle9.forward(5);
            turtle9.turn(120);
            turtle9.forward(5);
            turtle9.turn(50);
        }
    }
}
    
         
    

