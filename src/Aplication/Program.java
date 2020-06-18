package Aplication;

import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product x;
		
		int quantity;
		x= new Product();
		
		System.out.println("Digite as informações do Produto");
		System.out.println("Digite o nome");
		x.name = sc.next();
		System.out.println("Quanto vale cada unidade");
		x.price = sc.nextDouble();
		System.out.println("Quantidade em Estoque");
		x.quantity = sc.nextInt();
		
		System.out.println(x.ToString());
		
		System.out.println();
		System.out.println("Entre com a quantidade, que você deseja add no estoque: ");
		System.out.println();
		quantity =sc.nextInt();
		x.AddProducts(quantity);

		System.out.println(x.ToString());
		
		System.out.println();
		System.out.println("Entre com a quantidade, que você deseja remove do estoque: ");
		System.out.println();
		quantity =sc.nextInt();
		x.RemoveProducts(quantity);

		System.out.println(x.ToString());
		
		
		
		
		/*
		 * 
		x.MostrarProduto();
		x.AddProducts(5);
		x.MostrarProduto();
		 * 
		 * 
		 * 
		 * System.out.println("Entre com os valores, 1 para adicionar produtos, 2 lançar saida e 3 para sair");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			x.AddProducts();
			System.out.println("Produto adicionado com sucesso!");
			System.out.println("-------------------------------");
			x.MostrarProduto();
			break;
		case 2:
			x.RemoveProducts();
			System.out.println("Produto adicionado com sucesso!");
			System.out.println("-------------------------------");
			x.MostrarProduto();
			break;
		
		}*/
		sc.close();
	}

}
