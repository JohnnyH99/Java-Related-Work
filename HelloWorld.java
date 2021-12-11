import java.util.*;
public class HelloWorld{
public static void main(String args[]){
    int n,i;
    System.out.print("Enter the of GPAs");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    float a[]=new float[n];
    for(i=0;i<n;i++){
        System.out.print("GPA #"+i+":");
        a[i]=s.nextFloat();
        System.out.println();
    }
    for(i=0;i<n;i++){
        if(a[i]<2.0f){
            System.out.println("Student #"+i+":"+"not graduating");
        }
        else if(a[i]>=2.0f && a[i]<3.50f){
            System.out.println("Student #"+i+":"+"graduating");
        }
        else if(a[i]>=3.50f && a[i]<3.69f){
            System.out.println("Student #"+i+":"+" Laude");
        }
        else if(a[i]>=3.70f && a[i]<3.89f){
            System.out.println("Student #"+i+":"+"Magna Laude");
        }
         else if(a[i]>=3.90f && a[i]<=4.0f){
            System.out.println("Student #"+i+":"+"Summa Laude");
        }
    }
}
}
 