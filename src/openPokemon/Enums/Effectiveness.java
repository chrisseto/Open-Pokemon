package openPokemon.Enums;

public enum Effectiveness{
    DOUBLESUPEREFFECTIVE (4), //Not sure what to call it, but if there is a double type weakness, for example, Gyarados (W/F)
    SUPEREFFECTIVE (2),       //Versus an electric type mov, the move does 4 times damage
    NORMAL (1),
    NOTVERYEFFECTIVE (.5f),
    NOEFFECT (0);

    public final float modifier;

    Effectiveness(float modifier) {
        this.modifier = modifier;
    }
}
