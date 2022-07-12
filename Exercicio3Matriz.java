package VetoreMatriz;

/*
 * 3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 */

import java.util.Scanner;

public class Exercicio3Matriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		
		for (int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
				System.out.println("Entre com um número: ");
				n1[l][c]=ler.nextInt();
				System.out.println("Entre com um número: ");
				n2[l][c]=ler.nextInt();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
 		
			}
		}
		
		for (int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
				System.out.println("\tA matriz M1 é "+m1[l][c]);
				System.out.println("A matriz M2 é "+m2[l][c]);
			}
		}
	}

}
