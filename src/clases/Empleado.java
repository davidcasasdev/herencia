package clases;

public class Empleado {

	private String nombre;
	private String apellidos;
	private int edad;
	private double salario;
	private int antiguedad;
	
	public static final double PORCENTAJETRIENIOS = 0.05;
	public static final double PORCENTAJETRIENIOS2 = 0.08;
	
	
	public Empleado () {
		this.nombre="";
		this.apellidos="";
		this.edad=0;
		this.salario=0;
		this.antiguedad=0;
	}


	public Empleado(String nombre, String apellidos, int edad, 
			        double salario, int antiguedad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	
	public Empleado (Empleado copia) {
		this.nombre = copia.nombre;
		this.apellidos = copia.apellidos;
		this.edad = copia.edad;
		this.salario = copia.salario;
		this.antiguedad = copia.antiguedad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad=" + antiguedad + "]";
	}


	public double calculaTrienios() {
		int numTrienios = this.antiguedad/3;
		double trienios = 0;
		if (numTrienios<5) {
			trienios = this.salario*PORCENTAJETRIENIOS;
		} else {
			trienios = this.salario*PORCENTAJETRIENIOS2;
		}
		return trienios;
	}
	
	public double calculaSalario() {
		return this.salario+calculaTrienios();
	}
	
	
	
	
}
