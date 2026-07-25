package application;

public class Program {
	
	public static void main(String[] args) {
		
		
		//Boxing
		int x = 20; //Stack x = 20
				
		Object obj = x; //Object é a classe mais genérica do Java, todas as classes são filhas a essa classe.
		//Stack obj---------> Heap 20
		
		
		System.out.println(obj);
		
		
		//Unboxing
				
		int y = (int) obj; //nesse caso tem que fazer o casting (int).
		
		//Stack y = 20
		
		System.out.println(y);
		
		
		//wrapper é um tipo classe compativel com o tipo primitivo
		
		//Object
		//   |
		//   |_______________________________________
		//   |                                       |
		// Number                                    |
		//----------------------                     |
		// primitivo  /   classe          primitivo  /   classe
		// byte       /   Byte            boolean    /   Boolean
		// short      /   Short           char       /   Character
		// int        /   Integer
		// long       /   Long
		// float      /   Float
		
		//Usando a classe Wrapper para não ter que fazer o cast e ficar de forma natural da linguagem.
		
		Integer obj2 = x;
		
		int z = obj2 * 3;
		
		System.out.println(z);
		
		
		
		
	}

}
