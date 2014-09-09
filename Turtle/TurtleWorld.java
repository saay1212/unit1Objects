import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
         throws InterruptedException
    {
        World world = new World();
        Turtle s1 = new Turtle(world);
        Turtle s2 = new Turtle(world);
        Turtle s3 = new Turtle(world);
        Turtle s4 = new Turtle(world);
        Turtle s5 = new Turtle(world);
        s1.setPenColor(Color.BLUE);
        s2.setPenColor(Color.RED);
        s3.setPenColor(Color.YELLOW);
        s4.setPenColor(Color.MAGENTA);
        s5.setPenColor(Color.ORANGE);
        s1.forward();
        s2.forward(80);
        s3.forward(60);
        s4.forward(40);
        s5.forward(20);
        s1.setPenWidth(3);
        s2.setPenWidth(3);
        s3.setPenWidth(3);
        s4.setPenWidth(3);
        s5.setPenWidth(3);
        s1.setPenColor(Color.RED);
        s2.setPenColor(Color.YELLOW);
        s3.setPenColor(Color.MAGENTA);
        s4.setPenColor(Color.ORANGE);
        s5.setPenColor(Color.BLUE);
        s1.turnLeft();
        s2.turnRight();
        s3.forward();
        s4.turnLeft();
        s5.turnRight();
        s1.forward(40);
        s2.forward(40);
        s4.forward(40);
        s5.forward(40);
        int x=2;
        while (x==2)
        {
        s1.forward(100);
        s2.forward(100);
        s4.forward(100);
        s5.forward(100);
        Thread.sleep(100);
        s1.forward(100);
        s2.forward(100);
        s4.forward(100);
        s5.forward(100);
        s1.turnLeft();
        s2.turnRight();
        s3.forward();
        s4.turnLeft();
        s5.turnRight();
        s1.forward(40);
        s2.forward(40);
        s4.forward(40);
        s5.forward(40);
        Thread.sleep(100);
        s1.setPenWidth(10);
        s2.setPenWidth(10);
        s3.setPenWidth(10);
        s4.setPenWidth(10);
        s5.setPenWidth(10);
        s1.forward(40);
        s2.forward(40);
        s4.forward(40);
        s5.forward(40);
        Thread.sleep(100);
        s1.setPenColor(Color.BLUE);
        s2.setPenColor(Color.RED);
        s3.setPenColor(Color.YELLOW);
        s4.setPenColor(Color.MAGENTA);
        s5.setPenColor(Color.ORANGE);
        s1.forward(40);
        s2.forward(40);
        s4.forward(40);
        s5.forward(40);
        for (int i=1;i<99;i++)
        {if (i==95)
        {x=3;}}
            
        
        }
    }}