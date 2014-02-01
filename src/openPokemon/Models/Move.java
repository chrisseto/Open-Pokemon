package openPokemon.Models;

import openPokemon.Enums.Type;

public abstract class Move {
	private final int maxPP;
	private final Type type;
	private final String name;
	private int currentPP;

	public Move(String name, int pp, Type type) {
		this.name = name;
		this.type = type;
		this.maxPP = pp;
	}

	public void resetPP() {
		currentPP = maxPP;
	}
}
