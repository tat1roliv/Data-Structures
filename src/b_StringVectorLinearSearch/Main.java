package b_StringVectorLinearSearch;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String[] estados = new String[10];
		
		estados[0] = "AC";
		estados[1] = "BA";
		estados[2] = "CE";
		estados[3] = "DF";
		estados[4] = "AM";
		estados[5] = "AP";
		estados[6] = "PB";
		estados[7] = "RN";
		estados[8] = "MS";
		estados[9] = "XX";
		
		for (int i = 0; i < estados.length; i++) {
			System.out.println("Estado " + i + " : "+ estados[i]);
		}
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a siga do estado para a busca: ");
		String siglaBusca = leitor.nextLine(); 
		
		/*
		busca linear => varredura no vetor da primeira à ultima posição
		como faz a busca posição por posição, tem-se um custo computacional alto para sua execução
		(notacao big o)
		*/
		
		boolean encontrou = false;
		
		for (int i = 0; i < estados.length; i++) {
			String elemento = estados[i];
			
			if (elemento.equalsIgnoreCase(siglaBusca)) { //ignora a distincao entre maiscculas e minusculas
				encontrou = true;
				break;
			}
			
		}
		
		if (encontrou == true) {
			System.out.println("Valor encontrado");
		} else {
			System.out.println("valor não encontrado");
		}
		
	
	}

}
