package concesionaria;

import java.util.Comparator;

public class ComparadorReversa implements Comparator<Vehiculo>{

	private Comparator<Vehiculo> comparador;
	
	public ComparadorReversa(Comparator<Vehiculo> comparador) {
		this.comparador = comparador;
	}
	
	@Override
	public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
		return this.comparador.compare(vehiculo1, vehiculo2) * (-1);
	}

}
