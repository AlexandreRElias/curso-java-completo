package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite o nome do Aluno");
		
		student.name = sc.nextLine();		
		
		System.out.println("Digite as notas de cada trimestre");
		
		student.firstScore = sc.nextDouble();
		student.secondScore = sc.nextDouble();
		student.thirdScore = sc.nextDouble();
		
		student.media();
		
			if (student.finalGrade >= 60) {
				
				System.out.printf("FINAL GRADE = %f%n",student.finalGrade);
				System.out.println("PASS");
			
		} else {
			System.out.printf("FINAL GRADE = %.2f%n",student.finalGrade);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints(student.finalGrade));		
		}
		
		sc.close();
	}

}
