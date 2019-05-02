import java.lang.reflect.Array;
import java.util.Arrays;

public class CommonElementsBetweenArrays_8
{
    public static void main(String[] args)
    {
        String[] name = {"Kaushal", "Niraj", "Lucky", "Dhara", "Automation","Tester", "Jupiter"};

        String[] name1 = {"Hetal", "Kanchan", "Kaushal", "Tester","Shalini", "Automation"};

        System.out.println("name : "+ Arrays.toString(name));
        System.out.println("name1 : "+Arrays.toString(name1));


        for(int i=0;i<name.length;i++)
        {
            for(int j=0;j<name1.length;j++)
            {
                if(name[i] == name1[j])
                {
                    System.out.println("Common Element is: " + (name[i]));
                }
            }
        }






    }

}
