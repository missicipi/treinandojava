package Entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	
	
	public double TotalValueStock() {
		return price * quantity;
		
	}
	public void AddProducts(int quantity) {
		this.quantity += quantity;
		
	}
	public void RemoveProducts() {
		quantity --;
	}
	public void MostrarProduto() {
		System.out.println("Segue as informações do produto em estoque");
		System.out.println(name);
		System.out.println(price);
		System.out.println(quantity);
		
		
	}
	
}