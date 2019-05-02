import java.util.Arrays;
import java.util.Scanner;

public class InsertArray_5
{
    public static void main(String[] args)
    {
      int [] x = {10,20,30,40,50};
      int pos = 3;
      int element = 80;

        System.out.println("Original sequnce of values : "+ Arrays.toString(x));

      for (int i = x.length-1; i > pos - 1;i--)
      {

          x[i] = x[i - 1];

      }
        //as it will not change the index number so the last value from index will be disappear
        x[pos -1] = element;
        System.out.println("Insert the  new value at 3 Position :"+ Arrays.toString(x) );




         // System.out.print(x[i] + " " );

    }
}