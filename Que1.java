public class Que1 
{
    public static void sortArray(int Arr[],int Brr[])
    {
        int iPos = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 0)
            {
                Arr[i] = Brr[iPos];
                iPos = iPos + 1;
            }
        }
        int i = 0, j = 0;
        for(i = 1; i < Arr.length; i++)
        {
            j = i-1;
            int Temp = Arr[i];
            while(j >= 0 && Arr[j] > Temp)
            {
                Arr[j+1] = Arr[j];
                j--;
            }
            Arr[j+1] = Temp;
        }    

    }

    public static void main(String arg[])
    {
        int Arr[] = {0,2,0,3,0,5,6,0,0};
        int Brr[] = {1,8,9,10,15};

        sortArray(Arr,Brr);

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+" ");
        }
    } 
}
