// import necessary packages
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // list of possible words - fruits by alphabet
    String[] random_word_list = { "apple", "banana", "cherry", "dates", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine", "orange", "pineapple", "raisin", "strawberry", "tomato", "watermelon"};

    // generate random index
    int random_index = (int) (Math.random() * random_word_list.length);

    // get secret word at random index in list of possible words
    String secret_word = random_word_list[random_index];
    
    // hide secret word 
    String hidden = "";
    for (int i = 0; i < secret_word.length(); i++) {
      hidden += "_";
    }

    // set number of guesses
    int guesses_remaining = secret_word.length() + 2;

    // set letters guessed - empty string that will be added to
    String guessed = "";

    // establish scanner
    Scanner input = new Scanner(System.in);

    boolean wordIsGuessed = false;

    System.out.println("Welcome to hangman. \nYour goal is to guess the secret word, one letter at a time. \nThe number of guesses is 2 more than the length of the word. \nIf you guess the same letter twice, you will still loose a guess. \n Hint: the secret word is a type of fruit!");
    System.out.println();
  
    // enter game loop
    while (guesses_remaining > 0) {

      // print beginning remarks
      // remaining guesses
      System.out.println("You have " + guesses_remaining + " guesses remaining.");
      // hidden word
      System.out.println(hidden);
      // letters guessed
      if (guessed.length() == 0) {
        System.out.println("You have not guessed any letters.");
      }
      else {
        System.out.println("You have guessed these letters: " + guessed);
      }

      // take user input
      System.out.println("Enter one lowercase letter: ");
      String letter = input.nextLine();

      // if the letter has already been guessed, tell the user
      // user will still be penalized one guess
      if (guessed.indexOf(letter) != -1) {
        System.out.println("This letter has already been guessed.");
      }

      // if the letter is in the secret word
      else if (secret_word.indexOf(letter) != -1) {
        // then add it to the letters guessed
        guessed += letter;

        // loop through each index in the hidden/secret word
        for (int i = 0; i < hidden.length(); i++) {

          // if the letter matches secret word index
          if (secret_word.substring(i, i+1).equals(letter)) {

            // then replace it in the hidden word
            hidden = hidden.substring(0, i) + letter + hidden.substring(i + 1);
          }
        }
      }

        // if the letter is not in the secret word
      else {

        // still add it to letters guessed and print regrets
        guessed += letter;
        System.out.println("That letter is not in the secret word. Please try again.");
      }

      // check to see if the user has won and break out of the game loop
      // calculate the number of guesses it took
      if (hidden.indexOf("_") == -1) {
        int num_of_guesses = secret_word.length() + 2 - guesses_remaining;
        System.out.println(secret_word);
        System.out.println("Congrats! You found the word " + secret_word + " in "  + num_of_guesses + " guesses.");
        wordIsGuessed = true;
        break;
      }
        
      // add a new line and remove one remaining guess each time the loop runs
      System.out.println();
      guesses_remaining--;
    }

    // if the user did not win, display the secret word that they failed to guess
    if (wordIsGuessed == false) {
      System.out.println("The secret word was " + secret_word + ".");
    }
  }
}
