package f_Iterator_LinkedList.copy;

public class IteratorListaLigada<TIPO> {
	
	private Elemento<TIPO> elemento;
	
	public IteratorListaLigada(Elemento<TIPO> atual) {
		this.elemento = atual;
	}

	public boolean temProximo() {
		if (elemento.getProximo() == null) {
			return false;
		}
		return true;
	}
	
	public Elemento<TIPO> getProximo(){
		elemento = elemento.getProximo();
		return elemento;
	}
	
	
	

}
