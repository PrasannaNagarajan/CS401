/* CMPINF 0401 Fall 2022 Java Example 2
   This handout demonstrates simple Java variable declarations, statements and
   output.
   Try uncommenting some of the statements below to see the errors.
*/

public class ex2
{
      public static void main (String [] args)
	  {
          int i, j;   // declaring 2 int variables
          double x = 10.01234567, y = 7.5;   // declaring and init 2 double vars
          i = 20;
          j = 30;  // In Java, method variables (the ones shown here) must be
          		   // given a value before they can be used in an expression.
          		   // This value can be assigned in the declaration (as shown
          		   // for x and y above) or in a separate statement.  Comment
          		   // out one of the two assignments above and see the result.
          
          System.out.print("i is " + i);  // print with no new line
          System.out.println(" and j is " + j);  // print with a new line
          		// The print and println methods in Java are printing text to
          		// the standard output stream, which is typically the display.
          		// If you want to include the value of a variable within these
          		// statements, you can use the + operator (concatenation) as
          		// shown above.
          System.out.println("x is " + x + " and y is " + y);
          	
          //i = (int) "12345";	// Not allowed since "hello" is a String literal
          					// and i is an int variable
          					
          //i = x;  	// Not allowed in Java since x is a "more precise" type
          				// than i.  Uncomment the statement to see the error
          i = (int) x;	// This is allowed -- now we are manually casting the
          				// double value to an int.				
          
          System.out.println("i is " + i + " and x is " + x);
          
          //x = j;	// This is fine since we are allowed to assign "less precise"
          			// values to "more precise" variables.	
          System.out.println("j is " + j + " and x is " + x);
          		
          //float z = 100.5;	// Be careful with some tricky cases in Java.
          			// The statement above looks fine since variable z is a float
          			// and the literal seems to be a float as well.  However, 
          			// the literal is actually a double which is a more precise
          			// type than a float, so the assignment is illegal.  Uncomment
          			// it to see the error.
          // See the difference in precision between a double and a float
          float fpie = (float) Math.PI;
          double dpie = Math.PI;
          System.out.println("Float pi " + fpie);
          System.out.println("Double pi " + dpie);	
          
          float fhalf = (float) 0.5;
          double dhalf = 0.5;
          System.out.println("Float half " + fhalf);
          System.out.println("Double half " + dhalf);	
       }
}