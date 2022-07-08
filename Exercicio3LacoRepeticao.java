package Familia55;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
   21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
   idade for =-99. (WHILE)
 */

public class Exercicio3LacoRepeticao {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

		int id = 0, menos = 0, mais = 0;
		System.out.println("Digite sua idade: ");
		id = ler.nextInt();
		
		while (id != -99)
			
		{
			if (id < 21)
			{
				menos++;
			}
			if (id > 50)
			{
				mais++;
			}
			System.out.println("Digite sua idade: ");
			id = ler.nextInt();
		}
		System.out.println("O total de pessoas com mais de 50 anos é: " + mais);
		System.out.println("O total de pessoas com menos de 21 anos é: " + menos);
	}

}
