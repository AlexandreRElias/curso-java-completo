package application;

import java.util.Locale;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.a = 10;
		t1.b = 20;
		t1.c = 30;

		System.out.printf("triangle t1 a: %.2f, b: %.2f, c: %.2f", t1.a, t1.b, t1.c);
		System.out.println();

		t2 = t1;

		System.out.printf("triangle t2 a: %.2f, b: %.2f, c: %.2f", t2.a, t2.b, t2.c);
		System.out.println();

		t1.a = 40;
		t1.b = 50;
		t1.c = 60;

		System.out.printf("triangle t1 a: %.2f, b: %.2f, c: %.2f", t1.a, t1.b, t1.c);
		System.out.println();

		System.out.printf("triangle t2 a: %.2f, b: %.2f, c: %.2f", t2.a, t2.b, t2.c);
		System.out.println();

		t2.a = 70;
		t2.b = 80;
		t2.c = 90;

		System.out.printf("triangle t1 a: %.2f, b: %.2f, c: %.2f", t1.a, t1.b, t1.c);
		System.out.println();

		System.out.printf("triangle t2 a: %.2f, b: %.2f, c: %.2f", t2.a, t2.b, t2.c);
		System.out.println();

	}

}
