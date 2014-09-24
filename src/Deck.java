import java.util.Random;
public class Deck {
    private final String faces[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    private final String suits[]={"Hearts","Diamonds","Clubs","Spades"};
    private Card deck[];
    private final int CARDS=52;
    private Random x;    
    
    public Deck(){        
        deck = new Card[CARDS];
        x = new Random();
        for(int i=0;i<deck.length;i++){
            deck[i] = new Card(faces[i%13],suits[i/13]);
        }
    }
    
    
    public void shuffleDeck(){
        for(int i=0;i<deck.length;i++){
            int j = x.nextInt(CARDS);
            Card c = deck[i];
            deck[i] = deck[j];
            deck[j] = c;
        }
    }        
    public Card getCard(int index){
        return deck[index];
    }
}
