package Familia55;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro valor(inteiro): ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo valor(inteiro): ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o segundo valor(inteiro): ");
		n3 = leia.nextInt();
		
		System.out.println("\nO valor maior é: ");
		
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1);
		}
		if(n2>n1 && n2>n3)
		{
			System.out.println(n2);
		}
		if(n3>n1 && n3>n2)
		{
			System.out.println(n3);
		}
		
	}
	

}
