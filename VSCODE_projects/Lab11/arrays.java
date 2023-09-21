package Lab11;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

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
       
        return max_rec(data, data.length);

    } // return the maximum value in the
// array.

public static double max_rec(double A[], int n)
{
  // if size = 0 means whole array is done
  
  if(n == 1)
    return A[0];
     
    return Math.max(A[n-1], max_rec(A, n-1));

}
    public static double sum(double [] data){
        
        return sum_rec(data, data.length);
    } // sum the items in the array
// and return the result

static double sum_rec(double A[], int N)
    {
        if (N <= 0)
            return 0;
        return (sum_rec(A, N - 1) + A[N - 1]);
    }

    public static double ave(double [] data){
        return ave_rec(data,data.length)/data.length;
    } // call sum to get the sum
// and then return the average

static double ave_rec(double a[], int n)
    {
         
        // Find sum of array element
        int sum = 0;
         
        for (int i = 0; i < n; i++)
            sum += a[i];
     
        return (double)sum;
    }
}
