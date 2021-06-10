package mx.edu.itlapiedad.models;

public class Ticket_renglones_importe {
	private int id;
	private float importe;
	private String fecha_hora;
	
	
	
	public Ticket_renglones_importe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Ticket_renglones_importe(int id, float importe, String fecha_hora) {
		super();
		this.id = id;
		this.importe = importe;
		this.fecha_hora = fecha_hora;
	}



	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
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

	public void setFecha_hora(Object object) {
		this.fecha_hora = (String) object;
	}
}
