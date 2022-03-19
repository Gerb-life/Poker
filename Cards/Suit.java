package Cards;

/**
 * @author Andrew Scott
 * @version Spring 2021
 * 
 * This enumeration represents a face of a card for which 
 * there are four: Spades, Hearts, Clubs and Diamonds.
 */
enum Suit {
    SPADES("Spades"),
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds");

	/**The name of this suit as words**/
    private String name;

    /**Constructs a suit with a name
     * @param name The name of the suit as text.
     */
    private Suit(String name) {
        this.name = name; 
    }

    /**
     * Get the name of the suit.
     * @return The name of the suit as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Return a textual representation of this suit.
     * @return A string containing the suit name,
     */
    public String toString() {
        return this.getName();
    }
}