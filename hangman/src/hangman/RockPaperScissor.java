package hangman;
import java.util.*;
public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerpoint=0;
		int userpoint=0;
		int i=3;
		while(i>0) {
			Scanner input= new Scanner(System.in);
			String s= input.next();
			Random r= new Random();
			String [] rps= {"Rock", "paper", "scissor"};
			String e= rps[r.nextInt(3)];
			System.out.println("computer"+e);
		if(e.equals(s)) {
			System.out.println("tie");
			i++;
		}
		if(e.equals("Rock") && s.equals("paper")){
			userpoint++;
			System.out.println("userpoint:" +userpoint);
		}
		if( s.equals("Rock") && e.equals("paper")){
			computerpoint++;
			System.out.println( "computerpoint:"+computerpoint);
		}
		if(e.equals("Rock") && s.equals("scissor")) {
			computerpoint++;
			System.out.println( "computerpoint:"+computerpoint);
		}
		if(e.equals("scissor")  && s.equals("Rock")) {
			userpoint++;
			System.out.println("userpoint:" +userpoint);
		}
		if(e.equals("scissor")  && s.equals("paper")) {
			computerpoint++;
			System.out.println( "computerpoint:"+computerpoint);
		}
		if(s.equals("scissor")  && e.equals("paper")) {
			userpoint++;
			System.out.println("userpoint:" +userpoint);
		}
		i--;
	}
		if(computerpoint>userpoint) {
			System.out.println("computerwon");
		}
		if(userpoint>computerpoint) {
			System.out.println("you won ");
		}
		else {
			System.out.println("Tie");
		}
}}
