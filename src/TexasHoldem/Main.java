/*
Names       :   Jameson Knott & Mortada Shogar
Assignment  :   A10b Team Assignment - Significant Progress
Class       :   CSIS 1400 - 401
Professor   :   Wright
Date        :   7/19/2019
 */

package TexasHoldem;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){


        /*
        Deck ArrayList initialization.
        --------------------------------------------------------------
        A set of nested for-each loops that use the index values of the
        Cards.Names and Cards.Suits enums to create all of our cards.
         */
        ArrayList<Cards> deck = new ArrayList<>();
        int i = 0;
        for (Cards.Suits suits : Cards.Suits.values()) {

            int j = 0;

            for (Cards.Names names : Cards.Names.values()) {

                deck.add(new Cards(Cards.Names.values()[j],
                        Cards.Suits.values()[i]));
                j++;
            }

            i++;
        }


        //Player class construction
        Player jameson = new Player("Jameson", 200);


        //Demonstration of Dealer class methods.
        Dealer.pickupDeck(deck);
        Dealer.shuffleDeck();
        Dealer.theFlop();
        Dealer.theTurn();
        Dealer.theRiver();
        Dealer.announceTableCards();

        System.out.println();
        System.out.println();

        //Prints the entire deck.
        System.out.print(deck);

        System.out.println();

    }
}
