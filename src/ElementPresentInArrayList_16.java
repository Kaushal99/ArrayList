import java.util.ArrayList;

public class ElementPresentInArrayList_16
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList();

        list.add("Kaushal");
        list.add("Niraj");
        list.add("Lucky");
        list.add("Dhara");

        System.out.println("IF ARRAYLIST CONTAINS: "+ list.contains("Dhara") );       //true

        System.out.println( "IF ARRAYLIST DONT CONTAINS: "+ list.contains("Hetal") );       //false

    }
}
