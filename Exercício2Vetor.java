package VetoreMatriz;

/*
 * 2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor 
 * 		com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
 * 		contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 */

import java.util.Scanner;

public class Exercício2Vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int valor[] = new int [10];
		int soma=0,media,maiorP=0;
		
		for (int i=0;i<10;i++)
		{
			System.out.println("Digite o valor de lançamento:");
			valor[i]=ler.nextInt();
			
			if (valor[i] == 6)
			{
				maiorP++;
			}
		
			soma = soma + valor [i];
		}
		media = soma / 10;
		System.out.println("A média aritmética dos lançamento é: "+media);
		System.out.println("A ocorrência da maior pontuação é: "+maiorP);

	}

}
