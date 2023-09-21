package Lab9;

public class MySquare extends MyRectangle {

public MySquare(){
    
}

public MySquare(int x, int y, int side){
    startX = x;
    startY = y;
    width = side;
    height = side;
}
// Constructors to allow new objects to be created. x and y are the
// location coordinates and size is the side length
public String toString(){
    StringBuilder S = new StringBuilder();
		S.append("Side: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
}
// Redefining toString(). See output for effect.
public void setSize(int w, int h){
    if (w !=  h){
        System.out.println("sides must be equal. "+ w + " != "+ h + " so no action taken");
    }
    else if (w == h){
            width = w;
            height = h;
    }
}
// Redefining setSize(). This must be done because the inherited version
// allows the width and height to differ but in a square they must be the
// same. In this version, if the width and height are not the same, the
// method should output a message and not change anything.
public void setSide(int side){
    width = side;
    height = side;
}
// This is a new method that updates that size of the square. Think about
// how this will be implemented using the existing inherited instance vars.
}

