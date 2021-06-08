package mx.edu.itlapiedad.dao;

import java.util.List;
import mx.edu.itlapiedad.models.Ticket_Renglones;
import mx.edu.itlapiedad.models.Ticket_renglones_importe;


public interface Ticket_RenglonesDAO {
	public List<Ticket_Renglones>consultar();
	public void insertar(Ticket_Renglones ticket_renglones);
	public Ticket_Renglones buscar(int id);
	public void eliminar(int id);
	public void actualizar(Ticket_Renglones ticket_renglones);
	List<Ticket_renglones_importe> buscar_importe_cajero(int id);
}
