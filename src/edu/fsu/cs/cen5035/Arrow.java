package edu.fsu.cs.cen5035;

/**
 *
 * @author Jarvis
 */
public class Arrow extends BasicWeapon implements Weapon {

	public Arrow()
	{super(70);
	}
	
	@Override
	public int hit()
	{
		return DAMAGE;
	}
	
	@Override
	public int hit(int armor)
	{
		int damage = DAMAGE - (armor-5);
		if (damage<0)
			return 0;
		return damage;
	}
}
