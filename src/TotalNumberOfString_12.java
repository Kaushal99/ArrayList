import java.util.Scanner;

public class TotalNumberOfString_12
{
    public static void main(String[] args)
    {
        //scanner class to input String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word");
        String name = scanner.nextLine();

        //creating interger letter to use for loop method
        int letter = 0;
        for(int i = 0; i < name.length(); i++)
        {
            if (name.charAt(i) == 'a') {
                letter++;

            }
        }
        System.out.println("Total Number of 'a' in String " + "'" + name + "'" +   "is = "   + letter);
    }
}
