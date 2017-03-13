package game;
import java.util.*;

public class Game{
Player player;
Dealer dealer;


public Game(Player player, Dealer dealer){
  this.player = player;
  this.dealer = dealer;
}




public String gameOn(){
  int playerHand = player.totalHandValue();
  int dealerHand = dealer.totalHandValue();
  if(playerHand > dealerHand){
    return "Player wins";
  }else{
    return "Dealer wins";
  }

}
  
}



// if((playerHand > dealerHand) &&(playerHand < 21)){
//   return "Player one wins";
// }else if((dealerHand < playerHand) && (dealerHand < 21)){
//   return "House wins";
// }


