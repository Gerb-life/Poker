/**
 * @author Andrew Scott
 * @Version Spring 2021
 * Represents a face of a card from ACE (1) Duce(2) though to King(10).<br>
 * Each card has a value where ace is 1, duce is 2 and so on upto 10 and
 * all face cards which are all worth 10 points each.<br>
 * Each card also has a a rank, the rank represents the respective ordering
 * of these cards with respect to their power that is an ace is worth more 
 * than a king that is 3 pairs or aces or 3 pairs of kings, the aces will win.<br>
 * These ideas of rank and value fit in with the general use of cards in many 
 * games, but this will support the game of poker.
 */
enum Face {

    ACE     ("Ace",     1,13),
    DUECE   ("Duece",   2,1),
    THREE   ("Three",   3,2),
    FOUR    ("Four",    4,3),
    FIVE    ("Five",    5,4),
    SIX     ("Six",     6,5),
    SEVEN   ("Seven",   7,6),
    EIGHT   ("Eight",   8,7),
    NINE    ("Nine",    9,8),
    TEN     ("Ten",     10,9),
    JACK    ("Jack",    10,10),
    QUEEN   ("Queen",   10,11),
    KING    ("King",    10,12);

	/**The face name of the card**/
    private String  face;
    /**The value of this card**/
    private int     value;
    /**The rank of this card**/
    private int     rank;

    /**
     * Construct a card enumeration.
     * @param name The name of the card as displayed.
     * @param value The value of the card.
     * @param rank The rank of the card (aces are high)
     */
    private Face(String name, int value, int rank) {
        face        = name;
        this.value  = value;
        this.rank  = rank;
        switch(name) {
            case "King":
                rank++;
            case "Queen":
                rank++;
            case "Jack":
               rank++;
               break;
        }
    }

    /**
     * Return a string representation of this face.
     * @return The face name as words.
     */
    public String toString() {
        return face;
    }

    /**
     * The value of this card.
     * @return The card's value.
     */
    public int value() {
        return value;
    }
    
    /**
     * The rank of this card.
     * @return The card's rank.
     */
    public int getRank() {
        return rank;
    }
}