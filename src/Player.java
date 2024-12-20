
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player{
	private List<Card> handCards = new ArrayList<>();
    private List<Card> choosenCards= new ArrayList<>();
    private boolean turnStatus = true;
    private boolean isAlive = true;
    
    //Interact with handCards
    public void removeHandCard(Card card){
        handCards.remove(card);
    }
    
    public void addHandCard(Card card) {
    		handCards.add(card);
    }
    
    public void removeHandCard(List<Card> cards) {
    	for(Card card: cards) {
    		handCards.remove(card);
    	}
    }
    
    public Card[] getHandCard(){
        Card[] returnCard = new Card[handCards.size()];
        for(int i = 0; i < returnCard.length; i++)
            returnCard[i] = handCards.get(i);
        Arrays.sort(returnCard);
        return returnCard;
    }
    
    //Interact with choosenCards
    
    public List<Card> getChoosenCards() {
    	return choosenCards;
    }
    
    public void addChoosenCard(Card card){
    	choosenCards.add(card);
    }
    
    public void clearChoosenCard(){
    	choosenCards.clear();
    }

    public boolean removeChoosenCard(Card card){
        return choosenCards.remove(card);
    }
    
    //Interact with turnStatus
    
    public void changeTurnStatus() {
    	turnStatus = !turnStatus;
    };
    
    public boolean getTurnStatus() {
    	return turnStatus;
    }
    
    //Determine human/bot
    public boolean getPlayerStatus() {
    	return isAlive;
    }
    
    public void updatePlayerStatus() {
    	isAlive = !isAlive;
    }
    
    public List<Card> automaticGetChoosenCards() {
//    	for(int i = 1; i <= 1; i++) {
//    		choosenCards.add(handCards.get(handCards.size() - i));
//    	}
    	return choosenCards;
    }	

}