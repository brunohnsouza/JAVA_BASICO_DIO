package whileExercicio;
import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nota;
		
		while(true) {
			System.out.print("Digite uma nota [0 - 10]: ");
			nota = scanner.nextInt();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida! Tente novamente.");
				continue;
			}
		}
	}

}
