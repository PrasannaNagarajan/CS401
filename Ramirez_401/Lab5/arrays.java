package Lab5;
import java.util.ArrayList;
import java.util.Scanner;

public class arrays {
    /**
     * @param input
     * @return
     */
    public static double [] getData(Scanner input){
        System.out.println("How many numbers do you want to enter?");
        int num = input.nextInt();

        double[] listname = new double[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < listname.length; i++ ) {
           listname[i] = input.nextDouble();

    }
    return listname;
}
     // Create an array from user input
// then return the new array. The user will input the size of the array
// and the data that will go into the array. Note the return type.


    public static double max(double [] data){
        double max = 0;
        for (double dbletemp : data){
            if (dbletemp > max){
                max = dbletemp;
            }
            else{
                continue;
            }
        }
        return max;

    } // return the maximum value in the
// array.
    public static double sum(double [] data){
        double total = 0;
        for (double dbletemp : data){
            total = total + dbletemp;

        }
        return total;
    } // sum the items in the array
// and return the result
    public static double ave(double [] data){
        double ave = 0;
        double listlength = data.length;
        ave = sum(data)/listlength;

        return ave;
    } // call sum to get the sum
// and then return the average
}
