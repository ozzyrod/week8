/*
 * @project Week8
 * @author  Osbardo Rodriguez
 * Date:    4/3/18
 */
package Week8;

public class Main {

    public static void main(String[] args) {

    	Student me = new Student();
    	me.setId( 1234 );
    	me.setFirstName( "Ozzy ");
    	me.setGpa( 3.9 );
    	me.setAge( 25 );

    	Student example = new Student();
    	example.setFirstName( "John" );
    	example.setId( 1234 );

    	System.out.println( me.getFirstName() );

    	if ( me.isAdult() ) {
    		System.out.println( "me is an adult" );
	    } else {
    		System.out.println( "me is a minor" );
	    }
    }

    /*
     * Exercise 6 (exercise 3 out of the third slide deck),
     * Create a class that models a GroceryItem
	 * For our class GroceryItem model, we will say that each one has a name (String),
	 * selling price (double) and may have an expiration date (String)
	 * Create the class with the following functions:
	 * Set/get methods for each property
	 * 1 default and 2 other constructors of your choice – determine your own default values as you see fit
	 * 1 predicate method to see if the GroceryItem is expensive (defined as the selling price is greater than a given price)
	 * 1 predicate method to determine if the GroceryItem has an expiration date (not necessary, but fuck it, why not)
	 * Next, write a main program that creates at least 2 GroceryItem objects and tests all functions designed

     */
}
