package Familia55;
/*
 * 6-	Escrever um programa que receba vários números inteiros no teclado. 
 * 		E no final imprimir a média dos números múltiplos de 3. 
 * 		Para sair digitar 0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class Exercicio6LacoRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num,soma=0; 
		float media=0, cont=0;
		
	do
	{
		System.out.println("Entre com um némero:");
		num = leia.nextInt();
		if(num%3==0 && num != 0)
		{
			soma = soma + num;
			cont++;
		}
		media = soma / cont;
	
	}while(num != 0 && num != 0);
		System.out.println("A média dos números múltiplos de 3 é "+media);
	}
	

}
