package mx.edu.itlapiedad.dao;

import java.util.List;

import mx.edu.itlapiedad.models.Tickets;




public interface TicketDAO {


	public List<Tickets>consultar();
	public void insertar(Tickets tickets);
	public Tickets buscar(int id);
	public void eliminar(int id);
	public void actualizar(Tickets tickets);
}
