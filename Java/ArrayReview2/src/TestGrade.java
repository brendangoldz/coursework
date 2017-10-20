/**@author Brendan Goldsmith
 * Review Project, due 10/06/2016
 *
 *Algorithm:
 *The following program uses constructors to construct an object that is input/processed through a scanner.
 *After inputs are entered the data is sent to private static methods to Create an object, add an object as
 *well as printing the full array.
 *
 *Constructor:
 *Instance Variables for String, int & Double instantiated as private.
 *First Method Grade sets Default Values to the instantiated variables.
 *Second Method Grade sets the instantiated variables to the variables that will hold the new value.
 *	This method allow the user to set the parameters in the Object instantiation.
 *The rest of the methods follow the same format of Returning the current value in the Get method 
 *In the set method the parameters set in the main method are processed through the constructor and ready to be output.
 *
 *Main Method/Class:
 * The TestGrade class first imports the Java Utility Scanner that can read/process inputs from a user.
 * The two variables scan and arraySize are declared, where scan is the Scanner that reads the input from
 * the Print lines. arraySize is counted each time an object is created & added, this will be used to help
 * the for loop to print all objects in the array. Also, in the main method you have the array size and instantiation
 * of array under array variable scheduleA with a size of 20 objects. The main method holds the while loop that will
 * only run (and is started) by setting the response to 'y'. This insinuates the user wants to continue to enter 
 * objects into the array. Any other key will end/exit the loop and then print all objects in array.
 * 
 * createSubject method:
 * The createSubject method is the method that prompts the user to enter values that will create the object. 
 * Each input a user enters is stored into the respective variable (subject, grade and credit hours). This 
 * is then stored into an array object. 
 *  
 * findPosition method:
 * This method passes through the objects in the array and puts the class through a loop that tests if the class 
 * being inserted has a greater percentage grade then the class at the position in the loop. When the loop is 
 * terminated, the loop returns the position of the object that was found to be not greater than the position 
 * it looped through.
 * 
 * linearSearch method:
 * This method does the same thing above except instead of testing if percentage grade is higher, it tests for
 * equality of a given input. In this case the user enters a Class Name, to which the program reads the input
 * and goes through a loop to go through the object of arrays to find an element with the equivalent value.
 * 
 * insertClass method:
 * This method takes the class that was created in the createSubject method checks if there is room for another
 * object and assigns the object to a specific position in the array, which is then increased by one by the 
 * arraySize counter (++). 
 * 
 * deleteClass method:
 * This method when called prompts the user which class they wish to delete from the schedule. The user enters a 
 * number from 1 to less than the size of array that gets scanned then input into a function that moves the 
 * element to the last position and the function removes the last position deleting the element.
 * 
 * printAll method:
 * Passes through the arraySize variable which will control the length of the loop and the loop goes through each object
 * in the array and prints out each element requested from the constructor class (i.e. getSubject from Grade.)
 * **/
import java.util.*;
public class TestGrade {
	
	/**
	 * This is the main method that holds the while loop to populate
	 * a proper Class array. This main method now holds options/menus to
	 * either Add, Delete, Search as well as Sort a class.
	 * @param args that holds the String array for several "command-line" arguments.
	 * */
	private static int arraySize = 0;
	private static String delete;
	private static String promptResponse = "y";
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		
		//This block of code is the initial class schedule. From here you can Delete, Add or Search
		Grade[] scheduleA = new Grade[10];
		Grade class1 = new Grade("Calculus", 90, 3.3);
		insertClass(class1,scheduleA);
		Grade class2 = new Grade("Science", 88, 3.0);
		insertClass(class2,scheduleA);
		Grade class3 = new Grade("CS", 76, 2.5);
		insertClass(class3,scheduleA);	
		Grade class4 = new Grade("Business", 80, 0.3);
		insertClass(class4,scheduleA);
		Grade class5 = new Grade("Music", 40, 1.1);
		insertClass(class5,scheduleA);
		printAll(scheduleA);
		while(promptResponse.equalsIgnoreCase("y")){
		
			//This is the start of the loop that can start accepting options
			/**Each option gets sent to a ignored case if statement with a comparator to 
				run the proper function
			 **/
			System.out.print("Please select from the menu:");
			System.out.print("\nEnter 'add' to enter a new class" + "\nEnter 'delete' if you wish to remove a course" 
					+ "\nEnter 'search' to search an element by index");
			promptResponse = scan.next();
			
			/**Add:
			 * Instantiates a new Class
			 * Calls Create Class
			 * Stores Created class and sends to insertClass method.
			 * Prints all objects in array
			 * Sets prompt back to y to restart loop.
			 * 
			 * Delete:
			 * Asks user for Class Number (Class Number = Order of array, first class = 1, second = 2 etc.)
			 * Takes number reads it 
			 * Passes number to method
			 * Changes the position read to the last position 
			 * Removes the last position.
			 * 
			 * Search:
			 * Asks user for class name they are looking for
			 * Reads the class name
			 * Passes name to method
			 * Searches through a loop for an element in the object of Arrays for an equivalence
			 * This equivalence stops the loop
			 * Returns position of object that stopped the loop
			 * 
			 * **/
			if(promptResponse.equalsIgnoreCase("add")){
				Grade aClass = createSubject();
				insertClass(aClass,scheduleA);
				printAll(scheduleA);
				promptResponse = "y";
			}
			if(promptResponse.equalsIgnoreCase("delete")){
				System.out.println("Please enter the class name you wish to delete");
				delete = scan.next();
				deleteClass(delete,scheduleA);
				printAll(scheduleA);
				promptResponse = "y";
			}
			if(promptResponse.equalsIgnoreCase("search")){
				System.out.println("Please enter the class name you wish to search for");
				String searchFor = scan.next();
				linearSearch(searchFor, scheduleA);
				System.out.println("\nWould you like to continue? (Y/N)");
				promptResponse = scan.next();
			}
		}
	}

	/**
	 * This method creates a Class from the input of a user
	 * */
	private static Grade createSubject(){
		System.out.print("\nEnter Class:");
		String subject = scan.next();
		System.out.print("Enter Percent Grade:");
		int perGrade = scan.nextInt();
		System.out.print("Enter Credit Hours:");
		double credHours = scan.nextDouble();
		
		Grade aClass = new Grade(subject, perGrade, credHours);
		return aClass;
	}
	
	

	
	/**Position:
	 * Searches through a loop for an element in the object of Arrays for a percent grade 
	 * that is not less than the new Class percent grade.
	 * If the search was not successful the pos is incremented by 1 until it is found
	 * When found it returns the value of pos.
	 * Returns position of object that stopped the loop
	 * @param searchFor is the Class name input received from the user
	 * @param classSched is the array of classes
	 * **/
	private static int findPosition(Grade class1, Grade[] classSched){
		boolean found = false;
		int pos = 0;
		while(pos<arraySize&&!found){
			if(class1.getPercentGrade() < classSched[pos].getPercentGrade()){
				found = true;
			}
			else{
				pos++;
			}
		}
		return pos;
	}	

	/**
	 * This method inserts a Class into the array of Classes
	 * @param class1 is the new class to be added to the array
	 * @param classSched is the array of classes
	 * */
	private static void insertClass(Grade class1, Grade[] classSched){
		int pos = findPosition(class1,classSched);
		
		if(arraySize<classSched.length){
			   arraySize++;
			   for(int i = arraySize-1;i>pos;i--){
				   classSched[i]=classSched[i-1];
			   }
			   classSched[pos] = class1;
		   }
	}
	
	/**Delete:
	 * Asks user for Class Number (Class Number = Order of array, first class = 1, second = 2 etc.)
	 * Takes number reads it 
	 * Passes number to method
	 * Changes the position read to the last position 
	 * Removes the last position.
	 * @param classSched is the array of classes 
	 * **/
	private static void deleteClass(String searchFor, Grade[] classSched){
		boolean found = false;
		int pos = 0;
		while(pos<arraySize&&!found){
			if(classSched[pos].getSubject().equalsIgnoreCase(searchFor)){
				found = true;
			}
			else{
				pos++;
			}
		}
		if(found){
			for(int i = pos + 1; i<arraySize;i++){
				classSched[i-1] = classSched[i];
			}
			arraySize--;
		}
		else{
			System.out.print("\nNot found");
		}
	}
	
	/**Search:
	 * Asks user for class name they are looking for
	 * Reads the class name
	 * Passes name to method
	 * Searches through a loop for an element in the object of Arrays for an equivalence
	 * This equivalence stops the loop
	 * Returns position of object that stopped the loop
	 * @param searchFor is the Class name input received from the user
	 * @param classSched is the array of classes
	 * **/
	private static void linearSearch(String searchFor, Grade[] classSched){
		boolean found = false;
		int pos = 0;
		while(pos<arraySize&&!found){
			if(classSched[pos].getSubject().equalsIgnoreCase(searchFor)){
				found = true;
			}
			else{
				pos++;
			}
		}
		if(found){
			System.out.println("\nYour current grade in " + classSched[pos].getSubject() + " is " 
					+ classSched[pos].getPercentGrade() + ". This class is worth " 
					+ classSched[pos].getCredHours() + " credit hours.\n\n");
		}
		else{
			System.out.print("\nNot found");
		}
	}
	/**
	 * This method prints the array holding the class objects.
	 * @param classSched is the array of classes
	 * */
	private static void printAll(Grade[] classSched){
		for(int i = 0; i<arraySize; i++)
		{
			System.out.println("\nYour current grade in " + classSched[i].getSubject() + " is " 
			+ classSched[i].getPercentGrade() + ". This class is worth " 
			+ classSched[i].getCredHours() + " credit hours.\n\n");
		}
	}
	
}



