package estruturaDeDados;

import java.util.Scanner;

public class NotasEstruturaDeDadosSimples {
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
	
		String names[] = new String[3];
		double grades[] = new double[3];
		String result[] = new String [3];
	
		System.out.println("-----------------------------");
		System.out.println("-----STUDENTS' DATA----------");
		System.out.println("-----------------------------");
		System.out.println();
		
		System.out.println("Enter the names of the students:");
		for (int i=0; i<3; i++) {
			names[i] = read.nextLine();
		}
		System.out.println();
		System.out.println("Enter the grades of the students:");
		for (int i=0; i<3; i++) {
			grades[i]= read.nextDouble();
		}
		System.out.println();
		for (int i=0; i<3; i++) {
			if (grades[i]>=7.0) {
				result[i] = "PASS";
			}else {
				result[i] = "FAILED";
			}
		}
		
		System.out.println("----STUDENT REPORT-------");
		for(int i=0; i<3; i++) {
			System.out.println(names[i]+ " "+ grades[i]+" "+ result[i]+ "           |");
		}
		System.out.println("-------------------------");
		
		}
		
	}


