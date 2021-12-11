import java.util.Scanner;
import java.util.ArrayList;

class Main {
   ArrayList<String> words = new ArrayList<String>();
  
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("How many letters are in the word?");
      int amountOfLetters = scan.nextInt();
      System.out.println("Do you want me to look for letters or a pattern?\n1. Letters\n2. Pattern");
      int choice = scan.nextInt();
      switch (choice){
         case 1:
            System.out.println("What letters are in the word?");
            String letters = scan.next();
            char[] characters = letters.toCharArray();
            break;
         case 2:
            System.out.println("What pattern is in the word?");
            String pattern = scan.next();
            char[] charactersInPattern = pattern.toCharArray();
            break;
         default:
            System.out.println("Please select 1 or 2 next time!");
      }
   }
   public void wordContainsLetter(String word, char letter){
      for(String Wordlist : words){
      }
   }
   void wordContainsString (String word1, String word2){
   
   }
   public void guessWordWithLetters (English object, String letters, char characters){
   
      for (String Wordlist : words){
         System.out.print(words);
      }
   }
   void guessWordWithPattern(English object,String pattern, char charactersInPattern){
      for (String Wordlist : words){
      }
   }
}