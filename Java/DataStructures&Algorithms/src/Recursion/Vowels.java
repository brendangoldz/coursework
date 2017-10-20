package Recursion;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static void vowels(String word){
		int vowels = 0;
		int consonants = 0;
		for(int i = 0; i<word.length();i++){
			char c = word.charAt(i);
		 if (c == 'a' || c == 'e' || c == 'i' || 
                 c == 'o' || c == 'u')
		 {
         vowels++;
		 }
		 else
		 { 
         consonants++;
		 }
		}
	}

}
