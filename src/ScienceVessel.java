/*
  
  
   	@author Nick Charles Martin
 			CIS 2151 Prof. John Baugh
 			Summer 2016
 			Programming Assignment 2	
 
*/


public class ScienceVessel extends GenericShip
{
	
	
	private int probes = 10;
	private int scientists = 25;
	private String chiefResearcher = "Cochrane";
	
	
	public int getProbes() 
	{
		return probes;
	}
	public void setProbes(int probes) 
	{
		this.probes = probes;
	}
	public int getScientists() 
	{
		return scientists;
	}
	public void setScientists(int scientists) 
	{
		this.scientists = scientists;
	}
	public String getChiefResearcher() 
	{
		return chiefResearcher;
	}
	public void setChiefResearcher(String chiefResearcher) 
	{
		this.chiefResearcher = chiefResearcher;
	}
	
	public void lunchProbe()
	{
		
		if(probes > 0)
			System.out.println("We're launching the probe, sir.");
			probes--;
		
			
		if(probes == 0)	
			System.out.println("Sorry sir there are no probes left");
			
	}
	
	
}
