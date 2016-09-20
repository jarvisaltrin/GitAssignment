package edu.fsu.cs.cen5035;

/**
 *
 * @author Jarvis
 */
public class MagicStaff extends BasicWeapon implements Weapon {

	public MagicStaff()
	{super(80);
	}
	
	@Override
	public int hit()
	{
		return DAMAGE;
	}
	
	@Override
	public int hit(int armor)
	{
		armor -= (int)(armor*0.2);
		int damage = DAMAGE - armor;
		if (damage<0)
			return 0;
		return damage;
	}
}
