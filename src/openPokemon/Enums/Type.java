package openPokemon.Enums;

//@TODO Finish me
//Should be finished might be missing one.
//Make weak and strong immutable
//Can this be done better? Reading from a file maybe?
public enum Type {
    NORMAL,
    GRASS,
    ELECTRIC,
    WATER,
    FIRE,
    BUG,
    GHOST,
    PSYCHIC,
    STEEL,
    DARK,
    FLYING,
    ICE,
    POISON,
    GROUND,
    ROCK,
    DRAGON,
    FIGHTING,
    FAIRY,
    NONE;
    
    public Type[] weak,strong, noEffect; //TODO fill noEffect
    
    static{
    	//Normal
    	NORMAL.weak = new Type[]{};
    	NORMAL.strong = new Type[]{};
    	//Grass
    	GRASS.weak = new Type[]{};
    	GRASS.strong = new Type[]{};
    	//Electric
    	ELECTRIC.weak = new Type[]{};
    	ELECTRIC.strong = new Type[]{};
    	//Water
    	WATER.weak = new Type[]{};
    	WATER.strong = new Type[]{};
    	//Fire
    	FIRE.weak = new Type[]{};
    	FIRE.strong = new Type[]{};
    	//Bug
    	BUG.weak = new Type[]{};
    	BUG.strong = new Type[]{};
    	//Ghost
    	GHOST.weak = new Type[]{};
    	GHOST.strong = new Type[]{};
    	//Psychic
    	PSYCHIC.weak = new Type[]{};
    	PSYCHIC.strong = new Type[]{};
    	//Steel
    	STEEL.weak = new Type[]{};
    	STEEL.strong = new Type[]{};
    	//Dark
    	DARK.weak = new Type[]{};
    	DARK.strong = new Type[]{};
    	//Flying
    	FLYING.weak = new Type[]{};
    	FLYING.strong = new Type[]{};
    	//Ice
    	ICE.weak = new Type[]{};
    	ICE.strong = new Type[]{};
    	//Poison
    	POISON.weak = new Type[]{};
    	POISON.strong = new Type[]{};
    	//Ground
    	GROUND.weak = new Type[]{};
    	GROUND.strong = new Type[]{};
    	//Rock
    	ROCK.weak = new Type[]{};
    	ROCK.strong = new Type[]{};
    	//Dragon
    	DRAGON.weak = new Type[]{};
    	DRAGON.strong = new Type[]{};
    	//Fighting
    	FIGHTING.weak = new Type[]{};
    	FIGHTING.strong = new Type[]{};
    	//Fairy
    	FAIRY.weak = new Type[]{};
    	FAIRY.strong = new Type[]{};
    	//None to avoid null reference errors
    	NONE.weak = new Type[]{};
    	NONE.strong = new Type[]{};
    }
}
