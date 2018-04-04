/*
 * @project Week8
 * @author  Osbardo Rodriguez
 * Date:    4/3/18
 */
package Week8;

public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private String id;
	private double gpa;

	public Student( String f, String l ) {
		firstName = f;
		lastName = l;
		age = 0;
		id = "TBD";
		gpa = 0.0;
	}

	public Student( String f, String l, int a, String i, double g ) {
		firstName = f;
		lastName = l;
		age = a;
		id = i;
		gpa = g;
	}

	public Student() {
		firstName = "";
		lastName = "";
		age = 0;
		id = "TBD";
		gpa = 0.0;
	}

	public void setFirstName( String f ) {
		firstName = f;
	}

	public void setLastName( String l ) {
		lastName = l;
	}

	public void setAge( int a ) {
		age = a;
	}

	/*
	 * If the old variable is changed, you can still make it work
	 * by overloading the method as in the very next method call.
	 */
	public void setId( int i ) {
		id = Integer.toString( i );
	}

	/*
	 * Overloaded setId to use the updated string.
	 */
	public void setId( String i ) {
		id = i;
	}

	public void setGpa( double g ) {
		gpa = g;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

	public int getIntegerId() {
		return Integer.parseInt( id );
	}

	public double getGpa() {
		return gpa;
	}

	public boolean isAdult() {
		if ( age >= 21 ) {
			return true;
		} else {
			return false;
		}
	}
}
