package com.pisti.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pisti.domain.Card;
import com.pisti.domain.Ranks;
import com.pisti.model.Dealer;
import com.pisti.model.Player;

public class Pisti {

	public static void main(String[] args) {
		Card first, second, last = null;
		Dealer dealer = new Dealer();
		Map<String, List<Card>> scoreTable = new HashMap<String, List<Card>>();

		// assume only 2 players
		List<Player> players = new ArrayList<Player>(
				Arrays.asList(new Player(1, "Player 1", 19), new Player(2, "Player 2", 20)));

		dealer.createDeck();
		while (dealer.dealCards(players) != null) {
			while (!players.get(0).getHand().getCards().isEmpty()) {
				printHand(players);
				first = players.get(0).playCard();
				if (last != null && first.equals(last)) {
					System.out.print("Pisti for Player 1");
					last = null;
				} else if (first.getRank().equals(Ranks.XI)) {
					System.out.println("Player 1 scores");
					last = null;
				}
				second = players.get(1).playCard();
				if (second.equals(first)) {
					System.out.print("Pisti for Player 2");
					last = null;
				} else if (second.getRank().equals(Ranks.XI)) {
					System.out.println("Player 2 scores");
					last = null;
				} else {
					last = second;
				}
			}
		}
		for (java.util.Map.Entry<String, List<Card>> entry : scoreTable.entrySet()) {
			System.out.println(entry.getKey());
			entry.getValue().forEach(card -> {
				System.out.println(card.toString());
			});
		}
	}

	public static void printHand(List<? extends Player> players) {
		System.out.println("########################");
		players.forEach(player -> {
			player.displayHand();
		});
	}
}
