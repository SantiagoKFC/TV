package Televisor;

public class tv {
	public tv(String marca, String conexion, int tamaño, int canal, boolean sonido, boolean power) {
		super();
		Marca = marca;
		this.conexion = conexion;
		this.tamaño = tamaño;
		this.canal = canal;
		this.sonido = sonido;
		this.power = power;
	}
	private String Marca, conexion;
	private int tamaño, canal;
	private boolean sonido, power;
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getConexion() {
		return conexion;
	}
	public void setConexion(String conexion) {
		this.conexion = conexion;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public boolean isSonido() {
		return sonido;
	}
	public void setSonido(boolean sonido) {
		this.sonido = sonido;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	

}

