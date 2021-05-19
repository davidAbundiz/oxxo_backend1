package mx.edu.itlapiedad.models;

import java.util.List;

public class Tickets {
int id;
String fecha;
Float Total;
int CAJERO_id;

public Tickets() {
	super();
	// TODO Auto-generated constructor stub
}

public Tickets(int id, String fecha, Float total, int cAJERO_id) {
	super();
	this.id = id;
	this.fecha = fecha;
	Total = total;
	CAJERO_id = cAJERO_id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public Float getTotal() {
	return Total;
}

public void setTotal(Float total) {
	Total = total;
}

public int getCAJERO_id() {
	return CAJERO_id;
}

public void setCAJERO_id(int cAJERO_id) {
	CAJERO_id = cAJERO_id;
}

public List<Tickets> consultarT() {
	// TODO Auto-generated method stub
	return null;
}

}
