package com.pisti.domain;

public class Card {
	private Ranks rank;

	private Suits suit;

	public Card(Suits suit, Ranks rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Ranks getRank() {
		return rank;
	}

	public void setRank(Ranks rank) {
		this.rank = rank;
	}

	public Suits getSuit() {
		return suit;
	}

	public void setSuit(Suits suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Card [ " + this.suit + " " + this.rank + " ]";
	}

}
