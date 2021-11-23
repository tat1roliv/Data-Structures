package e_LinkedList_Vs_Vector.copy;

import java.util.ArrayList;

public class Comparacao {

	public static void main(String[] args) {
	
		ListaLigada<Integer> lista = new ListaLigada<Integer>();
		
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		//adicionar elementos
		int limite = 1000000;//qt elementos
		long tempoInicial = System.currentTimeMillis();//captura tempoInicial em mls
		long tempoFinal; 
		
		for (int i = 0; i < limite; i++) {
			vetor.add(1);
		}
		
	    tempoFinal = System.currentTimeMillis();//captura tempoFinal em mls
	    
	    System.out.println(tempoFinal-tempoInicial);
	    
		long tempoInicial2 = System.currentTimeMillis();//captura tempoInicial em mls
		long tempoFinal2; 
		
		for (int i = 0; i < limite; i++) {
			lista.adicionar(1);;
		}
		
	    tempoFinal2 = System.currentTimeMillis();//captura tempoFinal em mls
	    
	    System.out.println(tempoFinal2-tempoInicial2);
		
	    

	}

}
