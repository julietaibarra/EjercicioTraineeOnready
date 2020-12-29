package logica;

import java.util.ArrayList;
import java.util.Collections;

public class Catalogo  {
	private ArrayList<Vehiculo> vehiculos;


	public Catalogo(ArrayList<Vehiculo> vehiculos) {
	
		this.vehiculos = vehiculos;
	}

	public Vehiculo mayorPrecio() {
		return Collections.max(vehiculos, (uno, otro) -> {
			return  uno.getPrecio() <otro.getPrecio() ? -1 
					   :(uno.getPrecio()== otro.getPrecio()? 0 :1);
				});
	}
	
	public Vehiculo menorPrecio() {
		return Collections.min(vehiculos, (uno, otro) -> {
			return  uno.getPrecio() <otro.getPrecio() ? -1 
					   :(uno.getPrecio()== otro.getPrecio()? 0 :1);
				});
	}
	
	
	public void ordenarVehiculosPorMayorPrecio() {
		vehiculos.sort((uno, otro) -> {
			return  uno.getPrecio() <otro.getPrecio() ? 1 
				   :(uno.getPrecio()== otro.getPrecio()? 0 :-1);
			});
	}
	
	public Vehiculo contieneLaLetraEnElMod(char letra) {
		Vehiculo ret = null;
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo.getModelo().indexOf(letra)!=-1) {
				ret=vehiculo;
				break;
				
			}
		}
		return ret;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	@Override
	public String toString() {
		StringBuilder stri=new StringBuilder();
		for (Vehiculo ret : vehiculos) {
			stri.append(ret.getMarca());
			stri.append(" ");
			stri.append(ret.getModelo());	
			stri.append("\n");
		}
		return stri.toString();
	}	

}
