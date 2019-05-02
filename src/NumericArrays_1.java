import java.lang.reflect.Array;
import java.util.Arrays;

public class NumericArrays_1
{
    public static void main(String[] args)
    {
        int x[]={5,35,6,7,33,22,45,32};
        String y [] = {"Kaushal" , "Niraj", "Lucky","Dhara" ,"Hetal"};

        System.out.println("Original Numeric Number :"+ Arrays.toString(x));
        Arrays.sort(x);//inbuilt method to sort the array
        System.out.println("Sorted Numeric Values :"+ Arrays.toString(x));


        System.out.println("Original String :" + Arrays.toString(y));
        Arrays.sort(y);
        System.out.println("Sorted String :"+ Arrays.toString(y));



    }


}
