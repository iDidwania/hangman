# Hangman Game

Welcome to the Hangman game! This project is a classic implementation of the Hangman game written in Java. Players can guess letters in an attempt to figure out a hidden word before running out of attempts.

## Features

- Random word selection from a predefined alphabetical list of fruits
- Interacts with user to simulate game
- Tracks and displays incorrect guesses
- Reveals the word if the player loses
- Simple and clean code structure

## How to Play

1. Run the game.
2. The game will randomly select a word.
3. You will be prompted to guess a letter.
4. If the letter is in the word, it will be revealed in its correct position(s).
5. If the letter is not in the word, it will count as a wrong guess.
6. If the letter has been previously guessed, user will be notified and it will be counted as a wrong guess.
7. You have a limited number of wrong guesses (secret word length + 2) allowed before the game is over.
8. Try to guess the word before you run out of attempts!

## Installation

To play the Hangman game, follow these steps:

1. Ensure you have Java installed on your machine. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Clone this repository:
    ```sh
    git clone https://github.com/ishana-d/hangman.git
    ```
3. Navigate to the project directory:
    ```sh
    cd hangman-game
    ```
4. Compile the Java code:
    ```sh
    javac Hangman.java
    ```
5. Run the game:
    ```sh
    java Hangman
    ```


