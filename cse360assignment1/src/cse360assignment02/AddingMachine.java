/**
 * The following program, AddingMachine, utilizes methods that adds, subtracts, gets the total,
 * prints Strings, and clears memory of integers.
 * 
 * @author Angel Rodriguez
 */

package cse360assignment02;

public class AddingMachine 
{
	private int total;
	private String intKeeper;
	  
	/**
	* Constructor of the class.
	* @param no parameters
	* @return no return type
	*/
	  public AddingMachine () {
	    total = 0;  // initialize to 0.
	    intKeeper = "0"; // initialize to "0".
	  }
	  
	/**
	* Gets total value
	* @param no parameters
	* @return returns an int that represents total
	*/
	  public int getTotal () {
	    return total; // returns total
	  }
	  
	/**
	* Calculates sum value
	* @param value (int)
	* @return no return type
	*/
	  public void add (int value) 
	  {
		  total += value; // adds value to total.
		  intKeeper += " + " + value; // appends operator "+" and value.
	  }
	  
	/**
	* Calculates difference value
	* @param value (int)
	* @return no return type
	*/
	  public void subtract (int value) 
	  {
		  total = total - value; // subtracts total from value.
		  intKeeper += " - " + value; // appends operator "-" and value.
	  }
	  
	/**
	* Prints transaction history in the form of a string.
	* @param no parameters
	* @return returns String
	*/
	  public String toString () 
	  {
	    return intKeeper; // returns string of history operations.
	  }
	  
	/**
	* Clears data
	* @param no parameters
	* @return no return type
	*/
	  public void clear() 
	  {
		  intKeeper = "0"; //set string to "0".
		  total = 0; // reset total to 0.
	  }
}
