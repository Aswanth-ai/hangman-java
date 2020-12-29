package hangman;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class Hangmanwordgnrt {
	public String randomwrdpick ()throws Exception {
		File f = new File("dictionary.txt");
		FileReader readdict=new FileReader(f);
		BufferedReader br=new BufferedReader(readdict);
		br.readLine();
		Random rndm = new Random();
		int number= rndm.nextInt(80368);
		String picker= Files.readAllLines(Paths.get("dictionary.txt")).get(number);
		return(picker);
	}
	
}
