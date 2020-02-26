package lt.codeacademy.app.uz2miegas;

public class Print {
	Input input = new Input();
	Variable variable = new Variable();

	public void hello() {
		System.out.println("Sveiki atvyke i miego programa");

	}

	public void printSelectDay() {
		System.out.println("Pasirinkite savaites diena:");
		System.out.println("1 - Pirmadienis");
		System.out.println("2 - Antradienis");
		System.out.println("3 - Trečiadienis");
		System.out.println("4 - Ketvirtadienis");
		System.out.println("5 - Penktadienis");
		System.out.println("6 - Šeštadienis");
		System.out.println("7 - Sekmadienis");

	}

	public void pasirinkimoSk() {
		int x = variable.getPasirinkimas();
		System.out.println(x);

	}

}
