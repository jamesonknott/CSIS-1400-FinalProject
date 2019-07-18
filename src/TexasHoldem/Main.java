package TexasHoldem;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){

        System.out.println("Test");
        //updating test code to figure out github system.

        Dealer.getPot();
        Dealer.setPot(50);


        /*
        Deck ArrayList initialization.
        A set of nested for each loops that use the index values of the
        Cards.Names and Cards.Suits enums to create all of our cards.
         */
        ArrayList<Cards> deck = new ArrayList<>();
        int i = 0;
        for(Cards.Suits suits : Cards.Suits.values()) {

            int j = 0;

            for (Cards.Names names : Cards.Names.values()) {

                deck.add(new Cards(Cards.Names.values()[j],
                        Cards.Suits.values()[i]));
                j++;
            }

            i++;
        }


        //Prints the entire deck.
        System.out.print(deck);

    }
}
