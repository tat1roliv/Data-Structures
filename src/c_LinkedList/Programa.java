package c_LinkedList;

public class Programa {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		System.out.println("Tamanho: " + lista.getTamanho());
		
		
		lista.adicionar("AC");//add elemento na lista vazia
		lista.adicionar("BA");//add elemento lista ja ocupada
		lista.adicionar("CE");
		lista.adicionar("DF");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(2).getValor());
		
		for(int i=0; i< lista.getTamanho(); i++ ) {
			System.out.print(lista.get(i).getValor()+ " ");
		}
		
		lista.remover("DF"); //remover elemento meio da lista
		
		System.out.println("\n removendo elemento do meio da lista : ");
		for(int i=0; i< lista.getTamanho(); i++ ) {
			System.out.print( lista.get(i).getValor() + " ");
		}
		
		lista.adicionar("SP");
		
		System.out.println("\n  add estado :");
		for(int i=0; i< lista.getTamanho(); i++ ) {
			System.out.print( lista.get(i).getValor() + " ");
		}
	
	}
}
