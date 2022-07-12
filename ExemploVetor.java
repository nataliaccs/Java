package VetoreMatriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		int vetor[] = new int [6];
		int vetor1[] = {1,2,3,4,5};
		
	//	System.out.println(vetor1[0]);
	//	System.out.println(vetor1[4]);
		
		Scanner leia = new Scanner (System.in);
		
		vetor1[3]=19;
		
		for(int indice=0;indice<5;indice++)
		{
			System.out.print(vetor1[indice]+"\t");
		}
		
		System.out.println();
		
		
		for(int indice=0;indice<6;indice++)
		{
			System.out.print("\nDigite uma idade: ");
			vetor[indice]=leia.nextInt();
		}
		
		System.out.println("\nAs idades informadas foram: ");
		
		for(int indice=0;indice<6;indice++)
		{
			System.out.print(vetor[indice]+"\t");
		}
	}

}
