package geometria;

public abstract class Figura implements Comparable<Figura> {

	public abstract double getArea();

	public abstract double getPerimetro();

	public boolean haAreaMaggiore(Figura altra) { // metodo concreto
	}

	public boolean haPerimetroMaggiore(Figura altra) { // metodo concreto
	}

	public int compareTo(Figura f) { // metodo concreto
	}
}
