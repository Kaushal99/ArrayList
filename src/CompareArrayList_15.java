import java.util.ArrayList;

public class CompareArrayList_15
{
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Kaushal");
        a.add("Niraj");
        a.add("Keyur");
        a.add("Lucky");

        ArrayList<String> b = new ArrayList<String>();
        b.add("Kaushal");
        b.add("Niraj");
        b.add("Dhara");
        b.add("Lucky");

        System.out.println("Original array list: "+ a);
        System.out.println("Is Array List a and b matches");
        if(a.equals(b))
        {

            System.out.println("True");
        }
        else
            {
        System.out.println("False");
        }

    }
}
