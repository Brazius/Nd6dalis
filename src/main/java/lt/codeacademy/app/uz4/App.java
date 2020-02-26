package lt.codeacademy.app.uz4;

public class App {
	Print print = new Print();
	Input input = new Input();
	MixMethod mix = new MixMethod();

	public void start() {
		print.pasisveikinimas();
		input.priskirkPirmaZodi();
		input.priskirkAntraZodi();
		print.atspausdinkAbuZodzius();
		mix.mixString();
	}

}
