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
     */
}
