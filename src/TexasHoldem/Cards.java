package TexasHoldem;

public class Cards
{
    //Four, Five, King, etc
    private String cardName;

    //Clubs, Diamonds, Hearts, etc
    private String cardSuit;

    //jack = 11, queen = 12, ace = 1 || 11
    private int cardWeight;

    public void Cards(String name, String suit, int weight){
        setCardName(name);
        setCardSuit(suit);
        setCardWeight(weight);
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String name){
        cardName = name;
    }

    public String getCardSuit(){
        return cardSuit;
    }

    public void setCardSuit(String suit){
        cardSuit = suit;
    }

    public int getCardWeight(){
        return cardWeight;
    }

    public void setCardWeight(int weight){
        cardWeight = weight;
    }



    /*Make an ArrayList so that cards can be added
    and removed
     */
}
