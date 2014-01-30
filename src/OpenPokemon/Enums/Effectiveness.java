package src.openPokemon.Enums;

public enum Effectiveness{
    SUPEREFFECTIVE (2),
    NORMAL (1),
    NOTVERYEFFECTIVE (.5f),
    NOEFFECT (0);

    public final float modifier;

    Effectiveness(float modifier) {
        this.modifier = modifier;
    }
}
