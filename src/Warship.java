/*
  
  
   	@author Nick Charles Martin
 			CIS 2151 Prof. John Baugh
 			Summer 2016
 			Programming Assignment 2	
 
*/


import java.util.*;

public class Warship extends GenericShip 
{
		
	private int photoTorpedos = 2;
	private int phaserBanks = 2;
	private double shieldPercent = 100;
	private String captain = "Snuggles";
		
	public int getPhotoTorpedos() 
	{
		return photoTorpedos;
	}
	public void setPhotoTorpedos(int photoTorpedos) 
	{
		this.photoTorpedos = photoTorpedos;
	}
	public int getPhaserBanks() 
	{
		return phaserBanks;
	}
	public void setPhaserBanks(int phaserBanks) 
	{
		this.phaserBanks = phaserBanks;
	}
	public double getShieldPercent() 
	{
		return shieldPercent;
	}
	public void setShieldPercent(double shieldPercent) 
	{
		this.shieldPercent = shieldPercent;
	}
	public String getCaptain() 
	{
		return captain;
	}
	public void setCaptain(String captain) 
	{
		this.captain = captain;
	}
	
	public int Fire()
	{
				
		Random randomDamage = new Random();
		int damage = randomDamage.nextInt(100) + 1;
		 
		return damage;
	 		
	}

}
