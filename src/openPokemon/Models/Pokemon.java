package openPokemon.Models;

import java.util.Map;

import openPokemon.Enums.Nature;
import openPokemon.Enums.Type;

public abstract class Pokemon {
	public static String Name, Classification, nickName; //unless name is the name that refers to the specific pokemon, in which case we could add a clasiifictaion for which species of pokemon
	public static int PokedexNumber,StepsToHatch;
	public static Map<Integer,Move> MovesByLevelUp;
	public static Move[] LearnableMoves;



    private int currentHealth;
    private Type[] types;
    private boolean isWild,hasBeenCaught;
    private int level,health,speed,attack,specialAttack,defence,specialDefence;
    private Nature nature;
    private Move[] moves;
    
    
    public String serialize()
    {
        //TODO Finish me
        return "";
    }

}
