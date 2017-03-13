package game;
import java.util.*;

public class Dealer{

  private String name;
  private ArrayList<Card>deck;
  private ArrayList<Card> hand;

  public Dealer(String name){
    this.name = name;
    this.deck = new ArrayList<Card>();
    this.hand = new ArrayList<Card>();
  }

public String getDealerName(){
  return name;
}

public void addCardToHand(Card card){
  hand.add(card);
}

public int totalHandValue(){
  Card firstCard = hand.get(0);
  int firstCardValue= firstCard.getTotal();
  Card secondCard = hand.get(1);
  int secondCardValue = secondCard.getTotal();
  int handValue = (firstCardValue + secondCardValue);
  return handValue;
}



}