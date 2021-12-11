import java.util.Scanner; //imports the java utillity scanner

public class MyPrompter{
   public static void main(String[] args){
   
      int num1 = 10;
      int num2 = 50;
      System.out.println("Odd number display");
   
   
      Scanner input = new Scanner(System.in); //scans for user input and stores in "input"
         
      System.out.println("Please enter your first number: ");
      num1 = input.nextInt(); //stores input for the first number
      
      System.out.println("Please enter your second number: ");
      num2 = input.nextInt(); //stores input for the second number 
      
      int current =  num1;
      for (current < num2) {
         if (current % 2 != 0) {
            System.out.println(current);
         }
         current++;
      }   }
}