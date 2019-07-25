package TexasHoldem;

public class Player
{
    private String name;
    private int chips;
    private int handSize = 0;

    public Player(String name, int chips){
        this.name = name;
        this.chips = chips;
    }


}
/*
package TexasHoldem;

import java.lang.reflect.Array;

public class Player
{


    private String name;

    private int chips;

    private int handSize = 0;



    public Player(String name, int chips){
        this.name = name;
        this.chips = chips;




    }

    public void raise(int chips){

        this.chips -= chips;
    }


    public void anteup(){

        this.handSize -= handSize;

    }


    public void fold(){

        this.handSize = 0;


    }

    public void call(){
        // Choice to match opponents bet

        for(int i = 0; i == this.handSize; i++){

        }

    }

    public void check(){
        // Pass betting to next oponnent

        for (int i = 0; i < handSize; i++)
        {

        }
    }



    public String getName() {
        return name;
    }

    public void readHand(){


        for ( handSize = 1; handSize < 5; handSize++){

            return;

    }

    }
}
*/
