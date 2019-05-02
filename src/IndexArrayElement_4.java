public class IndexArrayElement_4
{

    public static int found(int[] x,int find)
    {
        for (int i = 0; i < x.length; i++)
            if (x[i] == find)
                return i;

        return -1;

    }
    public static void main(String[] args)
    {
        int [] x = {12,32,35,44,87,55,32};
        System.out.println("Index Array Possition 12 is :"+found(x,12));
        System.out.println("Index Array Possition 44 is :" + found(x,44));



    }


}
