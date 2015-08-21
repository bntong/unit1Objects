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
        turtle2.setPenColor(Color.GREEN);
        turtle2.penDown();
        while (true) {
            turtle.turn(60);
            turtle.forward(100);
            turtle.turn(120);
            turtle.forward(100);
            turtle.turn(120);
            turtle.forward(100);
            turtle.turn(100);
        }
    }
    
         
    }

