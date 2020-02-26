package lt.codeacademy.app.uz1;

public class Variables {
	private static int[] masyvas = new int[2];
	private static int intervalas = 0;
	private static int[] pasirinktuSkaiciuMasyvas = new int[intervalas];
	
	
	public static int[] getPasirinktuSkaiciuMasyvas() {
		return pasirinktuSkaiciuMasyvas;
	}

	public int getMasyvoSkaiciu(int x) {
		return masyvas[x];
	}

	public int[] getMasyvas() {
		return masyvas;
	}

	public void setMasyvas(int[] masyvas) {
		this.masyvas = masyvas;
	}

	public void intervaloSuradimas() {
		this.intervalas = (masyvas[1] - masyvas[0]) + 1;
	}

	public void masyvoUzpildymasPagalIntervala() {
		int[] laikinas = new int[intervalas];
		int sk1 = masyvas[0];
		this.pasirinktuSkaiciuMasyvas = laikinas;

		for (int i = 0; i < laikinas.length; i++) {
			laikinas[i] = sk1++;
		}
	}

	public void skaiciuIvedimas(int x, int nextInt) {
		this.masyvas[x] = nextInt;

	}

}
