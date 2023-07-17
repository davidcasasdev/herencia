package ppal;

import java.util.ArrayList;

import clases.Comercial;
import clases.Empleado;

public class Principal {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Antonio","López",20,1800,4);
		
		System.out.println("El empleado es "+e1);
		
		System.out.println("Tiene de trienios "+e1.calculaTrienios());
		
		System.out.printf("El empleado %s %s tiene un salario de %.2f"
				+ " un valor por trienios de %.2f y un total de %.2f\n",
				e1.getNombre(), e1.getApellidos(), e1.getSalario(),
				e1.calculaTrienios(),e1.calculaSalario());
		
		Comercial c = new Comercial("Ana", "Gonzalez", 25, 2000, 2, 0 );
	
		
		System.out.println("El comercial es "+c);
		
		
		
		System.out.println("Añadiendo 3 ventas...");
		c.contabilizaVentas(3);
		
		System.out.printf("El comercial %s %s tiene un salario de %.2f"
				+ " un valor por trienios de %.2f y un total de %.2f",
				c.getNombre(), c.getApellidos(), c.getSalario(),
				c.calculaTrienios(),c.calculaSalario());
		
		Empleado e = new Empleado(c);
		System.out.println("\n"+e);
		System.out.println("El salario del empleado es "+e.calculaSalario());
		
		
		ArrayList<Empleado> lista= new ArrayList<Empleado> ();
		
		lista.add(e);
	
		lista.add(c);
		
		Empleado c2 = new Comercial();
		
		// Comercial c3 = new Empleado();

	}

}
