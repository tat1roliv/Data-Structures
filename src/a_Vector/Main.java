package a_Vector;

public class Main {

	public static void main(String[] args) {
		
		int[] vetorzao = new int[10];
		System.out.println(vetorzao);//hash code (referencia na memoria)
		
		vetorzao[0] = 3;
		vetorzao[1] = 4;
		vetorzao[2] = 8;
		vetorzao[3] = 13;
		vetorzao[4] = 22;
		vetorzao[5] = 52;
		vetorzao[6] = 33;
		
		System.out.print("Imprimindo a primeira posi��o: ");
		System.out.print(vetorzao[0] + "\n");
		
		System.out.print("Imprimindo uma posi��o n�o preenchida: ");
		System.out.print(vetorzao[8] + "\n");//saida = 0 (ao criar o vetor de numeros inteiros/double, iniciaaliza todas as posi��es com 0)
		
		System.out.print("Imprimindo todas as posi��es do vetor : \n [ ");
		
		for (int i = 0; i < vetorzao.length; i++) { //<= exception
			System.out.print(vetorzao[i] + "  ");	
		}
		
		System.out.print("]");
		
		
		
		
		
		
		

	}

}
