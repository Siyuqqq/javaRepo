//Siyu Qiu
package flexon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;


import java.util.Scanner;


public class SolutionSiyuQiu {

	public static void main(String[] args) {
		// Get Student list
		String[] studentList = getStudentList();
		Random rand = new Random();
		//Get random index and student name
		int randidx = rand.nextInt(studentList.length);
		String selectedStudent = studentList[randidx];
		
		System.out.println("Random Selected Student is " + selectedStudent);
      JOptionPane.showMessageDialog(null, "Random Selected Student is " + selectedStudent);

	}
	
	public static String[] getStudentList() {
		
		//To make it dynamic, read and create string array from the file
		
		List<String> lines = new ArrayList<String>();
				
		 try {
			   Scanner sc = new Scanner(new File("/Users/siyuqiu/eclipse-workspace/flexon/src/flexon/StudentList.txt"));  
			   while (sc.hasNextLine()) {
			    lines.add(sc.nextLine());
			   }
			  } catch (FileNotFoundException e) {
			   return new String[0];
		}

		String[] studentsList = lines.toArray(new String[0]);
		
		return studentsList;
	}
	
	

}

