package applications;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAlturas {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int nPessoas = 0;
				
		System.out.print("Quantas pessoas serão digitadas? Quantidade: ");
		
		nPessoas = sc.nextInt();
		
		String[] vectNomes = new String[nPessoas]; 
		int[] vectIdades = new int[nPessoas];
		double[] vectAlturas = new double[nPessoas];
		
		for(int i = 0; i < nPessoas; i++) {
			
			sc.nextLine();
			System.out.printf("Dados da %dª pessoa\n", i+1);
			System.out.print("Nome: ");
			vectNomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectIdades[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectAlturas[i] = sc.nextDouble();
			
		}
		
		double sumAltura = 0.0;
		double avgAltura;
		int contIdadeMenor16 = 0;
		double porcentMenor16;
		
		for(int i = 0; i < nPessoas; i++) {
			
			sumAltura += vectAlturas[i];
			
			if(vectIdades[i] < 16) {
				contIdadeMenor16++;
			}
		}
		
		System.out.println();
		avgAltura = sumAltura / nPessoas;
		System.out.printf("Altura média: %.2f%n", avgAltura);
		
		porcentMenor16 = (contIdadeMenor16 * 100.0) / nPessoas;
		System.out.printf("Pessoal com menos de 16 anos: %.1f%%%n", porcentMenor16);    
		
		for(int i = 0; i < nPessoas; i++) {
			if(vectIdades[i] < 16) {
			System.out.println(vectNomes[i]);
			}
		}
		
		sc.close();
	}

}
