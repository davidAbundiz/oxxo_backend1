package mx.edu.itlapiedad.models;

public class Tickets {
int id;
String fecha_hora;
Float total;
int CAJERO_id;

public Tickets() {
	super();
}

public Tickets(int id, String fecha_hora, Float total, int cAJERO_id) {
	super();
	this.id = id;
	this.fecha_hora = fecha_hora;
	this.total = total;
	CAJERO_id = cAJERO_id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFecha_hora() {
	return fecha_hora;
}

public void setFecha_hora(String fecha_hora) {
	this.fecha_hora = fecha_hora;
}

public Float getTotal() {
	return total;
}

public void setTotal(Float total) {
	this.total = total;
}

public int getCAJERO_id() {
	return CAJERO_id;
}

public void setCAJERO_id(int cAJERO_id) {
	CAJERO_id = cAJERO_id;
}



}
