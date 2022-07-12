package VetoreMatriz;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int[] arrayUm = {1,2,3,4,5,6,7,8,9,10,11};
		int[] arrayDois = {11,22,33,44,55,66,77,88};
		
		float[] nota=new float[5];
		
		//tamanho do array
		if(arrayDois.length > 8)
		{
			System.out.println("Tamanho do ArrayDois é maior que 8!");
		}
		else
		{
			System.out.println("Tamanho do ArrayDois é menor que 8!");
		}
		System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
	
		System.out.println();
		//utilização do for-each
		String[] cars = {"volvo","Gol","Fiat","Ford"};
		
		for (String i : cars)
		{
			System.out.println(i);
		}
		
		
		System.out.println();
		
		//populando um array
		for(int i=0;i<5;i++)
		{
			System.out.println("Entre com uma nota: ");
			nota[i] = ler.nextFloat();
		}
		//apresentando um array
		for(int i=0;i<5;i++)
		{
			System.out.println("Nota = "+nota[i]);
		}
		
		
		
		
	}

}
