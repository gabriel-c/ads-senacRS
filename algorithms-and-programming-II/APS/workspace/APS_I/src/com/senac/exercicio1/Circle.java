package com.senac.exercicio1;

public class Circle {
	double a;
	double c;
	double r = 12;

	private void area() {
		this.a = 3.14 * Math.pow(this.r, 2);
	}
	
	private void circunferencia() {
		this.c = 2 * 3.14 * this.r;
	}

	public String toString() {
		this.area();
		this.circunferencia();

		return "Área " + this.a + "\nCircunferência " +  this.c;
	}

}