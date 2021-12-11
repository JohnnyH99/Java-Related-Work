import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class ChatBot{
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in); //create object of scanner class
      
      ArrayList<String> jokes = new ArrayList<String>(); //creates an ArrayList for Jokes
      jokes.add("Why was the lettuce embarrassed when it opened the refrigerator door?" + "\n"
         + "It saw the salad dressing.");
      jokes.add("What do you call a fish with no eyes?" + "\n"
         + "A fsh.");
      jokes.add("Why don't monsters eat clowns?" + "\n"
         + "Because they taste funny.");
      jokes.add("What is green and has wheels?" + "\n"
         + "Grass, I lied about the wheels.");
      jokes.add("Why don't lobsters or crabs share their food with each other?" + "\n"
         + "Because they're shellfish!");
      
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); //Sets up the date format  
      Date date = new Date();
      
      System.out.println("Hello there! My name is Chat Bot! How may I entertain you today?");
      System.out.println("If you want to know what I can do, just ask for 'help' and I'll provide you options!");
      
      boolean running = true;
      String chat;
      
      while(running == true) //While chat is running 
      {
         System.out.println(" ");
         chat = sc.nextLine();
         
         if(chat.equalsIgnoreCase("Hello")){ //Convoersations with the ChatBot
            System.out.println("Hello again!");
         }
         
         else if(chat.equalsIgnoreCase("How are you")){
            System.out.println("I'm doing fine! Thanks for asking!");
         }
         
         else if(chat.equalsIgnoreCase("How's it like being a robot")){
            System.out.println("Not too bad but I wish was smarter like the others.");
         }
         
         else if(chat.equalsIgnoreCase("What is your purpose")){
            System.out.println("To provide you some entertainment hopefully.");
         }
         
         
         else if(chat.equalsIgnoreCase("Help")){ //Lists out the commands
            System.out.println("Here are some commands:");
            System.out.println("Tell me a joke");
            System.out.println("What's the date and time now");
            System.out.println("Hangman");
            System.out.println("I also have some fun secrets if you can figure them out!");
         }
         
         else if(chat.equalsIgnoreCase("Tell me a joke")){ //Picks a random joke to tell
            Random rand = new Random();
            int random = rand.nextInt(jokes.size());
            String note = jokes.get(random);
            System.out.println(note);
         }
         
         else if(chat.equalsIgnoreCase("What's the date and time now")){
            System.out.println(formatter.format(date));
            System.out.println("Time sure does fly by when you're having fun.");
         
         }
         
         else if(chat.equalsIgnoreCase("I am the bone of my sword")){ //Fun Secret
            System.out.println("I am the bone of my sword." +
               "\n" + "Steel is my body, Fire is my blood." +
               "\n" + "I have created over a thousand blades." +
               "\n" + "Unknown to life, nor known to death." +
               "\n" + "Have withstood pain to create many weapons." +
               "\n" + "Yet those hands will never hold anything." +
               "\n" + "So as I pray. . . Unlimited Blade Works!");
         }
         
         else if(chat.equalsIgnoreCase("Hangman")){
            running = false;
         }
         
         else{
            System.out.println("I'm still learning so I don't understand.");    //User says something outside its field
            System.out.println("I suggest asking for 'help' for your options.");
         }
      }
      
      while(running == false) //while chat is not running, allows to play Hangman without interruptions
      {
         int attempts = 0;
      
         Set<String> previous = new HashSet<>();
         Scanner guess = new Scanner(System.in);
      
         System.out.println("Enter word to guess: ");
         String words = guess.nextLine().toUpperCase();
         int length = words.length();
      
         char[] wordsChars = words.toCharArray(); //creates char array of string
      
         char[] censor = words.toCharArray();
         System.out.println("Your word is: ");
      
         for (int index = 0; index < length; index++) {
            censor[index] = '*';
         }
      
         while (!String.valueOf(censor).equals(words)) {
         
         
            boolean right = false; 
            boolean repeat = false; 
                        
            //prints the censored secret word
            for (int a = 0; a < length; a++) {
               System.out.print(censor[a]);
            }
            System.out.println();
         
            //asks user for guess
            String current = guess.next().toUpperCase().substring(0, 1);
            char currentChar = current.charAt(0); 
                        
            //checks if user already guessed same one
            if (previous.contains(current)) {
               System.out.println("You already guessed this letter! Your previous guesses were: ");
               System.out.println(previous.stream().reduce("", String::concat));
               repeat = true;
            }
         
            previous.add(current);
         
            if (!repeat) {
               int times = 0; 
               for (int index = 0; index < length; index++) {
                  if (wordsChars[index] == currentChar) {
                     censor[index] = currentChar;  
                     right = true;
                     times++;
                  }
               }
               if (right) {
                  System.out.println("The letter " + currentChar + " is in the word! There are " + times + " " + currentChar + " 's in the word. Revealing the letter(s): ");
               } else {
                  System.out.println("Not it. The word:  ");
               }
               System.out.println();
            }
            attempts++;
         }
         running = true;
         System.out.println("You guessed the entire word " + words.toUpperCase() + "! It took you " + attempts + " attempts!");
      }
      
   }
}
        
