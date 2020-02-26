package lt.codeacademy.app.uz1;

public class PrimeNumber {
	static Variables v = new Variables();

	public void pirminiuSkaiciuSuradimas(int x) {
		int i = 0;
		int m = 0;
		int flag = 0;
		int n = x; // tikrinamas skaicius
		m = n / 2;
		
		if (n == 0 || n == 1) {
			System.out.println(n + " nėra pirminis skaičius");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " nėra pirminis skaičius");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " pirminis skaičius");
			}
		}
	}

}
