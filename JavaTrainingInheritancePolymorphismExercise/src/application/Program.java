package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> listProduct= new ArrayList<>();
		
		
		System.out.print("Enter the number of products:");
		Integer productQuantity = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < productQuantity; i++) {
			System.out.print("Product #" + (i+1) + " data:");
			System.out.println();
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
						
			switch (productType) {
		    case 'c':
		        listProduct.add(new Product(name, price));
		        break;
		        
		    case 'u':
		    	
		    	System.out.print("Manufacture Date: ");
		    	String date = sc.nextLine();
		    	LocalDate manufactureDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		        listProduct.add(new UsedProduct(name, price, manufactureDate));
		        break;
		        
		    case 'i':
		    	System.out.print("Customs fee: ");
		    	Double customsFee = sc.nextDouble();
		    	sc.nextLine();
		    	listProduct.add(new ImportedProduct(name, price, customsFee));
		        break;
		        
		    default:
		        System.out.println("Invalid option! Product not added.");
		        break;
			}
		}
		
		System.out.println("PRICE TAGS:");
		for(Product prod : listProduct) {
			System.out.println(prod.priceTag());			
		}
		
		sc.close();
	}

}
