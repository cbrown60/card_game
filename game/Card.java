package game;

public class Card {

  private Suit suit;
  private Value value;
  private int total;

  public Card(Suit suit, Value value, int total) {
    this.suit = suit;
    this.value = value;
    this.total = total;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Value getValue(){
    return this.value;
  }

  public int getTotal(){
    return this.total;
  }


}