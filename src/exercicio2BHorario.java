import java.util.Scanner;

public class exercicio2BHorario {
	public static void verificaHorario(int horas) {
		if(horas > 5 && horas < 12) 
			System.out.println("Bom dia!");
		else if(horas >= 11 && horas < 18) 
			System.out.println("Boa tarde!");
		else
			System.out.println("Boa noite!");
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int horas;
		
		System.out.println("Digite um horario (ex. 12 ou 3):");
		horas = ler.nextInt();
		
		verificaHorario(horas);
	}

}
