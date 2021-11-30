package q_BinaryTree;

public class Main {

	public static void main(String[] args) {
		
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(10);//raiz
		arvore.adicionar(5);//no esq
		arvore.adicionar(15);//no dir
		
		System.out.println("arvore na memoria");
		System.out.println(arvore);
		
		System.out.println("\narvore emOrdem com 3 elementos =>  menorEsq -> raiz -> maiorDir");
		arvore.emOrdem(arvore.getRaiz());//a partir da raiz, em ordem na esq e depois em ordem na dir
		
		System.out.println("\narvore PreOrdem com 3 elementos =>  raiz -> menorEsq -> maiorDir");
		arvore.preOrdem(arvore.getRaiz());
		
		System.out.println("\narvore PosOrdem com 3 elementos => menorEsq -> maiorDir -> raiz");
		arvore.posOrdem(arvore.getRaiz());
		
		arvore.adicionar(8);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(23);
		
		System.out.println("\narvore emOrdem com n elementos");
		arvore.emOrdem(arvore.getRaiz());
		
		System.out.println("\narvore PreOrdem com n elementos");
		arvore.preOrdem(arvore.getRaiz());
		
		System.out.println("\narvore PosOrdem com n elementos");
		arvore.posOrdem(arvore.getRaiz());
	}

}
