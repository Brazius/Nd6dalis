package lt.codeacademy.app.uz1;

import java.util.Arrays;

public class App {
	static Print print = new Print();
	static Variables variables = new Variables();
	static Input input = new Input();
	static PrimeNumber prime = new PrimeNumber();

	public static void start() {
		print.pasisveikinimas();
		pasirinkimas();

	}

	private static void pasirinkimas() {
		print.pasirinkimas1();
		input.ivedimas();
		print.pasirinkimas2();
		input.ivedimas();
		variables.intervaloSuradimas();
		variables.masyvoUzpildymasPagalIntervala();
		primeInteger();
	}

	private static void primeInteger() {
		System.out.println(Arrays.toString(Variables.getPasirinktuSkaiciuMasyvas()));

		int[] arr = Variables.getPasirinktuSkaiciuMasyvas();
		for (int i = 0; i < arr.length; i++) {
			prime.pirminiuSkaiciuSuradimas(arr[i]);
		}

	}
}
