package com.pisti.model;

import java.util.ArrayList;
import java.util.List;

import com.pisti.domain.Card;

public class Hand {

	private List<Card> cards;

	public Hand() {
		this.cards = new ArrayList<Card>(4);
	}

	public List<Card> getCards() {
		return cards;
	}

	public void displayHand() {
		cards.forEach(card -> {
			System.out.println(card);
		});
	}
}
