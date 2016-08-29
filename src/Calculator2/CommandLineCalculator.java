// MOST ROBUST IMPLEMENTATION IN THIS CHAPTER
package calculator2;
import java.io.*;
import java.util.*;

/**
 * Performs addition from the command line on multiple accounts.
 *
 * Known issue: See known issues for indivudual methods 
 */

class CommandLineCalculator 
{
	private int accumulatedValue = 0;   // affected by arithmetic operation(s) on this
	
	// The accounts active in this session: Each object will be a 'CommandLineCalculator' instance
	private static Vector calculators = new Vector();   
	
/*************************************************************************
 */
public CommandLineCalculator()
/*************************************************************************/
{	super();
}  

/*************************************************************************
 * Intent: Performs addition of amounts enterd by the user to 'this' 
 * 
 * Precondition: 'CommandLineCalculator.calculators' != null
 *
 * Postconditions:
 * (1) The user has been prompted to add a sequence of integers or "stop" to quit this function
 * (2) The console displays each integer added as requested and the accumulating total
 * (3) The application has ended after the user has entered "stop"
 * (4) 'accumulatedValue' contains the total of all integers entered since the application began
 * (5) The console displays "Please enter an integer only." whenever the user has
 *     entered a non-integer, and allowed re-entry.
 *
 * Known issue: No provision for overflow
 */
protected void executeAdditions()
/*************************************************************************/
{
	// Get amount to add
	System.out.println
	 ( "\tPlease enter the amount you want added, or type 'stop' to stop adding for now: " );
	String userRequest = getAnInputFromUser();
	
	// Add the amount if valid until "stop" entered
	int amountAdded = 0;
	while( !userRequest.equals( "stop" ) )
	{	
		try   // -- to add the amount entered
		{
			amountAdded = ( new Integer( userRequest ) ).intValue();   // exception if not an integer
		    this.accumulatedValue += amountAdded;
		    System.out.println
		     ( "\tAdded " + amountAdded + ", getting total of " + this.accumulatedValue );
		}
		catch( Exception e )   // non-integer entered
		{	System.out.println( "\tSorry -- incorrect entry: Try again." );
		}
		
		System.out.println
	 	 ( "\tPlease enter the amount you want added, or type 'stop' to stop adding for now: " );
		userRequest = getAnInputFromUser();
	}
			 
	System.out.println( "\tAddition ends." );
	
}   // end executeAdditions()

/*************************************************************************
 * Postcondition: the user has been prompted at the console for a string
 *
 * Return: String input by user if the user provides one, otherwise one blank
 */
private static String getAnInputFromUser() 
/*************************************************************************/
{	
	try
	{	BufferedReader b = new BufferedReader( new InputStreamReader( System.in ) );
		return ( b.readLine() );
	}
	catch( IOException e )
	{	System.out.println( e + " Input taken to be a single blank." );
		return " "; 
	}
		
}   // end getAnInputFromUser()

/*************************************************************************
 * Intent: Get account from user and allow additions to and subtractions from it.
 * 
 * Precondition: 'CommandLineCalculator.calculators' != null
 * 
 * Postconditions:
 * (1) Application has prompted user repeatedly for an account in 'calculators' until 
 * an existing account number is entered, and reported the balance on the account
 * (2) Application has ignored all inputs that make no sense and output explanation
 * (3) For each account chosen, the postconditions of 'executeAdditions()' apply
 * (4) User has entered "Quit application" and this method has terminated
 *
 * Known issue: The name of this method should be more precise.
 */
public static void interactWithUser() 
/*************************************************************************/
{
	System.out.println
	 ( "\n---------- Please enter account number between 1 and "  + calculators.size() + 
		 " or type 'Quit application': -----------" );
	String userRequest = getAnInputFromUser();
	
	int accountNum = 0;   // account currently requested
	while( !userRequest.equals( "Quit application" ) )   // return if "Quit ...."
	{
		try
		{ 	// This should be an integer -- if not, handle exception below
			accountNum = ( new Integer( userRequest ) ).intValue() - 1; 	 
			   
			if( accountNum >= 0 && accountNum < calculators.size() )   // account number within range
		    {		    	
				CommandLineCalculator cLC =   // get the account
				 (CommandLineCalculator)( CommandLineCalculator.calculators.get( accountNum ) );
				// Report on balance
				System.out.println
				 ( "\tThe balance in this account is " + cLC.accumulatedValue + "\n");
				cLC.executeAdditions();   // make the additions
		    }
		    else   // account number out of range
			    System.out.println( "Please enter a legal account number." );
		}
		catch( Exception e )
		{ 	System.out.println( "Please enter an integer for an account number: Try again." );
		}
		
		// Repeat solicitation for account number
		System.out.println
	 	 ( "\n---------- Please enter account number between 1 and "  + calculators.size() + 
		 " or type 'Quit application': -----------" );
		userRequest = getAnInputFromUser();
	}
	
}   // end interactWithUser() 	

/*************************************************************************
 *  
 * Postconditions: As specified in the requirements document for "Command Line Calculator"
 */
public static void main( String[] args )
/*************************************************************************/
{ 
	solicitNumberAccounts();
	interactWithUser();
	System.out.println( "\n\t\t================ Application ends. ================" );
	
}   // end main()

/*************************************************************************
 * Precondition: 'CommandLineCalculator.calculators' not null, and has no elements.
 *
 * Postconditions:
 *	(1) The application has prompted the user for the number of required accounts until the user has 
 * complied properly.
 *	(2) 'CommandLineCalculator.calculators' contains one 'CommandLineCalculator' object
 *      for each desired account, each initialized to zero.
 * 
 * Known issue: No check on numer of accounts less than 0 or greater than overflow
 */
private static void solicitNumberAccounts() 
/*************************************************************************/
{	
	int numAccounts = 0;
	
	// Get the number of accounts
	System.out.println
	 ( "\n================== How many accounts do you want to open: ==================" );
	try
	{	
		numAccounts = ( new Integer( getAnInputFromUser() ) ).intValue();   // repeat if not integer	
		
		if( numAccounts > 0 )   // legitimate number of accounts
		{
			System.out.println( "The application will deal with " + numAccounts + " accounts.\n" );

			// Establish the accounts
			for( int accountIndex = 0; accountIndex < numAccounts; ++accountIndex )
			{	CommandLineCalculator.calculators.addElement( new CommandLineCalculator() );
			}
		}
		else   // not legitimate number of accounts
		{
			System.out.println( "Please type a positive integer" );
			CommandLineCalculator.solicitNumberAccounts();   // try again
		}
	}
	catch( NumberFormatException e )
	{	
		System.out.println( "Sorry, not an integer: Try again." );
		solicitNumberAccounts();   // repeat solicitation
	}
	
}   // end solicitNumberAccounts()

}