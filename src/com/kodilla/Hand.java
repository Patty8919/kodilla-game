package com.kodilla;

import java.util.*;

public class Hand {
    private int total;
    private int soft;
    private java.util.List hand = new ArrayList();

    public void addCard(Card card) {
        total += card.getValue();
        if(card.getRankValue() == Rank.AS) {
            soft += 1;
        }
        if (soft > 0) {
            if(total > 21){
                total -= 10;
                soft -= 1;
            }
        }
        hand.add(card);

    }
    public Card getCard (int index) {
        return (Card) hand.get(index);
    }

    public int evaluateHand() {
        return total;
    }

    public int getSoft() {
        return total;
    }

    public void discardHand() {
        hand.clear();
        total = 0;
        soft = 0;

    }
    public int getNumberOfCards() {
        return hand.size();
    }

    public void sort() {
        Collections.sort(hand);
    }

    public boolean isEmpty() {
        return hand.isEmpty();
    }

    public int findCard(Card card) {
        return hand.indexOf(card);
    }

    @Override
    public String toString() {
        return hand.toString();
    }
}
