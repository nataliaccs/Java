package VetoreMatriz;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		int matriz[][] = new int[3][4];
		int matriz1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		                 //         3 linhas e 4 colunas
		Scanner ler = new Scanner(System.in);
		
		matriz[1][3]=28;
		matriz[0][0]=10;
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<4;coluna++)
			{
				System.out.print(matriz[linha][coluna]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<4;coluna++)
			{
				System.out.print(matriz1[linha][coluna]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<4;coluna++)
			{
				System.out.print("Digite um valor: ");
				matriz [linha][coluna]=ler.nextInt();
			}
		}
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<4;coluna++)
			{
				System.out.print(matriz[linha][coluna]+"\t");
			}
			System.out.println();
		}

	}
}
