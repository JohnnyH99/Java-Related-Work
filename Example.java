import java.util.*;
public class Example
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //create object of scanner class
        int[] input=new int[15]; //variable declaration
        int target;
        int low, high, mid;
        for(int i=0;i<15;i++) //take input from user
        {
            System.out.print("Enter slot "+i+": ");
            input[i]=sc.nextInt();
        }
        System.out.print("Enter a target: "); //take target from user
        target=sc.nextInt();
        for(int i=0;i<15;i++) //print the array elements
            System.out.print(input[i]+"|");
        System.out.println();
        for(int i=0;i<15;i++) //linear search
        {
            if(input[i]==target)
            {
                System.out.print(i+" ");
                break;
            }
            System.out.print(i+" ");
        }  
        System.out.println();
        low=0;
        high=14;
        while(low<=high) //binary search
        {
            mid=(low+high)/2;
            System.out.print(mid+" ");
            if(input[mid]==target)
                break;
            else if(input[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
    }
}    