import java.util.Scanner;

public class SumValueArray_2
{

    public static void main(String[] args)
    {
        int[] array = {11,12,13,14,15};
        int sum = 0;
        //Advanced for loop
        for( int num : array)
        {
            sum = sum + num;
            //you can also use this method use sum += num
            //+= means a = a+b
            // += is an operator where left will add the right operand to the left operand and result to left operand
        }

        System.out.println("Sum value of arrays is :" + sum);

    }

}
