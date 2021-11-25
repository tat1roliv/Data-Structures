package g_LinearSearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] vetor = new int[8];
		
		for ( int i=0; i < vetor.length; i++) {
			vetor[i] = (int) ( Math.random() * 1000 );//conversao de cast
			System.out.println(vetor[i]);
		}
		
		System.out.println("qual numero buscar?");
		Scanner leitor = new Scanner(System.in);
		int buscado = leitor.nextInt();
		
		boolean achou = false;
		
		for ( int i=0; i < vetor.length; i++) {
			if (vetor[i] == buscado) {
				achou = true;
				break;
			}
		}
		
		if(achou) {
			System.out.println("achou");
		} else {
			System.out.println("não achou");
		}
		
		
		
		
		

	}

}
