import java.util.Scanner;

public class Player {
    private int position = 1; // start at the first block
    private int currentRoll;
    public Boolean doubleRoll = false;

    public Player() {
        this.position = 0;
    }

    public int getPosition() {
        return this.position;
    }

    public int getCurrentRoll() {
        return this.currentRoll;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void resetPosition() {
        this.position = 0;
    }

    // /**
    //  * Move the player by the given number of moves. If the new position would be
    //  * off the board (> 100), push the player back by the number of moves that
    //  * would have taken them off the board.
    //  * @param moves the number of moves to make
    //  */
    // public void move(int moves) {
    //     if (this.position + moves <= 100) {
    //         this.position += moves;
    //     } else {
    //         this.position = 100 - (this.position + moves - 100);
    //     }
    // }

    /**
     * Simulates the rolling of a six-sided die.
     * @return An integer between 1 and 6, inclusive.
     */
    public void rollDice() {
        System.out.println("Please press enter to roll the dice.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        int rollTwo = (int) (Math.random() * 6) + 1; 
        int rollOne = (int) (Math.random() * 6) + 1;
        
        // System.out.println("You rolled " + rollOne + " and " + rollTwo + ".");

        if (rollOne == rollTwo) {
            this.doubleRoll = true;
            System.out.println("You rolled " + rollOne + " and " + rollTwo + ". You rolled a double!");
        } else {
            this.doubleRoll = false;
            System.out.println("You rolled " + rollOne + " and " + rollTwo + ".");
        }

        this.currentRoll = rollOne + rollTwo;

    }
    
}
