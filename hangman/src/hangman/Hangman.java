package hangman;
import java.util.*;

public class Hangman {
	
	public static void main(String[] args) throws Exception {
		Hangmanwordgnrt h = new Hangmanwordgnrt(); // to generate random word method
		StringBuffer word=new StringBuffer(h.randomwrdpick());// give a string buffer 	the word
		StringBuilder worddup=new StringBuilder(word);// duplicate string buffer
		StringBuilder wordadd=new StringBuilder();
		for(int i=0;i<word.length();i++) {
			wordadd.append('*');	
		}
		//System.out.println(woradd); works fine
		System.out.println(word);// printing word for test
		boolean found=false; // to know whether we found element or not
		int count=6;
		int matchtime=0; //match time to see how many time we choose a correct word
		while(count>0) {
			@SuppressWarnings("resource")
			Scanner input= new Scanner(System.in);
			String charinput=input.next();
		for(int i=0;i<word.length();i++) {
			if(charinput.charAt(0)==worddup.charAt(i)) {
				found=true;
				System.out.println(found);
				worddup.setCharAt(i, '*');//replaces the character with *;
				wordadd.setCharAt(i, charinput.charAt(0));
				System.out.println(wordadd);
				System.out.println("correct word keep guessing");
				matchtime++;
				break;
			}
			}
		if(found==false) {
			count--;
			System.out.println("remainging life"+count);
			System.out.println(wordadd);
			printhangman(count);
		}
		
		if(matchtime>=word.length()) {
			System.out.println("you won word was "+word);
			System.exit(0);
		}
		found=false;
		}
		
	}
public static void printhangman(int count){
	System.out.println("Remainging life"+count);
	if (count == 6) {
		System.out.println("Wrong guess, try again");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("___|___");
		System.out.println();
	}
	if (count == 5) {
		System.out.println("Wrong guess, try again");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("___|___");
	}
	if (count == 4) {
		System.out.println("Wrong guess, try again");
		System.out.println("   ____________");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   | ");
		System.out.println("___|___");
	}
	if (count == 3) {
		System.out.println("Wrong guess, try again");
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("___|___");
	}
	if (count == 2) {
		System.out.println("Wrong guess, try again");
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |           |");
		System.out.println("   |           |");
		System.out.println("   |");
		System.out.println("___|___");
	}
	if (count == 1) {
		System.out.println("Wrong guess, try again");
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |           |");
		System.out.println("   |           |");
		System.out.println("   |          / \\ ");
		System.out.println("___|___      /   \\");
	}
	if (count == 0) {
		System.out.println("GAME OVER!");
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |          _|_");
		System.out.println("   |         / | \\");
		System.out.println("   |          / \\ ");
		System.out.println("___|___      /   \\");
		System.out.println("GAME OVER! The word was " );}
}}


