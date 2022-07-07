package Familia55;

import java.util.Scanner;

/*
 * 2-	Faça um programa que entre com três números e os coloque em ordem crescente.
 */

public class Exercicio2 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro valor(inteiro): ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo valor(inteiro): ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o segundo valor(inteiro): ");
		n3 = leia.nextInt();
		
		if(n1<=n2 && n2<=n3)
		{
			System.out.println("\nA ordem crescente é :"+n1+" , "+n2+" , "+n3);
		}
		else if(n1<=n3 && n3<=n2)
		{
			System.out.println("\nA ordem crescente é :"+n1+" , "+n3+" , "+n2);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.println("\nA ordem crescente é :"+n2+" , "+n1+" , "+n3);
		}
		else if(n2<=n3 && n3<=n1)
		{
			System.out.println("\nA ordem crescente é :"+n2+" , "+n3+" , "+n1);
		}
		else if(n3<=n1 && n1<=n2)
		{
			System.out.println("\nA ordem crescente é :"+n3+" , "+n1+" , "+n2);
		}
		else
		{
			System.out.println("\nA ordem crescente é :"+n3+" , "+n2+" , "+n1);
		}
		
		
	}

}
