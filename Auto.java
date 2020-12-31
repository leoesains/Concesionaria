package concesionaria;

import java.text.NumberFormat;

public class Auto extends Vehiculo {

	private int puertas;
	
	public Auto (String marca, String modelo, double precio, int puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return this.puertas;
	}
	
	public String toString() {
		double importe = super.getPrecio();
		NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
		return "Marca: " + super.getMarca() + " // " + "Modelo: " + super.getModelo() + " // " + "Puertas: " + this.getPuertas() + " // " + "Precio: " + formatoImporte.format(importe);
	}
	
}
