import java.util.Scanner;
class Sort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length,count=0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count=count+1;
                }
            }
            for(int k=0; k<n; ++k)
            System.out.print(arr[k] + "|");   
            System.out.print(" Num of Swaps:" +count); 
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Sort ob = new Sort();
        int arr[] = new int[10];
        Scanner in = new Scanner(System.in); 
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter slot " +i +":");
           arr[i] = in.nextInt(); 
        }
        ob.bubbleSort(arr); 
    }
}