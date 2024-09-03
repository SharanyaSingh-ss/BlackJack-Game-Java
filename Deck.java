package Blackjack;
import java.util.Random;

public class Deck {
    
    private Card[] myCards;
    private int numCards;

    public Deck(){
        this(1,false);
    }

    public Deck(int numDecks, boolean shuffle){

        numCards = numDecks*52;
        myCards = new Card[numCards];

        int c = 0;
        for(int d = 0; d < numDecks; d++){
            for (int s = 0; s < 4; s++){
                for(int n=1; n <= 13; n++){
                    this.myCards[c] = new Card(Suit.values()[s], n);
                    c++;
                }
            }
        }
        
        if(shuffle){
            this.shuffle();
        }
    }

    public void shuffle(){

        Random rng = new Random();
        Card temp;
        int j;
        for(int i = 0; i < numCards; i++){
            j = rng.nextInt(numCards);
            temp = myCards[i];
            myCards[i] = myCards[j];
            myCards[j] = temp;

        }

    }

    public Card dealNextCard(){

        Card top = myCards[0];
        for (int c = 1; c < numCards; c++){
            myCards[c-1] = myCards[c];
        }
        myCards[numCards-1] = null;
        numCards--;

        return top;
    }

    public void printDeck(int numToPrint){
        for(int c = 0; c < numToPrint; c++){
            System.out.printf("%3d/%d %s\n", c+1, numCards, myCards[c].toString());
        }
        System.out.printf("\t\t[%d other]", numCards-numToPrint);
    }

}
