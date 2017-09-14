/*
  
  
   	@author Nick Charles Martin
 			CIS 2151 Prof. John Baugh
 			Summer 2016
 			Programming Assignment 2	
 
 */

import javax.swing.JOptionPane;

public class TestShips 
{

	public static void main(String[] args) 
	{
		Warship warTest = new Warship();
		
		JOptionPane.showMessageDialog(null, "The current default values for this ship are: "
				+ "\nCaptain: " + warTest.getCaptain() + "\nShield Percent: " 
					+ warTest.getShieldPercent() + "\nPhaser Banks: " +	warTest.getPhaserBanks() + 
						"\nPhoton Torpedos: " + warTest.getPhotoTorpedos());
		
		String input = JOptionPane.showInputDialog("Please enter the number of Crew members: ");
		int keyboard = Integer.parseInt(input);
		warTest.setCrewMembers(keyboard);
		warTest.setCost(10000);
		
		String input2 = JOptionPane.showInputDialog("Please enter the Warship's name: ");
		warTest.setShipName(input2);
				
		String input3 = JOptionPane.showInputDialog("Please enter the Name of the "
														+ "ship's Captain: ");
		warTest.setCaptain(input3);
		warTest.setShieldPercent(89.50);
		warTest.setPhaserBanks(30);
		warTest.setPhotoTorpedos(40);
		
		JOptionPane.showMessageDialog(null, "The new values for this ship are: " + 
				"\nCaptain: " + warTest.getCaptain() + "\nShield Percent: " 
					+ warTest.getShieldPercent() + "\nPhaser Banks: " +	warTest.getPhaserBanks() + 
						"\nPhoton Torpedos: " + warTest.getPhotoTorpedos() + "\nCrew Members: " +
							warTest.getCrewMembers() + "\nCost: " + warTest.getCost() + "\nShip Name: "
								+ warTest.getShipName());
		
		JOptionPane.showMessageDialog(null, "Damage to shield is: " + warTest.Fire());
		
		//End of Warship class testing.
		
		GenericShip genericTest = new GenericShip();
		
		JOptionPane.showMessageDialog(null, "The current default values for this ship are: " +
				"\nCrew Members: " + genericTest.getCrewMembers() + "\nCost: " + 
					genericTest.getCost() + "\nShip Name: " + genericTest.getShipName());
		
		String input4 = JOptionPane.showInputDialog("Please enter the number of Crew members: ");
		int keyboard1 = Integer.parseInt(input4);
		genericTest.setCrewMembers(keyboard1);
		genericTest.setCost(3500);
		
		String input5 = JOptionPane.showInputDialog("Please enter the Generic ship's name: ");
		genericTest.setShipName(input5);
		
		JOptionPane.showMessageDialog(null, "The new values for this ship are: " +
				"\nCrew Members: " + genericTest.getCrewMembers() + "\nCost: " + 
					genericTest.getCost() + "\nShip Name: " + genericTest.getShipName());
		
		//End of GenericShip class testing.
		
		//Beginning less interaction for the remaining tests!
		
		ScienceVessel vessel = new ScienceVessel();
		
		JOptionPane.showMessageDialog(null, "The current default values for this ship are: " +
				"\nProbes: " + vessel.getProbes() + "\nScientists: " + vessel.getScientists() +
					"\nChief Researcher: " + vessel.getChiefResearcher());
		
		vessel.setChiefResearcher("Clown");
		vessel.setProbes(2);
		vessel.setScientists(62);
		vessel.setShipName("Vessel");
		vessel.setCrewMembers(34);
		vessel.setCost(1500);
		
		
		JOptionPane.showMessageDialog(null, "The new values for this ship are: " +
				"\nProbes: " + vessel.getProbes() + "\nScientists: " + vessel.getScientists() +
					"\nChief Researcher: " + vessel.getChiefResearcher() + "\nCrew Members: " + 
						vessel.getCrewMembers() + "\nCost: " +	vessel.getCost() + 
							"\nShip Name: " + vessel.getShipName());
		
		vessel.lunchProbe();
		vessel.lunchProbe();
		vessel.lunchProbe();
				
		//End of ScienceVessel class testing.
		
		Transport tranny = new Transport();
		
		JOptionPane.showMessageDialog(null, "The current default values for this ship are: " +
				"\nTransport Materials Capacity: " + tranny.getCapacity());
		
		tranny.setCapacity(75);
		tranny.setCost(500);
		tranny.setCrewMembers(3);
		tranny.setShipName("Tranny");
		
		JOptionPane.showMessageDialog(null, "The new values for this ship are: " + 
		"\nCrew Members: " + tranny.getCrewMembers() + "\nCost: " +	tranny.getCost() + 
				"\nShip Name: " + tranny.getShipName() + "\nTransport Materials Capacity: " +
					tranny.getCapacity());
				
		tranny.help(1);
		
		//End of Transport class testing.
		
	}

}
