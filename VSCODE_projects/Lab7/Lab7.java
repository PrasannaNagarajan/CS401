package Lab7;

// CMPINF 0401 Fall 2022
// Lab7 Driver program.  Your modified SimpleAList class should work with
// this class as is and should produce the same output as shown in file
// lab7out.txt

public class Lab7
{
	static String [] data = {"This", "is", "Lab", "Seven"};
	
	public static void main(String [] args)
	{
		SimpleAList list1 = new SimpleAList();
		SimpleAList list2 = new SimpleAList();
		
		for (int i = 0; i < data.length; i++)
		{
			list1.add(data[i]);
			list2.add(data[i]);
		}
		System.out.println("List 1: " + list1.toString());
		System.out.println("List 2: " + list2.toString());
		
		if (list1.equals(list2))
			System.out.println("Lists are equal");
		else
			System.out.println("Lists are NOT equal");
		
		list1.set(2, "Exercise");
		
		System.out.println("List 1: " + list1.toString());
		System.out.println("List 2: " + list2.toString());
		
		if (list1.equals(list2))
			System.out.println("Lists are equal");
		else
			System.out.println("Lists are NOT equal");
		
		list1.set(2, "Lab");
		list2.add("Output");
		
		System.out.println("List 1: " + list1.toString());
		System.out.println("List 2: " + list2.toString());
		
		if (list1.equals(list2))
			System.out.println("Lists are equal");
		else
			System.out.println("Lists are NOT equal");
	}
}
