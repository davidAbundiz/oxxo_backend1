package mx.edu.itlapiedad.models;

public class Productos {
int id;
String descripcion;
float precio;
String codigo_barras;
int existencia;

public Productos() {
	super();
}

public Productos(int id, String descripcion, float precio, String codigo_barras, int existencia) {
	super();
	this.id = id;
	this.descripcion = descripcion;
	this.precio = precio;
	this.codigo_barras = codigo_barras;
	this.existencia = existencia;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

public String getCodigo_barras() {
	return codigo_barras;
}

public void setCodigo_barras(String codigo_barras) {
	this.codigo_barras = codigo_barras;
}

public int getExistencia() {
	return existencia;
}

public void setExistencia(int existencia) {
	this.existencia = existencia;
}




}


