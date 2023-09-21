package Lab9;
public class MyRectangle
{
	// Declare instance variables here
    protected int startX;
    protected int startY;
    protected int width;
    protected int height;



	public MyRectangle()
	{
		// Default constructor -- initialize all instance variables
		// to 0
        startX = 0;
        startY =0;
        width =0;
        height = 0;
	}

	public MyRectangle(int x, int y, int w, int h)
	{
		// Initialize instance variables based on parameters shown.
		// Be careful to get the order correct!
        startX = x;
        startY = y;
        width = w;
        height = h;
	}

	public int area()
	{
		// Return the area of this Rectangle
        return width * height;
	}

	// I have written this method for you.  Note how a StringBuilder is
	// utilized, since (as we discussed in lecture) it can be modified
	// without having to create a new object each time (unlike a String).
	// Note that this method does NOT print any output to the display.
	// Rather it returns a String with content that COULD be sent to the
	// display if desired.  Make sure you are aware of that distinction.
	public String toString()
	{
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y)
	{
		// This is the trickiest of the methods to write.  This should
		// return true if point (x,y) is anywhere within the borders of the
		// current MyRectangle (including the borders themselves).  Use a
		// pencil and paper to figure out how this can be determined with
		// just a few simple relational operations.

        if (x >= startX && x <= startX + width ) {
            if (y >= startY && y <= startY + height){
                return true;
            }
        }
        
        return false;
        


	}

	public void setSize(int w, int h)
	{
		// Update width and height as shown
        width = w;
        height = h;
	}

	public void setPosition(int x, int y)
	{
		// Update startX and startY as shown
        startX = x;
        startY = y;
	}

}