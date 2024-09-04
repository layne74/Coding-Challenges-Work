public class SnakesLadders {
    public static void main(String[] args) throws Exception {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Boolean gameStatus = true;
        
        System.out.println("Welcome to Snakes and Ladders!");
        System.out.println("Player 1 and Player 2 start at position 0.");
        System.out.println("The first player to reach position 100 wins!\n");

        while (gameStatus) {
            System.out.println("Player 1's turn.");
            do {
                playerOne.rollDice();
                Board.movePlayer(playerOne);

                if (playerOne.getPosition() == 100) {
                    System.out.println("Player 1 wins!");
                    gameStatus = false;
                    break;
                }
                // System.out.println("Player 1 is now at position " + playerOne.getPosition() + ".");
            } while (playerOne.doubleRoll);
            System.out.println("Player 1 completed their turn");

            printPositions(playerOne, playerTwo);

            if (!gameStatus) break;
            
            System.out.println("Player 2's turn.");
            do {
                playerTwo.rollDice();
                Board.movePlayer(playerTwo);
                // System.out.println("Player 2 is now at position " + playerTwo.getPosition() + ".");
            } while (playerTwo.doubleRoll);
            System.out.println("Player 2 completed their turn and is now at position " + playerTwo.getPosition() + ".");

            printPositions(playerOne, playerTwo);
        }

        System.out.println("Game over!");

        if (playerOne.getPosition() == 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    public static void printPositions(Player playerOne, Player playerTwo) {
        System.out.println("\n---------------------------------");
        System.out.println("Player 1 is at position " + playerOne.getPosition() + ".");
        System.out.println("Player 2 is at position " + playerTwo.getPosition() + ".");
        System.out.println("---------------------------------\n");
    }

    
}
