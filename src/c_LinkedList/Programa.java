package c_LinkedList;

public class Programa {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		System.out.println("Tamanho: " + lista.getTamanho());
		
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(2).getValor());
	
	}
}
