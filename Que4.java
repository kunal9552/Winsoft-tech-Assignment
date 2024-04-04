import java.util.*;

class Que4 
{
    public static void Duplicate(String str) {
        str = str.toLowerCase();
        char Arr[] = str.toCharArray();

        int i = 0;
        int j = 0;
        int count = 0;

        System.out.println("Duplicate characters in a given string are: ");

        for (i = 0; i < Arr.length; i++) 
        {
            count = 1;
            for (j = i + 1; j < Arr.length; j++) 
            {
                if (Arr[i] == Arr[j] && Arr[i] != ' ') 
                {
                    count++;
                    Arr[j] = '0';
                }
            }

            if (count > 1 && Arr[i] != '0')
            {
                System.out.println(Arr[i]);
            }
        }
    }

    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("String is : " + str);

        Duplicate(str);
    }

}
