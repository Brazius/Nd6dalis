package lt.codeacademy.app.uz1;

import java.util.Scanner;

public class Input {
	int x;
	Variables variables = new Variables();
	Scanner scanner = new Scanner(System.in);

	public void ivedimas() {
		variables.skaiciuIvedimas(x, scanner.nextInt());
		x++;
	}
}
