package concesionaria;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
		
		Auto a1 = new Auto("Peugeot", "206", 200000, 4);
		Moto m1 = new Moto("Honda", "Titan", 60000, 125);
		Auto a2 = new Auto("Peugeot", "208", 250000, 4);
		Moto m2 = new Moto("Yamaha", "YBR", 80500.50, 160);
		
		listaVehiculos.add(a1);
		listaVehiculos.add(m1);
		listaVehiculos.add(a2);
		listaVehiculos.add(m2);
		
		Concesionaria c = new Concesionaria(listaVehiculos);

		for (Vehiculo vehiculo: c.getVehiculos()) {
			System.out.println(vehiculo);
		}
		
		System.out.println("==============================");
		
		System.out.println("Vehículo más caro: " + c.masCaro().getMarca() + " " + c.masCaro().getModelo());
		
		System.out.println("Vehículo más barato: " + c.masBarato().getMarca() + " " + c.masBarato().getModelo());
		
		String palabraBuscada = "Y";
		ArrayList<Vehiculo> listaVehiculosCumplen = c.continePalabraEnModelo(palabraBuscada);
		for (Vehiculo vehiculo: listaVehiculosCumplen) {
			double importe = vehiculo.getPrecio();
			NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
			System.out.println("Vehículo que contiene en el modelo la letra " + "'" + palabraBuscada + "'" + ": " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " " + formatoImporte.format(importe));
		}
		
		System.out.println("==============================");
		
		System.out.println("Vehículos ordenados por precio de mayor a menos:");
		ComparadorPorPrecio cp = new ComparadorPorPrecio();
		ComparadorReversa cr = new ComparadorReversa(cp);
		ArrayList<Vehiculo> listaVehiculosOrdenada = c.listarOrdenado(cr);
		for (Vehiculo vehiculo: listaVehiculosOrdenada) {
			System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
		}
		
	}

}
