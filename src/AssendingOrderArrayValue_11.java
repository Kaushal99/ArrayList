import java.util.Arrays;
import java.util.Scanner;

public class AssendingOrderArrayValue_11
{
    public static void main(String[] args)
    {
        int x;
        int y;

       Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter Number of elements in an array : ");
        int a = sc.nextInt();

        int [] b = new int[a];

        System.out.print(" Please Enter " + a + " elements of an Array  : ");
        for (y = 0; y < a; y++)
        {
            b[y] = sc.nextInt();
        }

        Arrays.sort(b);

        System.out.println("Result of a Sorted Array :  ");
        for (int Number: b)
        {
            System.out.print(Number + "  ");
        }
    }


}
