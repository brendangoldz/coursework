package Recursion;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "racecar";
		System.out.print("The reverse of pots&pans is " + reverseString(word));
		palindromeCheck(word);

	}
	public static String reverseString(String word){
		String reversed = "";
		if(word.length() == 0 || word.length() == 1){
		return word;
		}		
		else{
			String last =  word.substring(word.length()-1);
			String sub = word.substring(0, word.length()-1);
			reversed = last + reverseString(sub);
		}
		return reversed;
	}
	public static void palindromeCheck(String word){
		if(reverseString(word).equals(word)){
			System.out.println("\n" + word + " is a palindrome");
		}
		else{
			System.out.println("The " + word + " is a palindrome");
		}
	}

}
