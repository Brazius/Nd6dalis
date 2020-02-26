package lt.codeacademy.app.uz2miegas;

import java.util.Scanner;

public class Input {
	Scanner scanner = new Scanner(System.in);
	Variable variable = new Variable();

	public void pasirinkimas() {
		int x = scanner.nextInt();
		variable.setPasirinkimas(x);
		while (true) {
			if (x<= 0||x>7) {
				System.out.println("blogas pasirinikimas");
				break;
			} else {
				break;
			}
		}

	}

}
