package q_BinaryTree;

public class Arvore<TIPO extends Comparable> {//ext a clase para usar o metodo CompareTo
	
	private Elemento<TIPO> raiz;
	
	public Arvore() {
		this.raiz = null; //start vazia
	}
		
	
	//adicionar
	public void adicionar(TIPO valor) {
		
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
		if (raiz == null) {
			this.raiz = novoElemento;		
		} else {	
			Elemento<TIPO> atual = this.raiz;	
			while(true) {			
				if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {//retorna -1 menor|| 0 igual|| 1 maior				
					if (atual.getEsquerda() != null) {
						atual = atual.getEsquerda();				
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}			
				} else {
					if (atual.getDireita() != null) {
						atual = atual.getDireita();					
					} else {
						atual.setDireita(novoElemento);
						break;
					}				
				}				
				
			}
					
		}
					
	}
	
	//get Raiz
	public Elemento<TIPO> getRaiz() {
		return raiz;
	}
	
	//em ordem => menorEsq -> raiz -> maiorDir
	public void emOrdem(Elemento<TIPO> atual) {
				
		if ( atual != null ) {
			emOrdem(atual.getEsquerda());
			System.out.println( atual.getValor());
			emOrdem(atual.getDireita());
		}	
		
	}

	//pre-ordem =>  raiz -> menorEsq -> maiorDir
	public void preOrdem(Elemento<TIPO> atual) {
		
		if ( atual != null ) {	
			System.out.println( atual.getValor());
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());
		}
	}

	//pos-ordem =>  menorEsq -> maiorDir -> raiz 
	public void posOrdem(Elemento<TIPO> atual) {
		
		if ( atual != null ) {	
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.println( atual.getValor());
		}
		
	}
	
	
	





	
}
