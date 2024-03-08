package Televisor;
public class tv {
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
