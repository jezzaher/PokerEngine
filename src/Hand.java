public class Hand {
    public final static int Play_Card = 5;
    private Card cards[];
    
    public Hand() {
        cards = new Card[Play_Card];
    }
    //returns all the cards in hand
    public Card[] getCards() {
        return cards;
    }
    //get the cards at a particular position
    public Card getCardAtIndex(int index) {
        if (index >= 0 && index < Play_Card)
            return cards[index];
        else
            return null;
    }
    public void setCardAtIndex(Card c, int index) {
        if(index >= 0 && index < Play_Card)
            cards[index] = c;
    }
    
    public int countPair() {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getFace().equals(cards[j].getFace())){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isFlush() {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getSuit().equals(cards[j].getSuit())) {
                    count++;
                }
            }
        }
        if(count == 5)
            return true;
        else
            return false;
    }    
}
