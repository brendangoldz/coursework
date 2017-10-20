package P231;
/*
 * P-2.31 Write a Java program to simulate an ecosystem containing two types of creatures,
bears and fish. The ecosystem consists of a river, which is modeled as a relatively
large array. Each cell of the array should contain an Animal object, which can
be a Bear object, a Fish object, or null. In each time step, based on a random
process, each animal either attempts to move into an adjacent array cell or stay
where it is. If two animals of the same type are about to collide in the same
cell, then they stay where they are, but they create a new instance of that type
of animal, which is placed in a random empty (i.e., previously null) cell in the
array. If a bear and a fish collide, however, then the fish dies (i.e., it disappears).
Use actual object creation, via the new operator, to model the creation of new
objects, and provide a visualization of the array after each time step.
 */

public class Ecosystem {
	String type;
	public static void main(String[] args){
		
		int lengthArr = 50;
		String[] river = new String[lengthArr];
		Animal newBear = new Bear();
		Animal newFish = new Fish();
		String[] options = {newBear.getType(), newFish.getType(), null};
		fillArray(river, options);
		for(int j = 0; j<river.length;j++){
			System.out.println(river[j]);
		}
		try{
		//create random number and run through array to ensure rand is a null position
		int rand = (int)(Math.random()*lengthArr);
		while(river[rand]!=null){
			rand = (int)(Math.random()*lengthArr);
		}
		/**
		 * Run through Array using a for loop
		 * Is pos == null, next position
		 * If next positiion == null, take next position
		 * If next position is same as current position, duplicate and put offspring into rand cell
		 * If Bear and Fish meet, Fish cell == null and Bear stays
		 */
		for(int i = 0; i<river.length;i++){
			System.out.println("\nSTEP NUMBER: " + (i+1) + "\n");
			System.out.println(river[i] + " vs. " + river[i+1]);

			//If i is null next step
			if(river[i]==null){
				System.out.println("Null in current Position. No action taken. Advancing position");
			}
			//If bear/fish hits null, take null
			else if(river[i+1]==null){
				river[i+1]=river[i];
				System.out.println(river[i] + " in position "+ i +" advanced a position");
				river[i] = null;
			}
			//Mating If Statement, creates new fish/bear and inputs into random cell that is null
			
			else if(river[i]==river[i+1]){
					if(river[i]=="Fish"){
					Animal newFish2 = new Fish();
					river[rand] = newFish2.getType();					
					System.out.println(river[i] + " in position "+ i +" mated with Fish in next position");
					
					}
					if(river[i]=="Bear"){
					Animal newBear2 = new Bear();
					river[rand] = newBear2.getType();
					System.out.println(river[i] + " in position "+ i +" mated with Bear in next position");
					
					}
					System.out.println("Offspring input into null position " + rand);
					while(river[rand]!=null){
						rand = (int)(Math.random()*lengthArr);
					}
			}
			//If Bear and Fish meet, fish == null
			else if((river[i]=="Fish" && river[i+1]=="Bear")||(river[i]=="Bear" && river[i+1]=="Fish")){
				if(river[i]=="Fish"){
				river[i] = null;
				}
				else{
				river[i+1] = null;					
				}

				System.out.println("A bear ate a fish");
			}
			
			//print river array after sorting through 
			printArray(river);
		}
		
		}//end of try
		catch(ArrayIndexOutOfBoundsException e){			
	
		}
		System.out.println("End Result");
		printArray(river);
		}//end of main
		public static void fillArray(String[] arr, String[] arr2){
		for(int i = 0;i<arr.length;i++){
			int rand = (int)(Math.random()*3);
			arr[i] = arr2[rand]; 
		}
		
		}
		public static void printArray(String[] arr3){
		for(int i = 0; i < arr3.length; i++){
			System.out.println(arr3[i] + "\n");
		}
		}
	
}
