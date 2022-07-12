package VetoreMatriz;

import java.util.Scanner;

/*
 * 1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
 * 		e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
 */

public class Exercicio1Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float valores[] = new float [5];
		double maiorV = 0.0;
		
		for(int i=0;i<5;i++)
		{
			System.out.printf("\nEntre com os valores de pontuação : ");
			valores[i]=leia.nextFloat();
			if (valores[i]>maiorV)
			{
				maiorV = valores[i];
			}
		}
			
		
		System.out.printf("\nO valor da pontuações é: "+"\t"+valores[0]+"\t"+valores[1]+"\t"+valores[2]+"\t"+valores[3]+"\t"+valores[4]);
		
		System.out.printf("\nO maior valor é: "+ maiorV);

	}

}
