package Blackjack;

public class Player {
    
    private String name;
    private Card[] hand = new Card[10];
    private int numCards;

    public Player(String aName){
        name = aName;
        this.emptyHand();
    }

    public void emptyHand(){
        for(int c = 0; c < 10; c++){
            hand[c] = null;
        }
        numCards = 0;
    }

    public boolean addCard(Card aCard){
        if(numCards == 10){
            System.err.printf("%s's hand already has 10 cards. Cannot add another\n", name);
            System.exit(1);
        }

        hand[this.numCards] = aCard;
        numCards++;
        return(getHandSum() <= 21);
    }

    public int getHandSum(){

        int handSum = 0;
        int cardNum;
        int numAces = 0;

        for(int c = 0; c < numCards; c++){
            cardNum = hand[c].getNumber();
            if(cardNum == 1){
                numAces++;
                handSum += 11;
            }else if(cardNum > 10){
                handSum += 10;
            }else{
                handSum += cardNum;
            }

            while(handSum > 21 && numAces > 0){
                handSum -= 10;
                numAces--;
            }
        }

        return handSum;
    }

    public void printHand(boolean showFirstCard){
        System.out.printf("%s's cards:\n", name);
        for(int c = 0; c < numCards; c++){
            if (c == 0 && !showFirstCard){
                System.out.println("  [hidden]");
            }else{
            System.out.printf("  %s\n", hand[c].toString()); 
            } 
        }
    }
}
