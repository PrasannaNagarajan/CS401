package Lab10;

// CMPINF 0401 Fall 2022
// MyDeque class to implement a simple deque
// Complete the methods indicated.  Be careful about the
// special cases indicated.  See lab for details on how
// to implement the methods.

public class MyDeque implements SimpleDeque
{
	Object [] theData;
	int numItems;

	public MyDeque(int maxItems)
	{
		theData = new Object[maxItems];
		numItems = 0;
        
	}
    public int maxItems;

	
	public boolean isEmpty()
	{
		return (numItems == 0);
	}
	
	public void addFront(Object X)
	{   
        if (numItems < theData.length){
            //Object newtheData [] = new Object[theData.length +1 ]; 
            //newtheData[0]= X;
            //for (int i = 0; i < theData.length; i++){
                //newtheData[i+1] = theData[i];
                for (int i = 0; i < theData.length-2; i ++){
                    theData[i+1]=theData[i];
                }
            //theData = newtheData;
            numItems ++;
            theData[0] = X;
        }
        else{

        }
		// Add new item at front of list (shifting old items
		// to right first).  If the list is full, do not add
		// the item (just do nothing).
	}

	public void addRear(Object X)
	{   
        if (numItems < theData.length){
            theData[numItems] = X;
            numItems++;
        }
        else{

        }
		// Add new item at rear of list.  If the list is full,
		// do not add the item (just do nothing).
	}

	public Object removeFront()
	{   
        if (numItems > 0){
            
            Object firstItem = theData[0];
            //Object newthedata [] = new Object[theData.length-1];
            //for (int i = 1; i <theData.length; i ++){
            //    newthedata[i-1] = theData[i];
            //}
            for (int i = 1; i < theData.length; i ++){
                theData[i-1]=theData[i];
            }
            numItems = numItems-1;
            
            //theData = newthedata;
            //for (int i = 0; i < theData.length; i++){
            //   System.out.println(theData[i]);
            //}
            return firstItem;
        }
        else{
            return null;
        }
        
		// Remove and return front item from list, shifting remaining
		// items to the left to fill the spot.  If list is empty,
		// return null.
	}

	public Object removeRear()
    { 
        if (numItems > 0){
           Object lastItem = theData[numItems-1];
           theData[numItems] = null;
           numItems = numItems-1;
           return lastItem;
        }
        else{
            return null;
        }
		// Remove and return rear item from list.  If list is empty,
		// return null.
	}
}
