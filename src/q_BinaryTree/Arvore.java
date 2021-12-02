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

	//remover
	public boolean remover(TIPO valor) {
		
		//buscar o elemento na arvore
		Elemento<TIPO> atual = this.raiz;
		Elemento<TIPO> paiAtual = null;
		
		while(atual != null) { //se chegar no valor null = valor procurado nao existe na arvore
			
			if (atual.getValor().equals(valor)) {
				//se é igual, valor encontrado => remover
				break;
			
			} else if (valor.compareTo(atual.getValor()) == -1){ //valor procurado é menor que atual
				//se é menor, seguir para a esquerda
				paiAtual = atual;
				atual = atual.getEsquerda();				
			} else {
				paiAtual = atual;
				atual = atual.getDireita();
			}
			
			
		}
		
		//removendo
		if (atual != null) {
			
			//caso 1, 2 filhos / filho a dir
			if (atual.getDireita() != null ) {
				
				Elemento<TIPO> substituto = atual.getDireita();
				Elemento<TIPO> paiSubstituto = atual;
				
				while(substituto.getEsquerda() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsquerda();
				}
				
				if (paiAtual != null) {
					//removeu o elemento da arvore
					if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {//substituto < paiSubstituto
						paiSubstituto.setEsquerda(null);
					} else {
						paiSubstituto.setDireita(null);	
					}
				} else { //se nao tem pai atual, é  a raiz
					this.raiz = substituto;
				}
	
				
				//mexeu na arvore(substitui
				if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {//atual < pai atual
					paiAtual.setEsquerda(substituto);
				} else {
					paiAtual.setDireita(substituto);	
				}
				
				
			}
			
			//caso 2, 1 filho  a dir)

			else if (atual.getEsquerda() != null) {//tem filho so a esq
				Elemento<TIPO> substituto = atual.getEsquerda();
				Elemento<TIPO> paiSubstituto = atual;
				
				while(substituto.getDireita() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDireita();
				}
				
				if (paiAtual != null) {
					//removeu o elemento da arvore
					if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {//substituto < paiSubstituto
						paiSubstituto.setEsquerda(null);
					} else {
						paiSubstituto.setDireita(null);	
					}
				} else {
					this.raiz = substituto;
				}
	
				
				//mexeu na arvore(substitui
				if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {//atual < pai atual
					paiAtual.setEsquerda(substituto);
				} else {
					paiAtual.setDireita(substituto);	
				}
				
				
			}
			
			//caso 3, sem filhos
			else {
				
			if (paiAtual != null) {
				if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {//atual < pai atual
					paiAtual.setEsquerda(null);
				} else {
					paiAtual.setDireita(null);	
				}
			} else {
				this.raiz = null;
			}

			}
			
			
			
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	





	
}
