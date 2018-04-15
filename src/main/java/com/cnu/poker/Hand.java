package com.cnu.poker;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private Deck deck;
    private List<Card> cardList = new ArrayList<Card>();

    public Hand(Deck deck) {
        this.deck = deck;
    }

    public void drawCard() {
        cardList.add(deck.drawCard());
    }

    public List<Card> getCardList() {
        return cardList;
    }
}
