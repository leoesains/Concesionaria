package concesionaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Concesionaria {

	private ArrayList<Vehiculo> vehiculos;
	
	public Concesionaria (ArrayList<Vehiculo> listaDeVehiculos) {
		this.vehiculos = listaDeVehiculos;
	}
	
	public void addVehiculo(Vehiculo nuevoVehiculo) {
		this.vehiculos.add(nuevoVehiculo);
	}
	
	public ArrayList<Vehiculo> getVehiculos(){
		ArrayList<Vehiculo> copia = new ArrayList<>();
		copia.addAll(this.vehiculos);
		return copia;
	}
	
	public Vehiculo masCaro() {
		ArrayList<Vehiculo> listaDeVehiculos = this.getVehiculos();
		Vehiculo vehiculoMasCaro = listaDeVehiculos.remove(0);
		for (Vehiculo vehiculo: listaDeVehiculos) {
			if (vehiculo.esMasCaroQue(vehiculoMasCaro))
				vehiculoMasCaro = vehiculo;
		}
		return vehiculoMasCaro;
	}
	
	public Vehiculo masBarato() {
		ArrayList<Vehiculo> listaDeVehiculos = this.getVehiculos();
		Vehiculo vehiculoMasBarato = listaDeVehiculos.remove(0);
		for (Vehiculo vehiculo: listaDeVehiculos) {
			if (!vehiculo.esMasCaroQue(vehiculoMasBarato))
				vehiculoMasBarato = vehiculo;
		}
		return vehiculoMasBarato;
	}
	
	public ArrayList<Vehiculo> continePalabraEnModelo(String palabra) {
		ArrayList<Vehiculo> listaDeVehiculos = this.getVehiculos();
		ArrayList<Vehiculo> listaCumplen = new ArrayList<>();
		for (Vehiculo vehiculo: listaDeVehiculos) {
			if (vehiculo.contienePalabraEnModelo(palabra))
				listaCumplen.add(vehiculo);
		}
		return listaCumplen;
	}
	
	public ArrayList<Vehiculo> listarOrdenado(Comparator<Vehiculo> comparador) {
		ArrayList<Vehiculo> salida = this.getVehiculos();
		Collections.sort(salida, comparador);
		return salida;
	}
}
