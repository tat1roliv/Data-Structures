package e_LinkedList_Vs_Vector.copy;

public class ProgramaInteiros {
	
	public static void main(String[] args) {
		
		ListaLigada<Integer> numeros = new ListaLigada<Integer>();
		numeros.adicionar(4);
		numeros.adicionar(5);
		numeros.adicionar(3);
		
		System.out.println("\n  lista:");
		for(int i=0; i< numeros.getTamanho(); i++ ) {
			System.out.print( numeros.get(i).getValor() + " ");
		}
		
	}

}
