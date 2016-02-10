package com.pisti.model;

public class Player {
	private int id;
	private String name;
	private int age;
	private Hand hand;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.hand = new Hand();
	}

	public void displayHand() {
		System.out.println("Player" + id + "'s hand: ");
		this.hand.displayHand();
	}

	public Hand getHand() {
		return hand;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", hand=" + hand + "]";
	}

}
