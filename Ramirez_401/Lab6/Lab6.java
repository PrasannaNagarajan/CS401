package Lab6;

// CMPINF 0401 Lab 6 Main Program
// Your job is to complete this program so that it runs correctly.
// The Movie class and MovieDB class have already been completed for you.
// Utilizing data abstraction, you can access/use these classes without
// having to know their implementation details.  However, since you have
// the code for them you certainly can look at the implementations.
// You just need to write the correct code in the 3 passages below.  Some
// comments indicate what you need to do in each case.
import java.util.*;
import java.io.*;
public class Lab6
{
	public static void main(String [] args) throws IOException
	{
		MovieDB movies = new MovieDB(10); // Create MovieDB object.  The
					// size is set at 10, meaning it can hold up to 10
					// movies.  If we wanted (as discussed in lecture) we
					// could allow for it to be resized so it could hold
					// an arbitrary number of movies.
		loadData(movies);		// input movie data from file
		getCommands(movies);	// interact with user 
		saveData(movies);		// save movie data back to file
	}

	public static void loadData(MovieDB movies) throws IOException
	{
		// Note the syntax below for creating a Scanner to a file
		Scanner S = new Scanner(new FileInputStream("/Users/prasannanagarajan/Desktop/CS0401/VSCODE_projects/Lab6/movieFile.txt"));
        

		// *** CODE SEGMENT 1 *** //
		// Complete this method in the following way:
		// Read in the number of movies from the file
		// For each movie read the data from the file and create a Movie
		// object
		// Add the Movie to the MoviesDB object (movies) using the appropriate
		// method (see MovieDB class)
		// See also movieFile.txt for the format of the file.
        int length = S.nextInt();
        S.nextLine();
        for (int i = 1;i<= length; i++)
        {   String moname = S.nextLine();
            String direcname = S.nextLine();
            String producname = S.nextLine();
            String gross = S.nextLine();
            double rgross = Double.parseDouble(gross);

            Movie newMovie = new Movie(moname, direcname, producname, rgross);
            movies.addMovie(newMovie);
        }
	}

	public static Movie getCommands(MovieDB movies)
	{
		Scanner inScan = new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1. List movies");
		System.out.println("2. Add new movie");
		System.out.println("3. Find movie");
		System.out.println("4. Quit");
		String choice = inScan.nextLine();
		while (true)
		{
			Movie temp;
			if (choice.equals("1"))
			{
				System.out.println(movies.toString());
			}
			else if (choice.equals("2"))
			{
				// *** CODE SEGMENT 2 *** //
				// Complete this choice in the following way:
				// Prompt for and read in each of the values needed
				// for the new Movie object (3 strings, 1 double)
				// Create a new Movie object and then add it to the
				// MovieDB object (movies) using the correct method.

               

                System.out.println("Movie name?");
                String movieName = inScan.nextLine();

                System.out.println("Director?");
                String directorName = inScan.nextLine();

                System.out.println("Studio?");
                String studioName = inScan.nextLine();

                System.out.println("Gross?");
                String gross = inScan.nextLine();
                double rgross = Double.parseDouble(gross);
                

                Movie mo = new Movie(movieName, directorName, studioName, rgross);

                movies.addMovie(mo);

			}
			else if (choice.equals("3"))
			{
				// *** CODE SEGMENT 3 *** //
				// Complete this choice in the following way:
				// Ask the user for the movie name and read it in
				// Call the appropriate method in the MovieDB object
				// (movies) to find the Movie a dicate it is not found)
                System.out.println("Movie name");
                String moname = inScan.nextLine();

                Movie monames = movies.findMovie(moname);
                if (monames == null){
                    System.out.println("movie not found");
                }
                else{
                    System.out.println(monames.toString());
                }

			}
			else
			{
				System.out.println("Good-bye");
				break;  // any other value -- quit
			}
			System.out.println("Enter your choice:");
			System.out.println("1. List movies");
			System.out.println("2. Add new movie");
			System.out.println("3. Find movie");
			System.out.println("4. Quit");
			choice = inScan.nextLine();
		}
        return null;
	}

	public static void saveData(MovieDB movies) throws IOException
	{
		PrintWriter P = new PrintWriter("movieFile.txt");
		// Note that we are printing the entire DB to the file with
		// one statement.  This is because the toStringFile() method
		// of the MovieDB class calls the toStringFile() method of
		// each Movie within the DB.
		P.print(movies.toStringFile());
		P.close();
	}
}
