package Familia55;
/*
 * 4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
 * 		Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
 * 		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * 		Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 *  •	o número de pessoas calmas; 
	•	o número de mulheres nervosas; 
	•	o número de homens agressivos; 
	•	o número de outros calmos;
	•	o número de pessoas nervosas com mais de 40 anos; 
	•	o número de pessoas calmas com menos de 18 anos.

 */

import java.util.Scanner;

public class Exercicio4LacoRepeticao {

	public static void main(String[] args) {

		int idade, sexo, temp, x=1, calm = 0, mn = 0, hag = 0, oc = 0, quaner = 0, qcalm = 0;

		Scanner leia = new Scanner(System.in);

		while (x<=5){
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("Digite: \n1-sexo feminino\n2-sexo masculino\n3-outros");
			sexo = leia.nextInt();

			System.out.println("Digite: \n1- se você se considera calmo;\n2-se você se considera nervoso;\n3-se você se considera agressivo.");
			temp = leia.nextInt();

			if (temp == 1)
			{
				calm++;
			}
			if (sexo == 1 && temp == 2)
			{
				mn++;
			}
			if (sexo == 2 && temp == 3)
				
			{
				hag++;
			}
			if (sexo == 3 && temp == 1)
			{
				oc++;
			}
			if (idade > 40 && temp == 2)
			{
				quaner++;
			}
			if (idade < 18 && temp == 1)
			{
				qcalm++;
			}
			
			x++;
		}
		System.out.println("\nA quantidade de pessoas calmas é: " + calm);
		System.out.println("\nA quantidade de mulheres nervosas é: " + mn);
		System.out.println("\nA quantidade de homens agressivos é: " + hag);
		System.out.println("\nA quantidade de outros calmos é: " + oc);
		System.out.println("\nA quantidade de pessoas nervosas com mais de 40 anos é: " + quaner);
		System.out.println("\nA quantidade de pessoas calmas com menos de 18 anos é: " + qcalm);
	}

}
