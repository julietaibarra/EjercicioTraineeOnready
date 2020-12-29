package logica;

public class Auto extends Vehiculo {
	private int puertas;

	public Auto(String marca, String modelo, int puertas,double precio) {
		super(marca, modelo, precio);
		this.puertas=puertas;
	}

	


	public int getPuertas() {
		return puertas;
	}




	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}




	@Override
	public String getMarca() {
		
		return marca;
	}

	@Override
	public void setMarca(String marca) {
		this.marca=marca;
		
	}



	@Override
	public String getModelo() {
	
		return modelo;
	}



	@Override
	public void setModelo(String modelo) {
		this.modelo=modelo;
		
	}



	@Override
	public double getPrecio() {
	
		return precio;
	}

	@Override
	public void setPrecio(double precio) {
	this.precio=precio;
		
	}
	
	@Override
	public String mostrarCaracteristicas() {
		return "Marca:"+ marca +"// Modelo: "+ modelo+" // Puertas: "+puertas+" // Precio: $"+precio;		
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + puertas;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (puertas != other.puertas)
			return false;
		if (modelo != other.modelo)
			return false;
		if (marca != other.marca)
			return false;
		if (precio != other.precio)
			return false;
		return true;
	}

	
}
