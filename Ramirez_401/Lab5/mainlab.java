package Lab5;
import java.util.Scanner;

public class mainlab {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Once you have completed the methods above, write a simple main program that does the following:
        //1) Calls the getData() method to generate, input and return a new array (note parameter and return value)
        //2) Calls the max, sum and ave methods to get those values and prints them all out in a nicely formatted way
        System.out.println("Hello! You are here to create an array and perform functions on it!");

        //creating a list
        System.out.println("creating a list: ");
        double [] list = arrays.getData(input);
        
        //calling max
        System.out.println("finding the max item in the list");
        System.out.println(arrays.max(list));

        //calling sum
        System.out.println("finding the sum of all items in the list");
        System.out.println(arrays.sum(list));

        //calling ave
        System.out.println("finding the average of all items in the list");
        System.out.println(arrays.ave(list));

    }
}
