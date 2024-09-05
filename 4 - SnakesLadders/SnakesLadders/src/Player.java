import java.util.Scanner;

public class Player {
    private int position = 1; // start at the first block
    private int currentRoll;
    private Boolean doubleRoll = false;

    /**
     * Creates a new player object with the default position of 0.
     */
    public Player() {
        this.position = 0;
    }

    /**
     * Gets the current position of the player on the board.
     * 
     * @return The current position of the player on the board.
     */
    public int getPosition() {
        return this.position;
    }

    /**
     * Gets the total from the last roll of the dice.
     * 
     * @return The total from the last roll of the dice.
     */
    public int getCurrentRoll() {
        return this.currentRoll;
    }

    /**
     * Checks if the last roll was a double.
     * 
     * @return true if the last roll was a double, false otherwise
     */
    public Boolean isDoubleRoll() {
        return this.doubleRoll;
    }

    /**
     * Sets the position of the player on the board.
     * 
     * @param position The new position of the player.
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Simulates the rolling of a six-sided die.
     * 
     * @return An integer between 1 and 6, inclusive.
     */
    public void rollDice() {
        System.out.println("Please press enter to roll the dice" +
                (this.doubleRoll ? " again" : "") + "...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        int rollTwo = (int) (Math.random() * 6) + 1;
        int rollOne = (int) (Math.random() * 6) + 1;

        if (rollOne == rollTwo) {
            this.doubleRoll = true;
            System.out.println("You rolled " + rollOne + " and " + rollTwo + ". You rolled a DOUBLE!");
        } else {
            this.doubleRoll = false;
            System.out.println("You rolled " + rollOne + " and " + rollTwo + ".");
        }

        this.currentRoll = rollOne + rollTwo;

    }

}
