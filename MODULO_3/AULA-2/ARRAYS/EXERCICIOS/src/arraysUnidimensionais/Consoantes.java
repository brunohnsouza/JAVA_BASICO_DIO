package arraysUnidimensionais;
import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		
		int qtdeConsoantes = 0;
		int qtdeVogais = 0;
		
		int count = 0;
		do {
			System.out.print("Digite uma letra [a-z]: ");
			String letra = leitor.next().toUpperCase();
			
			if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))) {
				consoantes[count] = letra;
				qtdeConsoantes++;
			} else {
				qtdeVogais++;
			}
			
			count++;
		} while (count <= (consoantes.length - 1));
		
		System.out.print("\n" + "Vetor: " + "[ ");
		for (String indice : consoantes) {
			
			if (indice != null) System.out.print(indice + " ");
			
		}
		System.out.print("]");
		
		System.out.println("\n" + "Consoantes: " + qtdeConsoantes);
		System.out.println("Vogais: " + qtdeVogais);
		
		leitor.close();
	}

}