package com.pisti.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.pisti.domain.Card;
import com.pisti.domain.Ranks;
import com.pisti.domain.Suits;

public class Deck {
	private List<Card> cards;

	public Deck() {
		this.cards = new LinkedList<Card>();
		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 13; b++) {
				cards.add(new Card(Suits.values()[a], Ranks.values()[b]));
			}
		}
		this.shuffle();
	}

	public Card drawFromDeck() {
		return cards.remove(0);
	}

	private void shuffle() {
		System.out.println("Shuffling the cards for you guys...");
		Collections.shuffle(cards);
	}

	public List<Card> getCards() {
		return this.cards;
	}
}
