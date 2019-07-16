package TexasHoldem;

public class Dealer
{
    public static int deckCardCount = 52;
    private static int pot = 0;


    public static int getPot(){
        return pot;
        }

    public static void setPot(int chips){
        pot += chips;
    }




}
