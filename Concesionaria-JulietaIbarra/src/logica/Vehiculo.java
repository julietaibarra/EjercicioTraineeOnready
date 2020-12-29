package logica;

public abstract class Vehiculo{
	protected String marca;
	protected String modelo;
	protected double precio;
	public Vehiculo(String marca, String modelo, double precio) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public abstract String getMarca();

	public abstract void setMarca(String marca);


	public abstract String getModelo();


	public abstract void setModelo(String modelo);


	public abstract double getPrecio();


	public abstract void setPrecio(double precio);
	


	public abstract String mostrarCaracteristicas();
	

}
