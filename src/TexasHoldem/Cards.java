package TexasHoldem;

public class Cards
{

    private final Names cardName;
    private final Suits cardSuit;

    private Cards(Names cardName, Suits cardSuit){
        this.cardName = cardName;
        this.cardSuit = cardSuit;

    }


    public enum Names
    {
        TWO(2, "2", "Two"),
        THREE(3, "3", "Three"),
        FOUR(4, "4", "Four"),
        FIVE(5, "5", "Five"),
        SIX(6, "6", "Six"),
        SEVEN(7, "7", "Seven"),
        EIGHT(8, "8", "Eight"),
        NINE(9, "9", "Nine"),
        TEN(10, "10", "Nine"),
        JACK(11, "J", "Jack"),
        QUEEN(12, "Q", "Queen"),
        KING(13, "K", "King"),
        ACE(14, "A", "Ace");

        private int cardWeight;
        private String cardSymbol;
        private String cardText;

        Names(int weight, String symbol, String text)
        {
            cardWeight = weight;
            cardSymbol = symbol;
            cardText = text;
        }
    }
    /*
    Enumeration list containing all card names (2 - Ace).

    Each Enum Constant Includes:
    --------------------------------------------------------------
    int weight      :   The value the card carries in the game.
    String symbol   :   The symbol of the card name (String because "10").
    String text     :   A text string of the card's name.
     */


    public enum Suits {HEARTS('\u2665', "Hearts"),
        DIAMONDS('\u2666', "Diamonds"),
        CLUBS('\u2663', "Clubs"),
        SPADES('\u2660', "Spades");

        private char suitSymbol;
        private String suitText;

        Suits(char symbol, String text) {
            suitSymbol = symbol;
            suitText = text;
        }
    }
    /*
    Enumeration list containing all card suits (Hearts, Diamonds, etc).

    Each Enum Constant Includes:
    ---------------------------------------------------------------
    char symbol :   A unicode character code for the suit symbol.
    String text :   A text string of the suit's name.
     */



    /*
    Override toString which prints each Card class object called as:

    | n s |

    Where n = cardSymbol
          s = suitSymbol
     */
    @Override
    public String toString()
    {
        return String.format("| %s %c |", cardName.cardSymbol, cardSuit.suitSymbol);
    }



    /*
    Various getters.  I'm not sure they're needed anymore with the Enum Lists
     */
//    public String getCardNameString(){
//        return cardName.cardText;
//    }
//
//    public String getCardSuitString(){
//        return cardSuit.suitText;
//    }
//
//    public String getCardNameSymbol(){
//        return cardName.cardSymbol;
//    }
//
//    public char getCardSuitSymbol(){
//        return cardSuit.suitSymbol;
//    }
//
//    public int getCardWeight(){
//        return cardName.cardWeight;
//    }


}


