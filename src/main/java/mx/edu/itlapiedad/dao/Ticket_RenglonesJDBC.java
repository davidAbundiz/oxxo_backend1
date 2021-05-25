package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import mx.edu.itlapiedad.models.Ticket_Renglones;

@Repository
public class Ticket_RenglonesJDBC implements Ticket_RenglonesDAO{
	@Autowired
	JdbcTemplate oxxo_db;
	
	String sql;
	
	public List<Ticket_Renglones>consultar(){
		// Consulta Ticket_Renglones de Oxxo
			sql = "SELECT * FROM ticket_renglones";
			return oxxo_db.query(sql, new Ticket_RenglonesRM());
	}
	@Override
	public void insertar(Ticket_Renglones ticket_renglones) {
		// Insertar Ticket_Renglones de Oxxo
		sql = "INSERT INTO ticket_renglones (TICKET_id, PRODUCTO_id, cantidad, precio) "
				+ "VALUES (?, ?, ?, ?)";
		oxxo_db.update(sql, ticket_renglones.getTICKET_id(), ticket_renglones.getPRODUCTO_id(), 
				ticket_renglones.getCantidad(), ticket_renglones.getPrecio());
	}
	@Override
	public Ticket_Renglones buscar(int id) {
		// 	Buscar Ticket_Renglones de Oxxo
		sql = "SELECT * FROM ticket_renglones WHERE id = ?";
		return oxxo_db.queryForObject(sql, new Ticket_RenglonesRM(), id);
	}
	@Override
	public void actualizar(Ticket_Renglones ticket_renglones) {
		String sql_update = "UPDATE ticket_renglones SET cantidad = ?, precio = ?, TICKET_id=?, PRODUCTO_id=? " + " WHERE id = ?";
		oxxo_db.update(sql_update,
				ticket_renglones.getCantidad(), 
				ticket_renglones.getPrecio(),
				ticket_renglones.getTICKET_id(), 
				ticket_renglones.getPRODUCTO_id(), 
				ticket_renglones.getId());
		
		

	}
	@Override
	public void eliminar(int id) {
		// Eliminar Ticket_Renglones de Oxxo
		sql = "DELETE FROM ticket_renglones WHERE id = ?";
		oxxo_db.update(sql, id);
	}

}
