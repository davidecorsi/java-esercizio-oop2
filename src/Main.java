/*
 Completare le classi nel package geometria. L'ordinamento deve essere dall'area più piccola alla più grande.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import geometria.Figura;
import geometria.Quadrato;
import geometria.Rettangolo;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Figura> figuraList = new ArrayList();
		int n;
		do {
			System.out.println("Menu'");
			System.out.println("1 - Inserire Rettangolo");
			System.out.println("2 - Inserire Quadrato");
			System.out.println("0 - Uscire");
			n = input.nextInt();
			switch (n) {
				case 1:
					System.out.print("Inserire base Rettangolo ");
					double base = input.nextDouble();
					System.out.print("Inserire altezza Rettangolo ");
					double altezza = input.nextDouble();
					Figura f1 = new Rettangolo(base, altezza);
					figuraList.add(f1);
					break;
				case 2:
					System.out.print("Inserire lato Quadrato ");
					double lato = input.nextDouble();
					Figura f2 = new Quadrato(lato);
					figuraList.add(f2);
					break;
			}
		} while(n != 0);
		Collections.sort(figuraList);
		for(Figura f: figuraList) {
			System.out.println(f);
			System.out.println("area = " + f.getArea());
		}
	}
}
