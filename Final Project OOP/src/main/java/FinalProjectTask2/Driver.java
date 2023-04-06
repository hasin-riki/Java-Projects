package FinalProjectTask2;

/**
 * Driver class that adds gadgets to Batman's utility belt
 * and displays the related information
 * 
 * @author Samreen, based on code from Taner Davis
 * @version 04/23/2020
 */
public class Driver {

	/**
	 * The main method which does not utilize args.
	 * Simply instantiates two Gadget objects, adds
	 * them to the utility belt, and then
	 * prints out information about the belt.
	 * 
	 * @param args String array taking command-line arguments
	 */
	public static void main(String[] args) 
	{		
		/*
		 * You don't have to change any of this particular code however you may 
		 * find it useful to play around with how the code works here.
		 */
	    //Create a batarang gadget to add to Batman's utility belt
	    Gadget batarang = new Gadget("Batarang", 47.24, 40.20); 
	    //Create a shark repellent item
	    Gadget sharkRepellent = new Gadget("Shark Repellent", 30.0, 15); 
		
		// Create a belt and add the gadgets to it
		UtilityBelt belt = new UtilityBelt();
		//Add the batarang
		belt.addGadget(batarang); 
		//Add the shark repellent
		belt.addGadget(sharkRepellent); 
		
		// Tell Batman what he has
		System.out.println(belt);
	}
}
