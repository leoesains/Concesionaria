package concesionaria;

import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
		if (vehiculo1.getPrecio() < vehiculo2.getPrecio())
			return -1;
		if (vehiculo1.getPrecio() > vehiculo2.getPrecio())
			return 1;
		return 0;
	}

}
