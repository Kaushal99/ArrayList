import java.util.Arrays;

public class EqualityOfArrays_9
{
    public static void main(String[] args)
    {
        // Let us create different string arrays

        String[] name = {"Kaushal", "Niraj", "Lucky","& " + "Dhara " +"Are " + "Automation " + "Tester",};
        String[] name1 = {"Kaushal", "Niraj", "Lucky","& " + "Dhara " +"Are " + "Automation " + "Tester",};

        System.out.println("name : "+ Arrays.toString(name));
        System.out.println("name1 : "+Arrays.toString(name1));

        boolean  equalOrNot = true; //asign boolean to fing true or false;

       if (true)
       {
           System.out.println("Name equals to Name1 : " + Arrays.equals(name, name1));
       }
        else
            {
                System.out.println("Name is not equals to Name1 : " + Arrays.equals(name, name1));
            }

    }
}
