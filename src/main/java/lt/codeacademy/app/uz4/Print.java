package lt.codeacademy.app.uz4;

public class Print {
	MixMethod mix = new MixMethod();

	public void pasisveikinimas() {
		System.out.println("Raidžių maišymo programa");

	}

	public void iveskPirmaZodi() {
		System.out.println("Iveskite pirma žodį");

	}

	public void iveskAntraZodi() {
		System.out.println("Iveskite antra žodį");

	}

	public void atspausdinkAbuZodzius() {
		System.out.println("Įvestas pirmas žodis: " + mix.getS1());
		System.out.println("Įvestas antras žodis: " + mix.getS2());
	}
}
