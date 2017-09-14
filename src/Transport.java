/*
  
  
   	@author Nick Charles Martin
 			CIS 2151 Prof. John Baugh
 			Summer 2016
 			Programming Assignment 2	
 
*/

public class Transport extends GenericShip
{
	
	private int capacity = 100;

	
	public int getCapacity() 
	{
		return capacity;
	}

	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}
	
	public void help(int attacked)
	{
				
		if(attacked > 0)
			System.out.println("Help! We're under attack!");
		
	}
	
	
}
