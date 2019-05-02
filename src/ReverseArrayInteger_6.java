import java.util.Arrays;

public class ReverseArrayInteger_6
{
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++)
        {
            b[j - 1] = a[i];
            j = j - 1;
        }
        //printing the reversed array
        System.out.println("Reversed array is: " + Arrays.toString(b));
    }
    // function that reverses array and stores it  in another array

    public static void main(String[] args)
    {

        int[] x = {10,9,8,7,6,5,4,3,2,1};

        System.out.println("Array :" + Arrays.toString(x));
        reverse(x, x.length);

    }

}