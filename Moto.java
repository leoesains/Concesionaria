package concesionaria;

import java.text.NumberFormat;

public class Moto extends Vehiculo {

	private int cilindrada;
	
	public Moto (String marca, String modelo, double precio, int cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return this.cilindrada;
	}
	
	public String toString() {
		double importe = super.getPrecio();
		NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
		return "Marca: " + super.getMarca() + " // " + "Modelo: " + super.getModelo() + " // " + "Cilindrada: " + this.getCilindrada() + "cc" + " // " + "Precio: $" + formatoImporte.format(importe);
	}
}
