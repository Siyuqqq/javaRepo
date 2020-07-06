import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class readFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = new File("/Users/siyuqiu/eclipse-workspace/HW-readFile/src/main/resources/testFile.txt");
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		List<String> rst = new ArrayList<String>();
		
		Scanner readFileData = new Scanner(inputFile);
		try {
			   Scanner sc = new Scanner(inputFile);  
			   while (sc.hasNextLine()) {
				   String line = sc.nextLine();
				   String[] linelist = line.split(" ");
				   for (int i = 0; i < linelist.length; i++) {
					   String word = linelist[i].toLowerCase();
					   //check the words end with punctuation
					   if (word.charAt(word.length()-1) - 256 > 0) {
						   word = word.substring(word.length()-1);
					   }
					   if (word.length() >= 3) {
						   //count the frequent of words
						   int count = dict.getOrDefault(word, 0) + 1;
						   dict.put(word, count);
						   //reverse word and add in to ArrayList
						   if (count == 5) {
							   StringBuilder sb = new StringBuilder(word);
							   String revereWord = sb.reverse().toString();
							   rst.add(revereWord);
						   }
					   }
				   }
				   
			   }
			  } catch (FileNotFoundException e) {
			  return;
		}
		//iterate the ArrayList
		for (String word: rst) {
			System.out.println(word);
		}

	}

}
