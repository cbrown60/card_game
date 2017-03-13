package game;
import java.util.*;
public class Player{

private String name;
private ArrayList<Card> hand; 

public Player(String name){
  this.name = name;
  this.hand = new ArrayList<Card>();
}

public String getName(){
  return this.name;
}

public void addCardToHand(Card card){
  hand.add(card);
}

public int countCardsInHand(){  
  return hand.size();
}

public String playersName(){
  return name;
}

// public String viewCards(){
//   return hand.card(0);
// }

public int totalHandValue(){
  Card firstCard = hand.get(0);
  int firstCardValue= firstCard.getTotal();
  Card secondCard = hand.get(1);
  int secondCardValue = secondCard.getTotal();
  int handValue = (firstCardValue + secondCardValue);
  return handValue;
}

}