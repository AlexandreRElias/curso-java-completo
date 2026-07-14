package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista = " + list.size());
	
		list.add(2, "Marco");
		System.out.println();
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("Tamanho da lista = " + list.size());
		System.out.println();
		
		System.out.println("Remoção pelo conteúdo \"Anna\"");
		list.remove("Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista = " + list.size());
		System.out.println();
		
		
		System.out.println("Remoção pelo indexador list.remove(1);.");
		
		list.remove(1);
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("Tamanho da lista = " + list.size());
		System.out.println();
		
		System.out.println("Remoção por predicado 'M'.");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("Tamanho da lista = " + list.size());
		System.out.println();
		
		System.out.println("ler o indexador de um conteúdo.");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println();
		
		System.out.println("Ler o indexador de um conteudo inexistente na lista.");
		System.out.println("Index of Alex: " + list.indexOf("Alex"));
		System.out.println();
		
		System.out.println("Adicionando a lista para continuarmos os exemplos.");
		
		list.add(0, "Alex");
		list.add(2, "Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("Tamanho da lista = " + list.size());
		System.out.println();
		
		
		System.out.println("Manter na lista somente os que eu quero em uma certa condição, iniciados em 'A'.");
		
		List<String> result  = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("Tamanho da lista = " + result.size());
		System.out.println();
				
		System.out.println("Achar o primeiro elemento começado em determinada caracter 'A'.");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
		System.out.println();
		
		System.out.println("Achar o primeiro elemento começado em determinada caracter 'J'.");
		
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println(name);
	}
	

}
