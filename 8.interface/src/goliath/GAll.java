package goliath;

public interface GAll extends GtoA, GtoG {
	public void upgrade();
}

interface GtoA {
	public void attackAir();
}

interface GtoG {
	public void attackGround();
}

