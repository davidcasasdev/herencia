package clases;

public class Comercial extends Empleado {

	private int numVentas;
	
	private static double precioPorVenta=45.90;
	
	public Comercial() {
		super();
		this.numVentas=0;
	}

	public Comercial(String nombre, String apellidos, int edad, double salario, 
			int antiguedad, int numVentas) {
		super(nombre, apellidos, edad, salario, antiguedad);
		this.numVentas = numVentas;
	}

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}

	public static double getPrecioPorVenta() {
		return precioPorVenta;
	}

	// refinamiento
//	@Override
//	public String toString() {
//		return "Comercial [toString()=" + super.toString() + ", numVentas=" + numVentas + "]";
//	}

	// Sobreescribir 
	@Override
	public String toString() {
		return "Comercial [Nombre=" + getNombre() + ", Apellidos=" + getApellidos() + ", Edad="
				+ getEdad() + ", Salario=" + getSalario() +
				", Antiguedad=" + getAntiguedad() + ", numVentas="
				+ numVentas + "]";
	}
	
	public void contabilizaVentas(int num) {
		if (num>7) {
			num=7;
		}
		this.numVentas=this.numVentas+num;
		if (this.numVentas>25) {
			this.numVentas=25;
		}
		//this.numVentas=Math.min(25, this.numVentas+Math.min(7, num));
		
	}
	
	public void reseteaContadorVentas() {
		this.numVentas=0;
	}

	@Override
	public double calculaSalario() {
		return super.calculaSalario()+(this.numVentas*Comercial.precioPorVenta);
	}
	
	
	
	
	
	
	
	


}
