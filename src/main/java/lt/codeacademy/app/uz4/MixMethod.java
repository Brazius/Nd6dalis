package lt.codeacademy.app.uz4;

public class MixMethod {
	private static String s1;
	private static String s2;
	private static String mixTxt;

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public void mixString() {
		int x = (s1.length() + s2.length());
		System.out.print("Sulietas žodis: ");
		for (int i = 0; i < x; i++) {
			if (i < s1.length()) {
				System.out.print(s1.charAt(i));
			} else {
				System.out.print("");
			}
			if (i < s2.length()) {
				System.out.print(s2.charAt(i));
			} else {
				System.out.print("");
			}
		}

	}
}
