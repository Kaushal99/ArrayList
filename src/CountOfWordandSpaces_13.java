import java.util.Scanner;

public class CountOfWordandSpaces_13
{
    public static void main(String[] args)
    {
        int word=1;
        System.out.println("Enter Sentence :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                word++;
        }

        System.out.println("Count of words="+word);
        System.out.println("Count of spaces="+(word-1));


    }
}