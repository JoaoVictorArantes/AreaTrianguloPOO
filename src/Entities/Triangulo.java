package Entities;

import java.text.DecimalFormat;

public class Triangulo {
	
	//ESSE "OBJETO" FORMATA AS CASAS DECIMAIS DO DOUBLE NO FORMATO SELECIONADO
	//OU EU POSSO COLOCAR "%.4F%N" PARA LIMITAR AS CASAS DECIMAIS PARA 4
	//EX: System.out.printf("A maior area é: %.4f%n" + area);
	public static final DecimalFormat formato = new DecimalFormat("0.00");
			
	public double x;
	public double y;
	public double z;
		
	public double area() {
		
		double area, p;
		
		p = (x+y+z)/2;
			
		area = Math.sqrt(p*(p-x)*(p-y)*(p-z));
			
		return area;
	}
		
	public static double compara(double area, double area2) {
			
		double maior;
		if (area > area2) {
			maior = area;
		}
		else {
			maior = area2;
		}
			
		return maior;
	}
		
	public static void mostraResultado(double valor, double area, double area2) {
		System.out.println("A maior area é: " + formato.format(valor));
		System.out.println("A area do primeiro triangulo é: " + formato.format(area));
		System.out.println("A area do segundo triangulo é: " + formato.format(area2));
	}		
}
