import java.util.Scanner;

public class ChAs
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble();
        keyboard.nextLine();


        System.out.println("The average is : " + (num1+num2)/2);
    }
}