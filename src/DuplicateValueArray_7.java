public class DuplicateValueArray_7
{
    public static void main(String[] args)
    {
        //Initialize array
        int [] a = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate values arrays: ");
        //Searches for duplicate element
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] == a[j])
                    System.out.print(a[j] + " ");
            }
        }

    }

}
