package Cards;

/**
 * @author Andrew Scott
 * @Version Spring 2021
 * 
 * This represents the win hands in a ga,e of poker.
 */
enum WinHand {
    INVALID("ERROR!!!"),
    HIGHCARD("High card"),         //The best card in your hand (if no other wins detected)
    PAIR("Pair"),                  //A pair of cards of the same rank.
    TWOPAIR("Two pair"),           //Two pairs of cards of the same rankin the same hand
    THREEKIND("Three of a kind"),  //Any 3 cards the same
    STRAIGHT("Straight"),         //Cards of any suit running in sequence
    FLUSH("Flush"),	              //All cards of the same suite.
    FHOUSE("Full house"),         //Two of one kind three of another
    FOURKIND("Four of a kind"),   //Four cards of the same rank
    SFLUSH("Straigh Flush");      //Cards of the same suit running in sequence

	/**The name of the win hand**/
    private String name;

    /**Construct a Cards.WinHand enumeration element.
     * @param name The name of the win hand.
     */
    private WinHand(String name) {
        this.name = name; 
    }

    /**
     * Get the name of the win hand.
     * @return The name as words.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get a textual representation of this Cards.WinHand.
     * @return The Cards.WinHand name as a String.
     */
    public String toString() {
        return this.getName();
    }
}