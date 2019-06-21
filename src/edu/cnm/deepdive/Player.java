package edu.cnm.deepdive;

public abstract class Player<T extends Hand> {

  public abstract boolean canAccept();

  private T hand;

  public void accept(Card card) {
    hand.add(card);
  }

  public T getHand() {
    return hand;
  }

  public void reset() {
    hand.reset();
  }
}
