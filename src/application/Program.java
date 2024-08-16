package application;

import java.util.Scanner;
import entities.Valores;

public class Program {
	public static void main(String[] args) {

		/*
		 * Valor real a = 2,1 Valor aproximado a = 2 Valor real b = 3,06 Valor
		 * aproximado b = 3 erro relativo 1 = 0,05 erro relativo 2 = 0,02
		 */

		Scanner sc = new Scanner(System.in);

		Double Valor_Real_1;
		Double Valor_Aproximado_1;
		Double Valor_Real_2;
		Double Valor_Aproximado_2;

		Valores valores = new Valores();

		System.out.println("Bem vindo ao programa de cálculo de erros!");
		System.out.println();
		System.out.println("Escolha a operação:");
		System.out.println("(1)Soma de Erro de Relativo");
		System.out.println("(2)Subtração de Erro Relativo");
		System.out.println("(3)Multiplicação de Erro Relativo");
		System.out.println("(4)Divisão de Erro Relativo");
		System.out.println("(5)Calculo de Erro Relativo");
		System.out.println("(6)Calculo de Erro Absoluto");
		System.out.println("(0)Sair");

		int operacao = sc.nextInt();

		System.out.println();

		while (operacao != 0) {

			switch (operacao) {

			case 1:

				System.out.println("Digite o valor Real a: ");
				Valor_Real_1 = sc.nextDouble();
				System.out.println("Digite o valor aproximado a: ");
				Valor_Aproximado_1 = sc.nextDouble();
				System.out.println("Digite o valor Real b: ");
				Valor_Real_2 = sc.nextDouble();
				System.out.println("Digite o valor aproximado b: ");
				Valor_Aproximado_2 = sc.nextDouble();

				System.out.println("O valor da soma dos Erros de Relativos é: " + String.format("%.3f", valores
						.Soma_Erros_Relativos(Valor_Aproximado_1, Valor_Aproximado_2, Valor_Real_2, Valor_Real_1)));

				break;
			case 2:

				System.out.println("Digite o valor Real a: ");
				Valor_Real_1 = sc.nextDouble();
				System.out.println("Digite o valor aproximado a: ");
				Valor_Aproximado_1 = sc.nextDouble();
				System.out.println("Digite o valor Real b: ");
				Valor_Real_2 = sc.nextDouble();
				System.out.println("Digite o valor aproximado b: ");
				Valor_Aproximado_2 = sc.nextDouble();

				System.out.println("O valor da subtração dos Erros de Relativos é: "
						+ String.format("%.3f", valores.Subtracao_Erros_Relativos(Valor_Aproximado_1,
								Valor_Aproximado_2, Valor_Real_2, Valor_Real_1)));

				break;
			case 3:

				System.out.println("Digite o valor Real a: ");
				Valor_Real_1 = sc.nextDouble();
				System.out.println("Digite o valor aproximado a: ");
				Valor_Aproximado_1 = sc.nextDouble();
				System.out.println("Digite o valor Real b: ");
				Valor_Real_2 = sc.nextDouble();
				System.out.println("Digite o valor aproximado b: ");
				Valor_Aproximado_2 = sc.nextDouble();

				System.out.println("O valor da multiplicação dos Erros de Relativos é: "
						+ String.format("%.3f", valores.Multiplicacao_Erros_Relativos(Valor_Aproximado_1,
								Valor_Aproximado_2, Valor_Real_2, Valor_Real_1)));

				break;
			case 4:

				System.out.println("Digite o valor Real a: ");
				Valor_Real_1 = sc.nextDouble();
				System.out.println("Digite o valor aproximado a: ");
				Valor_Aproximado_1 = sc.nextDouble();
				System.out.println("Digite o valor Real b: ");
				Valor_Real_2 = sc.nextDouble();
				System.out.println("Digite o valor aproximado b: ");
				Valor_Aproximado_2 = sc.nextDouble();

				System.out.println("O valor da multiplicação dos Erros de Relativos é: " + String.format("%.3f", valores
						.Divisao_Erros_Relativos(Valor_Aproximado_1, Valor_Aproximado_2, Valor_Real_2, Valor_Real_1)));

				break;
			case 5:

				System.out.println("Digite o valor Real: ");
				Valor_Real_1 = sc.nextDouble();
				System.out.println("Digite o valor aproximado: ");
				Valor_Aproximado_1 = sc.nextDouble();

				System.out.println("O valor do Erro Relativo é: "
						+ String.format("%.3f", valores.Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1)));

				break;

			case 6:

				System.out.println("Digite o valor Real: ");
				Valor_Real_1 = sc.nextDouble();
				System.out.println("Digite o valor aproximado: ");
				Valor_Aproximado_1 = sc.nextDouble();

				System.out.println("O valor do erro absoluto é: "
						+ String.format("%.3f", valores.Erro_Absoluto_1(Valor_Aproximado_1, Valor_Real_1)));

				break;
			}
			System.out.println();
			System.out.println("Escolha a proxima operação:");
			System.out.println("(1)Soma de Erro de Relativo");
			System.out.println("(2)Subtração de Erro Relativo");
			System.out.println("(3)Multiplicação de Erro Relativo");
			System.out.println("(4)Divisão de Erro Relativo");
			System.out.println("(5)Calculo de Erro Relativo");
			System.out.println("(0)Sair");

			operacao = sc.nextInt();
			
		}

		sc.close();
	}

}