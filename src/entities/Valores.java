package entities;

public class Valores {

	private Double Valor_Real_1 = 0.0;
	private Double Valor_Aproximado_1 = 0.0;
	private Double Valor_Real_2 = 0.0;
	private Double Valor_Aproximado_2 = 0.0;

	public Valores() {

	}

	public Valores(Double Valor_Real_1, Double Valor_Aproximado_1, Double Valor_Real_2, Double Valor_Aproximado_2) {
		this.Valor_Real_1 = Valor_Real_1;
		this.Valor_Aproximado_1 = Valor_Aproximado_1;
		this.Valor_Real_2 = Valor_Real_2;
		this.Valor_Aproximado_2 = Valor_Aproximado_2;
	}

	public Double getValor_Real_1() {
		return Valor_Real_1;
	}

	public void setValor_Real_1(Double valor_Real_1) {
		Valor_Real_1 = valor_Real_1;
	}

	public Double getValor_Aproximado_1() {
		return Valor_Aproximado_1;
	}

	public void setValor_Aproximado_1(Double valor_Aproximado_1) {
		Valor_Aproximado_1 = valor_Aproximado_1;
	}

	public Double getValor_Real_2() {
		return Valor_Real_2;
	}

	public void setValor_Real_2(Double valor_Real_2) {
		Valor_Real_2 = valor_Real_2;
	}

	public Double getValor_Aproximado_2() {
		return Valor_Aproximado_2;
	}

	public void setValor_Aproximado_2(Double valor_Aproximado_2) {
		Valor_Aproximado_2 = valor_Aproximado_2;
	}

	public Double Erro_Absoluto_1(Double Valor_Aproximado_1, Double Valor_Real_1) { // ERRO ABSOLUTO 1

		if (((Valor_Aproximado_1 - Valor_Real_1)) < 0) {
			return ((Valor_Real_1 - Valor_Aproximado_1)) * -1;
		} else {
			return (Valor_Real_1 - Valor_Aproximado_1);
		}

	}

	public Double Erro_Absoluto_2(Double Valor_Aproximado_2, Double Valor_Real_2) { // ERRO ABSOLUTO 2

		if (((Valor_Real_2 - Valor_Aproximado_2)) < 0) {
			return ((Valor_Real_2 - Valor_Aproximado_2)) * -1;
		} else {
			return (Valor_Real_2 - Valor_Aproximado_2);
		}

	}

	public Double Erro_Relativo_1(Double Valor_Aproximado_1, Double Valor_Real_1) { // ERRO RELATIVO 1

		if (((Erro_Absoluto_1(Valor_Aproximado_1, Valor_Real_1)) / Valor_Aproximado_1) < 0) {
			return ((Erro_Absoluto_1(Valor_Aproximado_1, Valor_Real_1)) / Valor_Aproximado_1) * -1;
		} else {
			return (Erro_Absoluto_1(Valor_Aproximado_1, Valor_Real_1)) / Valor_Aproximado_1;
		}

	}

	public Double Erro_Relativo_2(Double Valor_Aproximado_2, Double Valor_Real_2) { // ERRO RELATIVO 2

		if (((Erro_Absoluto_2(Valor_Aproximado_2, Valor_Real_2)) / Valor_Aproximado_2) < 0) {
			return ((Erro_Absoluto_2(Valor_Aproximado_2, Valor_Real_2)) / Valor_Aproximado_2) * -1;
		} else {
			return (Erro_Absoluto_2(Valor_Aproximado_2, Valor_Real_2)) / Valor_Aproximado_2;
		}
	}

	public Double Soma_Erros_Relativos(Double Valor_Aproximado_1, Double Valor_Aproximado_2, Double Valor_Real_2,
			Double Valor_Real_1) { // SOMA

		System.out.println("X = " + Valor_Aproximado_1 + " / " + Valor_Aproximado_1 + " + " + Valor_Aproximado_2 + " * "
				+ String.format("%.3f", Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1)) + " + " + Valor_Aproximado_2
				+ " / " + Valor_Aproximado_2 + " + " + Valor_Aproximado_1 + " * "
				+ String.format("%.3f", Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2)));

		System.out.println("X = "
				+ String.format("%.3f",
						Valor_Aproximado_1 / (Valor_Aproximado_1 + Valor_Aproximado_2)
								* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
				+ " + " + String.format("%.3f", Valor_Aproximado_2 / (Valor_Aproximado_2 + Valor_Aproximado_1)
						* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2)));
		System.out.println("X = " + String.format("%.3f",
				((Valor_Aproximado_1 / (Valor_Aproximado_1 + Valor_Aproximado_2))
						* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
						+ ((Valor_Aproximado_2 / (Valor_Aproximado_1 + Valor_Aproximado_2))
								* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2))));

		return (((Valor_Aproximado_1 / (Valor_Aproximado_1 + Valor_Aproximado_2))
				* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
				+ ((Valor_Aproximado_2 / (Valor_Aproximado_1 + Valor_Aproximado_2))
						* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2)));

	}

	public Double Subtracao_Erros_Relativos(Double Valor_Aproximado_1, Double Valor_Aproximado_2, Double Valor_Real_2,
			Double Valor_Real_1) { // SUBTRAÇÃO

		System.out.println("X = " + Valor_Aproximado_1 + " / " + Valor_Aproximado_1 + " - " + Valor_Aproximado_2 + " * "
				+ String.format("%.3f", Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1)) + " - " + Valor_Aproximado_2
				+ " / " + Valor_Aproximado_2 + " - " + Valor_Aproximado_1 + " * "
				+ String.format("%.3f", Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2)));

		System.out.println("X = "
				+ String.format("%.3f",
						Valor_Aproximado_1 / (Valor_Aproximado_1 - Valor_Aproximado_2)
								* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
				+ " - " + String.format("%.3f", Valor_Aproximado_2 / (Valor_Aproximado_2 - Valor_Aproximado_1)
						* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2)));

		if ((((Valor_Aproximado_1 / (Valor_Aproximado_1 - Valor_Aproximado_2))
				* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
				- ((Valor_Aproximado_2 / (Valor_Aproximado_1 - Valor_Aproximado_2))
						* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2)) < 0)) {

			System.out.println("X = " + String.format("%.3f",
					(((Valor_Aproximado_1 / (Valor_Aproximado_1 - Valor_Aproximado_2))
							* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
							- ((Valor_Aproximado_2 / (Valor_Aproximado_1 - Valor_Aproximado_2))
									* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2)))
							* -1));
		} else {

			System.out.println("X = " + String.format("%.3f",
					((Valor_Aproximado_1 / (Valor_Aproximado_1 - Valor_Aproximado_2))
							* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
							- ((Valor_Aproximado_2 / (Valor_Aproximado_1 - Valor_Aproximado_2))
									* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2))));

		}

		if (((Valor_Aproximado_1 / (Valor_Aproximado_1 - Valor_Aproximado_2))
				* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
				- ((Valor_Aproximado_2 / (Valor_Aproximado_1 - Valor_Aproximado_2))
						* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2)) < 0) {

			return (((Valor_Aproximado_1 / (Valor_Aproximado_1 - Valor_Aproximado_2))
					* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
					- ((Valor_Aproximado_2 / (Valor_Aproximado_1 - Valor_Aproximado_2))
							* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2)))
					* -1;

		} else {

			return ((Valor_Aproximado_1 / (Valor_Aproximado_1 - Valor_Aproximado_2))
					* Erro_Relativo_1(Valor_Aproximado_1, Valor_Real_1))
					- ((Valor_Aproximado_2 / (Valor_Aproximado_1 - Valor_Aproximado_2))
							* Erro_Relativo_2(Valor_Aproximado_2, Valor_Real_2));
		}

	}

	public Double Multiplicacao_Erros_Relativos(Double Valor_Aproximado_1, Double Valor_Real_1,
			Double Valor_Aproximado_2, Double Valor_Real_2) { // MULTIPLICAÇÃO

		return Erro_Relativo_2(Valor_Aproximado_1, Valor_Real_1) + Erro_Relativo_1(Valor_Aproximado_2, Valor_Real_2);
	}

	public Double Divisao_Erros_Relativos(Double Valor_Aproximado_1, Double Valor_Real_1, Double Valor_Aproximado_2,
			Double Valor_Real_2) { // DIVISÃO

		return Erro_Relativo_1(Valor_Aproximado_2, Valor_Real_2) - Erro_Relativo_2(Valor_Aproximado_1, Valor_Real_1);

	}

}
