package edu.cnm.deepdive.blackjack;

public class Dealer extends BlackjackPlayer{

  public static final int SEVENTEEN = 17;

  @Override
  public boolean canAccept() {
    var value = getHand().getValue();
    return super.canAccept() && value < SEVENTEEN || (value == SEVENTEEN && getHand().isSoft());

  }
}
