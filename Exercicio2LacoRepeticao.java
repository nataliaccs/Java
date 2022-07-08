package Familia55;

import java.util.Scanner;

/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */
public class Exercicio2LacoRepeticao 
{
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num,contpar=0,contimp=0;
	
		
		for(int x=1;x<=10;x++) 
		{
		System.out.println("Entre com o "+x+" número:");
		num = leia.nextInt();
			if (num %2 == 0)
			{
				contpar = contpar + 1;
			}
			else if (num %2 == 1)
			{
				contimp = contimp + 1;
			}
			
		}
		System.out.println(contpar+" números são par.");	
		System.out.println(contimp+" números são ímpar.");
	}
		
		
}
		
