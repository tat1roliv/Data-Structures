package f_Iterator_LinkedList.copy;

import java.util.ArrayList;

public class Comparacao {

	public static void main(String[] args) {
	
		ListaLigada<Integer> lista = new ListaLigada<Integer>();
		
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		//adicionar elementos (tempo)
		int limite = 100000;//qt elementos
		long tempoInicial = System.currentTimeMillis();//captura tempoInicial em mls
		long tempoFinal; 
		
		for (int i = 0; i < limite; i++) {
			vetor.add(1);
		}
		
	    tempoFinal = System.currentTimeMillis();//captura tempoFinal em mls
	    
	    System.out.println("Tempo (s) para adicionar 1000000 elementos");
	    System.out.println("Vetor: " + (tempoFinal-tempoInicial));
	    
		long tempoInicial2 = System.currentTimeMillis();//captura tempoInicial em mls
		long tempoFinal2; 
		
		for (int i = 0; i < limite; i++) {
			lista.adicionar(1);;
		}
		
	    tempoFinal2 = System.currentTimeMillis();//captura tempoFinal em mls
	    
	    System.out.println("Lista: " + (tempoFinal2-tempoInicial2));
	    
	    
	    //ler valores
	    tempoInicial = System.currentTimeMillis();
	    for (int i=0; i < vetor.size(); i++) {
	    	vetor.get(i);
	    }
	    
	    tempoFinal = System.currentTimeMillis();
	    System.out.println("Tempo leitura vetor: " + (tempoFinal-tempoInicial));
	    
	    tempoInicial2 = System.currentTimeMillis();
	    for (int i=0; i < lista.getTamanho(); i++) {
	    	lista.get(i);
	    }
	      
	    tempoFinal2 = System.currentTimeMillis();
	    System.out.println("Tempo leitura lista: " + (tempoFinal2-tempoInicial2));
	    
	    
	    long tempoInicial3 = System.currentTimeMillis();//captura tempoInicial em mls
		long tempoFinal3; 
		
		IteratorListaLigada<Integer> iterator = lista.getIterator();
		
		while (iterator.temProximo()) {
			iterator.getProximo();
		}
		
	    tempoFinal3 = System.currentTimeMillis();
	    System.out.println("Tempo leitura lista com iterator: " + (tempoFinal3-tempoInicial3));
	    

	}

}
