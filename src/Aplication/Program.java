package Aplication;

import java.util.Scanner;

import Entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Triangle x, y;

		Scanner sc = new Scanner(System.in);

		x = new Triangle();
		y = new Triangle();

		System.out.println("Entre com os valores do tringulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();


		System.out.println("Entre com os valores do tringulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		x.area();
		y.area();
		System.out.println(x.area());
		System.out.println(y.area());
		
		
		if (x.area() > y.area()) {
			System.out.println("X é maior");
		}else {
			System.out.println("Y é maior");}
		sc.close();
	}

}
