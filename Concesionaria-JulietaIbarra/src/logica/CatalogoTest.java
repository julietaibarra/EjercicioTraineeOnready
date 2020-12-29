package logica;

import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.Before;
import org.junit.Test;

public class CatalogoTest {
	private Catalogo catalogo;
	@Before
	public void  inicializacion() {
		ArrayList<Vehiculo> vehiculos= new ArrayList<>();
		vehiculos.add(new Auto("Peugeot", "206", 4, 200000.00));
		vehiculos.add(new Moto("Honda", "Titan", 125, 60000.00));
		vehiculos.add(new Auto("Peugeot", "208", 4, 250000.00));
		vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));
		
		catalogo= new Catalogo(vehiculos);
	}
	

	@Test
	public void testMayorPrecio() {
		Auto esperado=new Auto("Peugeot", "208", 4, 250000.00);
		assertEquals(esperado, catalogo.mayorPrecio());
		
	}
	@Test
	public void testMenorPrecio() {
		Moto esperado=(new Moto("Honda", "Titan", 125, 60000.00));
		assertEquals(esperado, catalogo.menorPrecio());
		
	}
	
	@Test
	public void testTieneLaLetra() {
		Moto esperado=(new Moto("Yamaha", "YBR", 160, 80500.50));
		assertEquals(esperado, catalogo.contieneLaLetraEnElMod('Y'));
		
	}
	
}
