import java.util.ArrayList;

public class ReplaceArrayList_18
{
    //Java Program to demonstrate how to replace existing value in  ArrayList.

    public static void main(String[] args)
    {
        ArrayList<Integer> alist=new ArrayList<Integer>();
        alist.add(10);
        alist.add(20);
        alist.add(30);
        alist.add(40);
        alist.add(50);
        alist.add(60);

        //displaying elements
        System.out.println("Before Replacing Element : " + alist);

        //now, suppose you want to replace 30 with 80

        alist.set(2, 80);
        System.out.println("After Replacing Element : "+ alist);

    }
}
