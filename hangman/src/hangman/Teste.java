package hangman;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
}

// TODO Auto-generated method stub
int count=6;
Hangmanwordgnrt hn = new Hangmanwordgnrt();
StringBuilder word= new StringBuilder(hn.randomwrdpick());
StringBuilder s=new StringBuilder();
for(int i=0;i<word.length();i++) {
	s.append('*');
}
System.out.println(s);
char []werd= new char[word.length()];
word.getChars(0, word.length(), werd,  0);
Scanner input= new Scanner(System.in);
Boolean a=false;
char gotele;
int countchar=0;
System.out.println("length of word "+word.length());
System.out.println(word);
int length=0;
StringBuilder worddupo=word;
while(count>0) {
	char in =input.next().charAt(0);
	for(char ch : werd) {
		if(in==ch) {
			a=true;
			break;
		}
		countchar++;
	}
	if(a==true) {
		s.setCharAt(countchar, in);
		word.replace(countchar, countchar, "*");
		System.out.println("correct guess");
		System.out.println(s);
		a=false;
		length++;
		countchar=0;
		if(length>=word.length()) {
			System.out.println("congratulations you havewon");
			break;
		}
	}
	else {count--;
	System.out.println("life remaining"+count);
	countchar=0;
	printhangman(count,word.toString());
	