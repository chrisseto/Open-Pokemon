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
    
    //The given type is defending
    //ie: normal.weak would have fighting
    public Type[] weak,strong, noEffect; //TODO fill noEffect
    
    static{
    	//Normal
    	NORMAL.weak = new Type[]{FIGHTING};
    	NORMAL.strong = new Type[]{};
    	NORMAL.noEffect = new Type[]{GHOST};
    	//Grass
    	GRASS.weak = new Type[]{FLYING, POISON, BUG, FIRE, ICE};
    	GRASS.strong = new Type[]{GROUND, WATER, GRASS, ELECTRIC};
    	GRASS.noEffect = new Type[]{};
    	//Electric
    	ELECTRIC.weak = new Type[]{GROUND};
    	ELECTRIC.strong = new Type[]{FLYING, STEEL, ELECTRIC};
    	ELECTRIC.noEffect = new Type[]{};
    	//Water
    	WATER.weak = new Type[]{GRASS, ELECTRIC};
    	WATER.strong = new Type[]{STEEL, FIRE, WATER, ICE};
    	WATER.noEffect = new Type[]{};
    	//Fire
    	FIRE.weak = new Type[]{GROUND, ROCK, WATER};
    	FIRE.strong = new Type[]{BUG, STEEL, FIRE, GRASS, ICE, FAIRY};
    	FIRE.noEffect = new Type[]{};
    	//Bug
    	BUG.weak = new Type[]{FLYING, ROCK, FIRE};
    	BUG.strong = new Type[]{FIGHTING, GROUND, GRASS};
    	BUG.noEffect = new Type[]{};
    	//Ghost
    	GHOST.weak = new Type[]{GHOST, DARK};
    	GHOST.strong = new Type[]{POISON, BUG};
    	GHOST.noEffect = new Type[]{NORMAL, FIGHTING};
    	//Psychic
    	PSYCHIC.weak = new Type[]{BUG, GHOST, DARK};
    	PSYCHIC.strong = new Type[]{FIGHTING, PSYCHIC};
    	PSYCHIC.noEffect = new Type[]{};
    	//Steel
    	STEEL.weak = new Type[]{FIGHTING, GROUND, FIRE};
    	STEEL.strong = new Type[]{NORMAL, FLYING, ROCK, BUG, STEEL, GRASS, PSYCHIC, ICE, DRAGON, FAIRY};
    	STEEL.noEffect = new Type[]{POISON};
    	//Dark
    	DARK.weak = new Type[]{FIGHTING, BUG, FAIRY};
    	DARK.strong = new Type[]{GHOST, DARK};
    	DARK.noEffect = new Type[]{PSYCHIC};
    	//Flying
    	FLYING.weak = new Type[]{ROCK, ELECTRIC, ICE};
    	FLYING.strong = new Type[]{FIGHTING, BUG, GRASS};
    	FLYING.noEffect = new Type[]{GROUND};
    	//Ice
    	ICE.weak = new Type[]{FIGHTING, ROCK, STEEL, FIRE};
    	ICE.strong = new Type[]{ICE};
    	ICE.noEffect = new Type[]{};
    	//Poison
    	POISON.weak = new Type[]{GROUND, PSYCHIC};
    	POISON.strong = new Type[]{FIGHTING, POISON, GRASS, FAIRY};
    	POISON.noEffect = new Type[]{};
    	//Ground
    	GROUND.weak = new Type[]{WATER, GRASS, ICE};
    	GROUND.strong = new Type[]{POISON, ROCK};
    	GROUND.noEffect = new Type[]{ELECTRIC};
    	//Rock
    	ROCK.weak = new Type[]{FIGHTING, GROUND, STEEL, WATER, GRASS};
    	ROCK.strong = new Type[]{NORMAL, FLYING, POISON, FIRE};
    	ROCK.noEffect = new Type[]{};
    	//Dragon
    	DRAGON.weak = new Type[]{ICE, DRAGON, FAIRY};
    	DRAGON.strong = new Type[]{FIRE, WATER, GRASS, ELECTRIC};
    	DRAGON.noEffect = new Type[]{};
    	//Fighting
    	FIGHTING.weak = new Type[]{FLYING, PSYCHIC, FAIRY};
    	FIGHTING.strong = new Type[]{ROCK, BUG, DARK};
    	FIGHTING.noEffect = new Type[]{};
    	//Fairy
    	FAIRY.weak = new Type[]{POISON, STEEL};
    	FAIRY.strong = new Type[]{FIGHTING, BUG, DARK};
    	FAIRY.noEffect = new Type[]{DRAGON};
    	//None to avoid null reference errors
    	NONE.weak = new Type[]{};
    	NONE.strong = new Type[]{};
    	NONE.noEffect = new Type[]{};
    }
}
