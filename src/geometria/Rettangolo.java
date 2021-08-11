package geometria;

public class Rettangolo extends Figura {
	
	private double base;
	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getArea() {
		return base * altezza;
	}

	public double getPerimetro() {
		return 2 * (base + altezza);
	}
	
	public String toString() {
		return "base = " + base + ", altezza = " + altezza;
	}
	
	public boolean equals(Rettangolo altro) {
		return altro != null && this.base == altro.base && this.altezza == altro.altezza;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Rettangolo) {
			return equals((Rettangolo) o);
		} else {
			return false;
		}
	}
}
