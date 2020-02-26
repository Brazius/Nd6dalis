package lt.codeacademy.app.uz2miegas;

public class MainMethods {
	Print print = new Print();
	Input input = new Input();
	
	public void start() {
		print.hello();
		selectDay();
		print.pasirinkimoSk();
	}

	private void selectDay() {
		print.printSelectDay();
		input.pasirinkimas();
	}

}
