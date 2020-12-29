package logica;

public class Moto  extends Vehiculo{
	private int cilindrada;

	public Moto(String marca, String modelo, int cilindra, double precio) {
		super(marca, modelo, precio);
		this.cilindrada= cilindra;
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


	public int getCilindrada() {
		return cilindrada;
	}



	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}



	@Override
	public String mostrarCaracteristicas() {
	return "Marca:"+ marca +"// Modelo: "+ modelo+" // Cilindrada: "+cilindrada+"cc // Precio: $"+precio;
	
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cilindrada;
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
		Moto other = (Moto) obj;
		if (cilindrada != other.cilindrada)
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
