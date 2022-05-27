import java.util.Scanner;

public class exercicio1AOpercoesAritmeticas {
	public static void soma(float num1, float num2) {
		System.out.println("Soma: " + (num1+num2));
	}
	public static void subtracao(float num1, float num2) {
		System.out.println("Subtracao: " + (num1-num2));
	}
	public static void multiplicacao(float num1, float num2) {
		System.out.println("Multiplicacao: " + num1*num2);
	}
	public static void divisao(float num1, float num2) {
		System.out.println("Divisao: " + num1/num2);
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextFloat();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextFloat();
		
		soma(num1, num2);
		subtracao(num1, num2);
		multiplicacao(num1, num2);
		divisao(num1, num2);
	}

}
