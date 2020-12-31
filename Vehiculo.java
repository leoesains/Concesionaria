package concesionaria;

public class Vehiculo {

	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo (String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public double getPrecio() {
		return this.precio;
	}

	public boolean esMasCaroQue(Vehiculo vehiculo) {
		return this.getPrecio() >= vehiculo.getPrecio();
	}
	
	public boolean contienePalabraEnModelo(String palabra) {
		return this.getModelo().contains(palabra);
	}
	
}
