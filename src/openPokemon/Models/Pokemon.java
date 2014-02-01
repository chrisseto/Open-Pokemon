package openPokemon.Models;

import java.util.Map;

import openPokemon.Enums.Nature;
import openPokemon.Enums.Type;

public abstract class Pokemon {
	//These should all be final values but also static....
	public static String Name, Classification;
	public static int PokedexNumber, StepsToHatch, CatchRate;
	public static Map<Integer, Move> MovesByLevelUp;
	public static Move[] LearnableMoves;

	private int currentHealth;
	private String nickName;
	private Type[] types;
	private boolean isWild, hasBeenCaught, fainted;
	private int level, health, speed, attack, specialAttack, defence,
			specialDefence;
	private Nature nature;
	private Move[] moves;

	public String serialize() {
		// TODO Finish me
		return "";
	}

}
