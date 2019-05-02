import java.util.ArrayList;

public class PositonOfArrayList_17
{
    public static void main(String[] args)
    {
        // create an empty array list with an initial capacity
        ArrayList<String> arrlist = new ArrayList<String>(5);

        // use add() method to add elements in the list
        arrlist.add("Harry");
        arrlist.add("Tom");
        arrlist.add("Jerry");
        arrlist.add("Duck");

        // let us print all the elements available in list
        for (String name : arrlist) {
            System.out.println("NAME = " + name);
        }

        // retrieves element at postion 1,2,3..
        String copy = arrlist.get(2);
        System.out.println("Retrieved element is = " + copy);

    }

}
