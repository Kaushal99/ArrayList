import java.util.ArrayList;

public class CloneArrayList_14
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Niraj");
        arrayList.add("Kaushal");
        arrayList.add("Lucky");
        arrayList.add("Keyur");

        System.out.println("Original array list: "+ arrayList);

        ArrayList<String> arrayClone =  (ArrayList<String>) arrayList.clone();

        System.out.println("Cloned array list: "+ arrayClone);

    }

}
