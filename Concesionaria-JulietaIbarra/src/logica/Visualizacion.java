package logica;

import java.util.ArrayList;

public class Visualizacion {

	public static void main(String[] args) {
		Catalogo catalogo;
		ArrayList<Vehiculo> vehiculos= new ArrayList<>();
		vehiculos.add(new Auto("Peugeot", "206", 4, 200000.00));
		vehiculos.add(new Moto("Honda", "Titan", 125, 60000.00));
		vehiculos.add(new Auto("Peugeot", "208", 4, 250000.00));
		vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));
		
		catalogo= new Catalogo(vehiculos);
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.mostrarCaracteristicas());
		}
		System.out.println("=============================");
		Vehiculo masCaro=catalogo.mayorPrecio();
		System.out.println("Vehículo más caro:" +masCaro.getMarca()+" "+masCaro.getModelo());
		Vehiculo masBarato=catalogo.menorPrecio();
		System.out.println("Vehículo más Barato:"+ masBarato.getMarca()+" "+masBarato.getModelo());
		Vehiculo conLetra=catalogo.contieneLaLetraEnElMod('Y');
		System.out.println("Vehículo que contiene en el modelo la letra 'Y': " +conLetra.getMarca()+" "+conLetra.getModelo()+""+conLetra.getPrecio());

		System.out.println("=============================");
		System.out.println("Vehículo ordenados por precio de mayor a menor: ");
		catalogo.ordenarVehiculosPorMayorPrecio();
		System.out.println(catalogo.toString());


	}

}
