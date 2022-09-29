import java.util.Scanner;

public class Main
{
    public static void main(String[] args)




    {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the outside temp in celcius: ");
        double celcius = in.nextDouble();

        double fahrenheight = ((celcius *9)/5)+32;

        System.out.println("the outside temp in fahrenheight is " +fahrenheight);



    }
}