package VetoreMatriz;

import java.util.Scanner;

/*
 * 4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
		exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */

public class Exercicio4Matriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int valores[][] = new int[3][3];
		int somaV=0, somaD=0;
		
		for (int l=0;l<3;l++)
		{
			for (int c=0;c<3;c++)
			{
				System.out.println("Entre com um valor");
				valores[l][c]=ler.nextInt();
				
				somaV = somaV + valores[l][c];
				
				if(l==c)
				{
					somaD = somaD + valores[l][c];
				}
			}
		}
		System.out.println("A soma dos valores é: "+somaV);
		System.out.println("A soma dos valores da diagonal principal é: "+somaD);

	}

}
