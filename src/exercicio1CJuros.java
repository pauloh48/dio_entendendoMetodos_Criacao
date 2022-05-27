import java.util.Scanner;

public class exercicio1CJuros {
	public static void calculaEmprestimo(float valorEmprestimo, float juros, int tempo) {
		System.out.printf("O valor final do emprestimo eh de: %.2f\n", (valorEmprestimo*Math.pow((1+juros),tempo)));
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float valorEmprestimo, juros;
		int tempo;
		
		System.out.println("Quanto vc quer de emprestimo: ");
		valorEmprestimo = ler.nextFloat();
		
		System.out.println("Qual a taxa de juros: ");
		juros = ler.nextFloat();
		
		System.out.println("Em quantos meses sera pago o emprestimo: ");
		tempo = ler.nextInt();
		
		calculaEmprestimo(valorEmprestimo, juros, tempo);
	}

}
