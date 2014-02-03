package openPokemon;

import java.util.Arrays;

import openPokemon.Enums.Effectiveness;
import openPokemon.Enums.Type;

//This file may be expanded into a folder later

public class Utils {
	public static Effectiveness getEffectiveness(Type attacker, Type defender) {
		if(Arrays.asList(defender.strong).contains(attacker))
			return Effectiveness.NOTVERYEFFECTIVE;
		else if(Arrays.asList(defender.weak).contains(attacker))
			return Effectiveness.SUPEREFFECTIVE;
		return Effectiveness.NORMAL;
		// TODO Finish me
	}

	public static Effectiveness getEffectiveness(Type attacker1, Type attacker2, Type defender1, Type defender2) {
		return null;
		// TODO Finish me
	}
}
