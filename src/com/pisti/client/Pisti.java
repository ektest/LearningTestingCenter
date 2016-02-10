package com.pisti.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.pisti.model.Dealer;
import com.pisti.model.Player;

public class Pisti {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();

		// assume only 2 players
		List<Player> players = new ArrayList<Player>(
				Arrays.asList(new Player(1, "Player 1", 19), new Player(2, "Player 2", 20)));
		dealer.createDeck().dealCards(players);
		players.forEach(player -> {
			player.displayHand();
		});
	}
}
