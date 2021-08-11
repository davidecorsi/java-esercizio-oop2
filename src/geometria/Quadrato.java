package geometria;

import exception.QuadratoException;

public class Quadrato extends Rettangolo {

	public Quadrato(double lato) {
		super(lato, lato);
		if(lato < 0) {
			throw new QuadratoException("Il lato deve essere superiore a 0");
		}
	}
	
	public double getLato() {
		return getBase();
	}
	
	public void setLato(double lato) {
		setBase(lato);
		setAltezza(lato);
	}
	
	public String toString() {
		return "lato = " + getLato();
	}
	
	public void setBase(double lato) {
		setLato(lato);
	}
	
	public void setAltezza(double lato) {
		setLato(lato);
	}
}
