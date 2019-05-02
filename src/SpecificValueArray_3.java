import java.util.Arrays;
import java.util.Scanner;

public class SpecificValueArray_3
{
    public static void main(String[] args)
    {

        int[] num = {10,20,30,40,50,60};

        System.out.println("Enter the Value : ");
        Scanner sc=new Scanner(System.in);
        int toFind = sc.nextInt();

        boolean found = false;

        for (int n : num) {
            if (n == toFind)
            {
                found = true;
                break;
            }
        }

        if(found)
        {
            System.out.println(toFind + " is found.");
        }
        else
            {
            System.out.println(toFind + " is not found");
            }


    }

}
