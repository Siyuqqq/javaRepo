
import java.util.Random;

import javax.swing.JOptionPane;


public class RandomStudent {
	
	public static String[] studentList = new String[]{"Abby Truong","Ahmed Mujtaba", "Azeez Temitope Olanrewaju", 
		"Diming Chu", "Dongshuo Li", "Honorinicy", "Jason", "Junyu Liu", "Kelly Liu", 
		"Kinjan", "Kun Li" , "Muhammed Umar" , "Oaz" , "PQ" , "Prithviatani" , "Richard" , 
		"Sahil Slngh Sandhu", "Samuel Yang" , "Scott(Shi-Kai) Jhou" , "Shahbaz Mansahia" , 
		"Shahriar Kabir" , "Shakur" , "Shrina Patel" , "Siyu Qiu" , "Siyu Lei" , "Sumid", 
		"Tao" , "Trivediakshay" , "Yan Huang" , "Zhaosaitong"}; 
	public static void main(String[] args) {
		int n = studentList.length;

		//Get random select until all be selected
		while (n > 0) {
			randomSelect(n);
			n--;
		}
		JOptionPane.showMessageDialog(null, "All students have been selected");
	}
	
	public static void randomSelect(int n) {
		Random rand = new Random();
		//Get random index and student name
		int randidx = rand.nextInt(n);
		String selectedStudent = studentList[randidx];		
		System.out.println("Random Selected Student is " + selectedStudent + ". The number of students remaining is " + Integer.toString(n-1));
        JOptionPane.showMessageDialog(null, "Random Selected Student is " + selectedStudent + ". The number of students remaining is " + Integer.toString(n-1));
        if (n-1 != 0) {
        	swap(randidx, n-1);
        }
	}
	public static void swap(int i, int j) {
		String temp = studentList[j];
		studentList[j] = studentList[i];
		studentList[i] = temp;
	}
	
}
