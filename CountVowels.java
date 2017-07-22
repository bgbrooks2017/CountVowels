package main;

public class CountVowels {
	
	public static void main(String[] args){
		//This is a basic vowel counter. Enter any string in place of "How MANY Vowels?"
		//and find out how many total vowels, and the individual breakdown of vowels
		//are in the string. 
		
		String words = "How MANY Vowels?";
		int vowCount = 0;
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		for(int ctr = 0; ctr < words.length(); ctr++){
			char v = words.charAt(ctr);
			
			if (v == 'a' || v == 'A'){
				aCount++;
				vowCount++;
			}
			if (v == 'e' || v == 'E'){
				eCount++;
				vowCount++;
			}
			if (v == 'i' || v == 'I'){
				iCount++;
				vowCount++;
			}
			if (v == 'o' || v == 'O'){
				oCount++;
				vowCount++;
			}
			if (v == 'u' || v == 'U'){
				uCount++;
				vowCount++;
			}
		}
		System.out.println("Total Number of Vowels: " + vowCount);
		System.out.println("Vowel Breakdown:\n");
		System.out.println("Number of A's: " + aCount);
		System.out.println("Number of E's: " + eCount);
		System.out.println("Number of I's: " + iCount);
		System.out.println("Number of O's: " + oCount);
		System.out.println("Number of U's: " + uCount);
	}

}
