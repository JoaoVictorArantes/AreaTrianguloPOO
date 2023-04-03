package Program;

import java.util.Scanner;

import Entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		//AQUI EU CRIO 2 OBJETOS DA CLASSE TRIANGULO
		Triangulo triangulo1 = new Triangulo();
		Triangulo triangulo2 = new Triangulo();
		
		System.out.println("Digite a primeira medida do triangulo: ");
		triangulo1.x = scanner.nextDouble();
		
		System.out.println("Digite a segunda medida do triangulo: ");
		triangulo1.y = scanner.nextDouble();
				
		System.out.println("Digite a terceira medida do triangulo: ");
		triangulo1.z = scanner.nextDouble();
		
		
		System.out.println("Digite a primeira medida do triangulo: ");
		triangulo2.x = scanner.nextDouble();
		
		System.out.println("Digite a segunda medida do triangulo: ");
		triangulo2.y = scanner.nextDouble();
				
		System.out.println("Digite a terceira medida do triangulo: ");
		triangulo2.z = scanner.nextDouble();
						
		//AQUI EU CHAMO O METODO QUE CALCULA A AREA
		double area = triangulo1.area();
		double area2 = triangulo2.area();
		
		//AQUI EU CHAMO O METODO QUE COMPARA QUAL DAS AREAS SÃO MAIORES
		double maior = Triangulo.compara(area, area2);
		
		//AQUI MOSTRO O RESULTADO FORMATADO EMBORA SEJA "INUTIL"
		Triangulo.mostraResultado(maior, area, area2);
		
		scanner.close();

	}

}
