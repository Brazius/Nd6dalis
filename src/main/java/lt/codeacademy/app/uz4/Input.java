package lt.codeacademy.app.uz4;

import java.util.Scanner;

public class Input {
	Print print = new Print();
	MixMethod mix = new MixMethod();
	Scanner scanner = new Scanner(System.in);

	public void priskirkPirmaZodi() {
		print.iveskPirmaZodi();
		String s1 = scanner.nextLine();
		mix.setS1(s1);

	}

	public void priskirkAntraZodi() {
		print.iveskAntraZodi();
		String s2 = scanner.nextLine();
		mix.setS2(s2);
	}
}
