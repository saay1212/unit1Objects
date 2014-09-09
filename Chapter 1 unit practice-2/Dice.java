import java.util.Random;
public class Dice
{
    public static void main(String[]args)
    {
        Random die=new Random(); 
        int number=die.nextInt(6)+1;
        System.out.println(number);
    }
}