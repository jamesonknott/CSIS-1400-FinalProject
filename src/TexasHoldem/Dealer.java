package TexasHoldem;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer
{

    private static int pot = 0;
    private static ArrayList<Cards> tableCards = new ArrayList<>();
    private static ArrayList<Cards> dealersDeck;



    /*
    The Pot
    ------------------------------------------------------------------
     */

    //Returns the current value of the pot
    public static int getPot()
    {
        return pot;
    }

    //adds the integer value passed, to the current pot
    public static void addToPot(int chips)
    {
        pot += chips;
    }
    //------------------------------------------------------------------



    /*
    The Deck
    ------------------------------------------------------------------
     */

    //Informs all Dealer class methods whic deck ArrayList they should be using.
    public static void pickupDeck(ArrayList<Cards> deck){
        dealersDeck = deck;
    }

    //Shuffles the specified ArrayList of type Cards passed to the parameters list
    public static void shuffleDeck()
    {

        for (int i = 0; i < 7; i++) {

            Collections.shuffle(dealersDeck);
        }
    }
    //------------------------------------------------------------------



    /*
    The Table Cards
    ------------------------------------------------------------------
    */

    /*
    Puts the top three cards of the specified deck into the tableCards ArrayList.
    Prints the tableCards ArrayList.
     */
    public static void theFlop() {
        for (int i = 0; i < 3; i++) {

            tableCards.add(dealersDeck.remove(i));
        }

        announceTableCards();
    }

    /*
    Puts the top single card of the specified deck into the tableCards ArrayList.
    Prints the tableCards ArrayList.
     */
    public static void theTurn(){

        tableCards.add(dealersDeck.remove(0));
        announceTableCards();
    }
    public static void theRiver(){

        tableCards.add(dealersDeck.remove(0));
        announceTableCards();
    }


    //Prints whatever the current table cards are.
    public static void announceTableCards(){

        System.out.println();

        int i = 0;
        for(Cards cards : tableCards){
            System.out.print(tableCards.get(i));
            i++;
        }

    }
    //------------------------------------------------------------------

}