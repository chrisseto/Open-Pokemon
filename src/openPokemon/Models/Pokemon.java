// [SublimeLinter javac-lint:all,-deprecation]
package src.openPokemon.Models;

import src.openPokemon.Enums.Type;

public abstract class Pokemon {
    private int currentHealth, health;
    private Type types[];
    private boolean isWild,hasBeenCaught;
    private int level;

    public String serialize()
    {
        //TODO Finish me
        return "";
    }

}
