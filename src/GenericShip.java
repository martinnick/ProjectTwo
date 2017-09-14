
/*
  
  
   	@author Nick Charles Martin
 			CIS 2151 Prof. John Baugh
 			Summer 2016
 			Programming Assignment 2	
 
*/

public class GenericShip 
{
	
	 private int crewMembers = 10; 
	 private int cost = 5000;
	 private String shipName = "S.S. Default";
	 
	public GenericShip()
	 {
		
	 }
	
	public GenericShip(int crewMembers, int cost, String shipName)
	{
		
		this.crewMembers = crewMembers;
		this.cost = cost;
		this.shipName = shipName;
		
	}
		
	public int getCrewMembers() 
	{
		return crewMembers;
	}

	public void setCrewMembers(int crewMembers) 
	{
		this.crewMembers = crewMembers;
	}

	public int getCost() 
	{
		return cost;
	}

	public void setCost(int cost) 
	{
		this.cost = cost;
	}

	public String getShipName() 
	{
		return shipName;
	}

	public void setShipName(String shipName) 
	{
		this.shipName = shipName;
	}
	 
	 
	 
	
}
