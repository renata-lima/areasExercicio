package estruturaDeDados;

import java.util.Scanner;

public class NotasEstruturaComMatriz {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String names[] = new String[3];
		double grades[][] = new double[3][2];
		String result[] = new String [3];
	
		System.out.println("|----------------------------------|");
		System.out.println("|---------STUDENTS' DATA-----------|");
		System.out.println("|----------------------------------|");
		System.out.println();
		
		System.out.println("|-Enter the names of the students--|");
		for (int i=0; i<3; i++) {
			System.out.print("Student " +(i+1)+": "); 
			names[i] = read.nextLine();
		}
		
		System.out.println("-----------------------------------");
		System.out.println();
		System.out.println("|-Enter the grades of the students-|");
		System.out.println();
		
		for (int i=0; i<3; i++) {
			System.out.println("Enter "+names[i]+"'s grade:");
			for (int j=0; j<2; j++) {
				grades[i][j]= read.nextDouble();	
			}	
		}		
		
		double average1 = (grades[0][0]+grades[0][1])/2;
		double average2 = (grades[1][0]+grades[1][1])/2;
		double average3 = (grades[2][0]+grades[2][1])/2;
		
		//student 1//
		if(average1 >= 7.0) {
			result[0]= "PASS";
		}else {
			result[0]= "FAIL";
		}
		//student 2//
		if(average2 >= 7.0) {
			result[1]= "PASS";
		}else {
			result[1]= "FAIL";
		}
		//student 3//
		if(average3 >= 7.0) {
			result[2]= "PASS";
		}else {
			result[2]= "FAIL";
		}
		System.out.println("-----------------------------------|");
		System.out.println();
		
		System.out.println("|----------STUDENT REPORT----------|");
		for(int i=0; i<3; i++) {
			System.out.println(names[i]+" "+ result[i]);
		}
		System.out.println("-----------------------------------|");
	}
}

