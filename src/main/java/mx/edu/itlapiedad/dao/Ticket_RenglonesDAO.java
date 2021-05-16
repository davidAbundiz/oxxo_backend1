package mx.edu.itlapiedad.dao;

import java.util.List;
import mx.edu.itlapiedad.models.Ticket_Renglones;


public interface Ticket_RenglonesDAO {
	public List<Ticket_Renglones>consultar();
	public void insertar(Ticket_Renglones ticket_renglones);
	public Ticket_Renglones buscar(int id);
	public void eliminar(int id);
	public void actualizar(Ticket_Renglones ticket_renglones);
}
