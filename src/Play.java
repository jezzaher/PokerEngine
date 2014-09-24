public class Play {
    private Hand[] Hands;
    private Deck deck;
    
    public Play() {
        deck = new Deck();
        Hands = new Hand[4];
        Hands[0] = new Hand();
        Hands[1] = new Hand();
        Hands[2] = new Hand();
        Hands[3] = new Hand();
        deck.shuffleDeck();
    }
    
    public void dealCards() {
        int count = 0;
        for (int i = 0; i < Hands[0].getCards().length; i++) {
            for (int j = 0; j < Hands.length; j++) {
                Hands[j].setCardAtIndex(deck.getCard(count++), i);
            }
        }
    }
    public void showCards() {
        for (int i = 0; i < Hands.length; i++) {
            System.out.print("Hand " + (i + 1) + ": \n");
            for (int j = 0; j < Hands[0].getCards().length; j++) {
                System.out.print("{"+ Hands[i].getCardAtIndex(j).toString()+"}\n ");
            }

if(Hands[i].countPair()> 0)
                System.out.print("\nPAIR(S):" + Hands[i].countPair()+ "! ");
            if(Hands[i].isFlush())
                System.out.print("FLUSH!!\n");
            System.out.println("\n");
        }
    }
	
}
