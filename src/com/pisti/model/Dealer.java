package com.pisti.model;

import java.util.List;

public class Dealer {
	private Deck deck;

	public Dealer() {
		System.out.println("Welcome to Pisti! I am your dealer :)");
	}

	public Dealer createDeck() {
		System.out.println("Creating new deck...");
		this.deck = new Deck();
		return this;
	}

	public List<Player> dealCards(List<Player> players) {
		System.out.println("Dealing cards to players");
		int counter = 0;
		// deal cards to hands
		do {
			for (Player player : players) {
				player.getHand().getCards().add(deck.drawFromDeck());
			}
		} while (counter++ < 3);
		System.out.println("Good luck and have fun guys :)))");
		return players;
	}

	// Then we have to re-created deck to shuffle
	public void shuffle() {
		System.out.println("Let's start over!");
		this.createDeck();
	}
}
