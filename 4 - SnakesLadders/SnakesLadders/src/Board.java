import java.util.HashMap;

/*
 * Represents the board of the game.
 * 
 * The board class contains a HashMap of snakes and tails, where each snake is represented by a key-value pair,
 * where the key is the snake's head position and the value is the snake's tail position.
 * 
 * The board class contains a HashMap of ladders and tops, where each ladder is represented by a key-value pair,
 * where the key is the ladder's bottom position and the value is the ladder's top position.
 * 
 * The board class contains a method, movePlayer(), to move the player to a new position after rolling the dice.
 * Method evaluates if the new position is the head of a snake or the bottom of a ladder, and moves the player accordingly.
 * 
 * 
 */
public class Board {

    /**
     * Represents a collection of snakes and tails on the board.
     * Each snake is represented by a key-value pair, where the key is the snake's
     * head position and the value is the snake's tail position.
     */
    private static final HashMap<Integer, Integer> SNAKES = new HashMap<Integer, Integer>() {
        {
            put(16, 6);
            put(47, 25);
            put(49, 11);
            put(62, 19);
            put(64, 60);
            put(74, 53);
            put(89, 68);
            put(92, 88);
            put(95, 75);
            put(99, 80);
        }
    };

    /**
     * Represents a collection of ladder bottoms and tops on the board.
     * Each ladder is represented by a key-value pair, where the key is the bottom
     * position and the value is the top position.
     */
    private static final HashMap<Integer, Integer> LADDERS = new HashMap<Integer, Integer>() {
        {
            put(2, 38);
            put(7, 14);
            put(8, 31);
            put(15, 26);
            put(21, 42);
            put(28, 84);
            put(36, 44);
            put(51, 67);
            put(71, 91);
            put(78, 98);
            put(87, 94);
        }
    };

    /**
     * Returns the new position of the player after moving by the given number of
     * moves.
     * If the new position is the head of a snake or the bottom of a ladder, the
     * player will be moved to the tail of the snake or the top of the ladder.
     * If the new position is greater than 100, the player will move backwards from
     * the end of the board by the difference.eg 98 + 4 = 102, so the player will
     * move to 100 - (102 - 100) = 98.
     * 
     * @param position the current position of the player
     * @param moves    the number of moves to make
     * @result set the new position of the player after moving by the given number of moves
     */
    public static void movePlayer(Player player) {
        // Calculate the new position of the player
        int newPosition = player.getPosition() + player.getCurrentRoll();
        // Check if the new position is greater than 100
        if (newPosition > 100) {
            System.out.println("You rolled too high!");
            newPosition = 100 - (newPosition - 100); // Bring the player back from the end of the board
        }

        // Check if the new position is the head of a snake or the bottom of a ladder
        if (SNAKES.containsKey(newPosition)) {
            System.out.println("You landed on a snake! You move from " + newPosition + " back to "
                    + SNAKES.get(newPosition) + ".");
            newPosition = SNAKES.get(newPosition);
        } else if (LADDERS.containsKey(newPosition)) {
            System.out.println("You landed on a ladder! You move from " + newPosition + " up to "
                    + LADDERS.get(newPosition) + ".");
            newPosition = LADDERS.get(newPosition);
        } else {
            System.out.println("You move from " + player.getPosition() + " to " + newPosition + ".");
        }

        // Set the new position of the player
        player.setPosition(newPosition);

    }

}
