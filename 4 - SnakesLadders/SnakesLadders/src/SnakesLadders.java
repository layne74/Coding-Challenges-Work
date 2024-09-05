public class SnakesLadders {
    public static void main(String[] args) throws Exception {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Boolean gameStatus = true;

        System.out.println("==================================================");
        System.out.println("|-------- Welcome to Snakes and Ladders! --------|\n");
        System.out.println("Player 1 and Player 2 start at position 0.");
        System.out.println("The first player to reach position 100 wins!");
        System.out.println("==================================================\n");

        // Main game loop
        while (gameStatus) {
            System.out.println("** Player 1's turn. **");
            do {
                playerOne.rollDice();
                Board.movePlayer(playerOne);

                // Check if playerOne has won the game
                // If so, break out of the loop in case of a double roll
                if (playerOne.getPosition() == 100) {
                    gameStatus = false;
                    break;
                }
            } while (playerOne.isDoubleRoll());
            System.out.println("Player 1 completes their turn.");

            // Check if either player has won the game
            if (printPositionsAndCheckGameStatus(playerOne, playerTwo))
                break;

            System.out.println("** Player 2's turn. **");
            do {
                playerTwo.rollDice();
                Board.movePlayer(playerTwo);

                // Check if playerTwo has won the game
                // If so, break out of the loop in case of a double roll
                if (playerTwo.getPosition() == 100) {
                    gameStatus = false;
                    break;
                }
            } while (playerTwo.isDoubleRoll());
            System.out.println("Player 2 completes their turn.");

            // Check if either player has won the game
            if (printPositionsAndCheckGameStatus(playerOne, playerTwo))
                break;
        }

    }

    /**
     * Prints the current positions of playerOne and playerTwo if no winner and returns false,
     * and if either player has won the game, returns true
     * 
     * @param playerOne The first player in the game.
     * @param playerTwo The second player in the game.
     * @return true if either player has won, false otherwise.
     */
    public static boolean printPositionsAndCheckGameStatus(Player playerOne, Player playerTwo) {

        // Check if either player has won the game
        if (playerOne.getPosition() == 100 || playerTwo.getPosition() == 100) {
            announceWinner(playerOne, playerTwo);
            return true;
        // Print the current positions of playerOne and playerTwo
        } else {
            System.out.println("\n---------------------------------");
            System.out.println("Player 1 is at position " + playerOne.getPosition() + ".");
            System.out.println("Player 2 is at position " + playerTwo.getPosition() + ".");
            System.out.println("---------------------------------\n");

            return false;
        }
    }

    /**
     * Prints a message declaring the winner of the game.
     * @param playerOne The first player in the game.
     * @param playerTwo The second player in the game.
     */
    public static void announceWinner(Player playerOne, Player playerTwo) {
        String winner = "GAME OVER! " +
                (playerOne.getPosition() == 100 ? "Player 1 wins!" : "Player 2 wins!");

        System.out.println("\n* * * * * * * * * * * * * * * * *");
        System.out.println("* * " + winner + " * *");
        System.out.println("* * * * * * * * * * * * * * * * *\n");
    }

}
