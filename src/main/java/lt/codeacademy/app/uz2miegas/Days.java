package lt.codeacademy.app.uz2miegas;

public enum Days {
	PIRMADIENIS(true),
	ANTRADIENIS(true), 
	TREČIADIENIS(true),
	KETVIRTADIENIS(true),
	PEKTADIENIS(true),
	ŠEŠTADIENIS(true),
	SEKMADIENIS(true);

	private final boolean days;
	private final boolean atostogos = true;

	Days(boolean busena) {
		days = busena;
	}

	public boolean days() {
		return days;
	}

	public boolean atostogos() {
		return atostogos;
	}
}
