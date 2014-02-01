package openPokemon.Models;

public abstract class Ball {
	public final float catchModifier;
	
	public Ball(float f) {
		this.catchModifier = f;
	}
	
	public abstract float getAdditionEffect(Pokemon target);
	public abstract void onCatch(Pokemon target);
}
