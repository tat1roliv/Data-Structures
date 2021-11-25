package h_BinarySearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] vetor = new int[8];
		
		System.out.print("vetor: ");
		
		for ( int i=0; i<vetor.length;i++) {	
			vetor[i]= i*2;
			System.out.print(vetor[i] + " ");
	
		}
		
		
		System.out.println("\ninforme o numero buscado: ");
		Scanner leitor = new Scanner(System.in);
		int buscado = leitor.nextInt();
		
		
		boolean achou = false;
		
		int inicio = 0;
		int fim = vetor.length-1;
		int meio;
		
		while(inicio <= fim) {
			
			meio = (int) ( inicio + fim ) / 2 ;//casting
			
			if (vetor[meio] == buscado) { 
				achou = true;
				break;
			}
			
			else if (vetor[meio] < buscado) {
				inicio = meio + 1;
			} else { //maior
				fim = meio - 1 ;
			}
			
		}
		
		if (achou) {
			System.out.println("achou");
		} else {
			System.out.println("nao encontrado");
		}
			
		
	}

}
