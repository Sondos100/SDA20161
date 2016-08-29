// NON-ROBUST IMPLEMENTATION: CRASHES AT MOST USER ERRORS
package calculator1;
import java.io.*;
import java.util.*;

/**
 * Performs addition from the command line on multiple accounts.
 */

class CommandLineCalculator 
{
	private int accumulatedValue = 0;   // affected by arithmetic operation(s) on this
	private static Vector calculators = new Vector();   // the accounts active in this session
	
/*****************************************************************************************************
 */
public CommandLineCalculator()
/*****************************************************************************************************/
{	super();
}

/*****************************************************************************************************
 * Postconditions:
 * (1) Application has obtained number of accounts from user  
 * (2) Application has prompted user to add integers to any of these accounts
 * (3) Application has output to console the balance after each transaction
 */
public static void main( String[] args )
/*****************************************************************************************************/
{ 
	solicitNumberAccounts();
	interactWithUser();
	System.out.println( "\n\t---- Application ends. ----" );
}

/*****************************************************************************************************
  * Preconditions: this.accumulatedValue == 0
  *
  * Postconditions:
  * (1) The user has been prompted to add a sequence of integers or "stop" to quit
  * (2) The user has responded with a sequence of integers or "stop" 
  * (3) The console has echoed each integer added and the accumulating total
  * (4) The application has ended after the user has entered "stop"
  * (5) 'accumulatedValue' contains the total of all integers entered since the application began
  * (6) The application has stated "Please enter an integer only." whenever the user has
  *     entered a non-integer, and allowed re-entry. 
  */
protected void executeAdditions()
/*****************************************************************************************************/
{
	// Get amount to add
	System.out.println
	 ( "\tPlease enter the amount you want added, or type 'stop' to stop adding for now: " );
	String userRequest = getAnInputFromUser();
	
	// Add the amount if valid until "stop" entered
	int amountAdded = 0;
	while( !userRequest.equals( "stop" ) )
	{	
		amountAdded = ( new Integer( userRequest ) ).intValue();  	 
	    this.accumulatedValue += amountAdded;
		System.out.println
		     ( "\tAdded " + amountAdded + ", getting total of " + this.accumulatedValue );	
		System.out.println
	 	 ( "\tPlease enter the amount you want added, or type 'stop' to stop adding for now: " );
		userRequest = getAnInputFromUser();
	}
			 
	System.out.println( "\tAddition ends." );
	
}   // end executeAdditions()



/*****************************************************************************************************
 * Precondition: 'CommandLineCalculator.calculators' not null.
 * Postconditions:
 * (1) The application has prompted the user for a number of accounts 
 * (2) The user has complied legitimately
 * (3) 'CommandLineCalculator.calculators' contains one 'CommandLineCalculator' object
 *     for each desired account, each initialized to zero.
 */
private static void solicitNumberAccounts() 
/*****************************************************************************************************/
{	
	int numAccounts = 0;
	
	// Get the number of accounts
	System.out.println( "\n=========== How many accounts do you want to open: ===========" );
	numAccounts = ( new Integer( getAnInputFromUser() ) ).intValue(); 		
	System.out.println   // echo
	 ( "The application will deal with " + numAccounts + " accounts.\n" );

	// Establish the accounts
	for( int accountIndex = 0; accountIndex < numAccounts; ++accountIndex )
		CommandLineCalculator.calculators.addElement( new CommandLineCalculator() );	

}   // end solicitNumberAccounts() 

/*****************************************************************************************************
 * Postconditions: the user has been prompted for a string
 * Return: String input by user if the user provides one, otherwise one blank
 */
private static String getAnInputFromUser() 
/*****************************************************************************************************/
{	
	try
	{	BufferedReader b = new BufferedReader( new InputStreamReader( System.in ) );
		return ( b.readLine() );
	}
	catch( IOException e )
	{	System.out.println( e + " Input taken to be a single blank." );
		return " "; 
	}		
}

/*****************************************************************************************************
 */
public static void interactWithUser() 
/*****************************************************************************************************/
{
	// Get the account
	String userRequest = " ";
	
	do   // as long as user does not signal desire to end the interaction
	{			
		// Get the next account requested by the user	
		System.out.println
		 ( "\n---------- Please enter account number (starting at 1) or 'Quit application': -----------" );
		userRequest = getAnInputFromUser();
		if( userRequest.equals( "Quit application" ) )
			break;
			
		// Get the account and perform operations on it
		int accountNum = ( new Integer( userRequest ) ).intValue() - 1; 
		CommandLineCalculator cLC = 
		 (CommandLineCalculator)( calculators.get( accountNum ) );	
		// Report on balance
		System.out.println( "\tThe balance in this account is " + cLC.accumulatedValue + "\n");
		cLC.executeAdditions();
	}
	while( !userRequest.equals( "Quit application" ) );
	
}   // end interactWithUser()

}